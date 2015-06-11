package vn.com.vndirect.socialtrading;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.URL;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.sql.Timestamp;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Timer;
import java.util.TimerTask;

import org.codehaus.jackson.JsonGenerationException;
import org.codehaus.jackson.map.JsonMappingException;
import org.codehaus.jackson.map.ObjectMapper;
import org.eclipse.jetty.server.Server;
import org.eclipse.jetty.servlet.ServletContextHandler;
import org.eclipse.jetty.websocket.api.Session;

import spark.Spark;
import vn.com.vndirect.ors.client.api.OrderService;
import vn.com.vndirect.ors.client.api.OrderServiceImpl;
import vn.com.vndirect.ors.client.api.entity.Report;
import vn.com.vndirect.ors.client.api.utils.OrderException;
import vn.com.vndirect.socialtrading.api.ApiHandler;
import vn.com.vndirect.socialtrading.api.LoginHandler;
import vn.com.vndirect.socialtrading.entity.ExecutedOrder;
import vn.com.vndirect.socialtrading.entity.Follower;
import vn.com.vndirect.socialtrading.entity.FollowerEntity;
import vn.com.vndirect.socialtrading.entity.SendOrder;
import vn.com.vndirect.socialtrading.entity.TraderEntity;
import vn.com.vndirect.socialtrading.websocket.StockServiceSocketServlet;

import com.rabbitmq.client.Channel;
import com.rabbitmq.client.Connection;
import com.rabbitmq.client.ConnectionFactory;
import com.rabbitmq.client.ConsumerCancelledException;
import com.rabbitmq.client.QueueingConsumer;
import com.rabbitmq.client.ShutdownSignalException;


public class App {

	public static void main(String[] args) throws Exception {
		Config.loadConfig();
		App app = null;
		Spark.externalStaticFileLocation("src/main/webapp/dist");
		new ApiHandler();
		new LoginHandler();

		TimerTask task = new UpdateProfitTask();
		Timer timer = new Timer();
		timer.schedule(task, 1000, 6000);

		try {
			app = new App();
			app.run();
		} catch (IOException e) {
			e.printStackTrace();
		}

		//websocket 
		Server server = new Server(Config.PORT_WEBSOCKET);
	    ServletContextHandler ctx = new ServletContextHandler();
	    ctx.setContextPath("/");
	    ctx.addServlet(StockServiceSocketServlet.class, "/stocks");
	    server.setHandler(ctx);
	    server.start();
	    server.join();
	}
	
	private ObjectMapper mapper;
	private OrderService orderService;
	private QueueingConsumer consumerSent;
	private QueueingConsumer consumerExecuted;
	private QueueingConsumer consumerExpired;
	private java.sql.Connection connection = null;

	public static Map<String, List<Follower>> mapOfTrader; // map signalprovider
															// id with
	// list of follower
	public static Map<String, Integer> listOfStock; // list all stocks with its risks

	public static Map<String, TraderEntity> listOfTraderEntity; // list all
																// trader entity

	public static Map<String, FollowerEntity> listOfFollowerEntity; // list all
																	// follower
																	// entity

	public static Map<String, List<String>> OrderPendingMap; // map
																// signalprovider's
	// order with list of
	// follower's orders

	public static Map<String, String> OrderPendingFollower; // map order
															// generated by
															// follower with
															// account of trader

	public static List<String> OrderPendingList; // list all order pending of
													// trader and follower
	public static Map<String, Session> mapOfSession;
	
	public App() throws IOException {
		ConnectionFactory factory = new ConnectionFactory();
		factory.setHost(Config.RABBIT_HOST);
		factory.setPort(Config.RABBIT_PORT);
		factory.setUsername(Config.RABBIT_USERNAME);
		factory.setPassword(Config.RABBIT_PASSWORD);
		Connection conn = factory.newConnection();

		consumerSent = defineConsumer(Config.QUEUE_NAME_SENT,
				Config.EXCHANGE_NAME_SENT, conn);
		consumerExecuted = defineConsumer(Config.QUEUE_NAME_EXECUTED,
				Config.EXCHANGE_NAME_EXECUTED, conn);
		
		consumerExpired = defineConsumer(Config.QUEUE_NAME_EXPIRED,
				Config.EXCHANGE_NAME_EXPIRED, conn);

		mapper = new ObjectMapper();
		orderService = new OrderServiceImpl();
		mapOfTrader = new HashMap<String, List<Follower>>();
		listOfStock = new HashMap<String, Integer>();
		listOfTraderEntity = new HashMap<String, TraderEntity>();
		OrderPendingMap = new HashMap<String, List<String>>();
		OrderPendingList = new ArrayList<String>();
		OrderPendingFollower = new HashMap<String, String>();
		listOfFollowerEntity = new HashMap<String, FollowerEntity>();
		mapOfSession = new HashMap<String, Session>() ;
		
		reloadData();
		run();
	}

	public void run() {
		Thread t1 = new Thread(new Runnable() {
			public void run() {
				try {
					while (true) {
						processMessageSent();
					}
				} catch (ShutdownSignalException e) {
					e.printStackTrace();
				} catch (ConsumerCancelledException e) {
					e.printStackTrace();
				} catch (InterruptedException e) {
					e.printStackTrace();
				} catch (SQLException e) {
					e.printStackTrace();
				}
			}
		});
		t1.start();

		Thread t2 = new Thread(new Runnable() {
			public void run() {
				try {
					while (true) {
						processMessageExecuted();
					}
				} catch (ShutdownSignalException e) {
					e.printStackTrace();
				} catch (ConsumerCancelledException e) {
					e.printStackTrace();
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			}
		});
		t2.start();
		
		Thread t3 = new Thread(new Runnable() {
			public void run() {
				try {
					while (true) {
						processMessageExpired();
					}
				} catch (ShutdownSignalException e) {
					e.printStackTrace();
				} catch (ConsumerCancelledException e) {
					e.printStackTrace();
				} catch (InterruptedException e) {
					e.printStackTrace();
				} catch (SQLException e) {
					e.printStackTrace();
				}
			}
		});
		t3.start();
	}

	private void reloadData() {
		Statement stmt = null;
		try {
			Class.forName("org.postgresql.Driver");
			connection = DriverManager.getConnection(Config.DB_URL,
					Config.DB_USERNAME, Config.DB_PASSWORD);

			stmt = connection.createStatement();

			String sql = "SELECT * FROM (SELECT * FROM following, account WHERE following.id = account.id ORDER BY following.traderid asc) tb1 LEFT JOIN "
					+ "(SELECT transactionid, count(*) AS currentopen, sum(quantity * price) AS cost FROM transaction, orderlist WHERE transaction.orderid = orderlist.orderid"
					+ " GROUP BY transactionid) tb2  ON tb1.transactionid = tb2.transactionid";

			ResultSet rs = stmt.executeQuery(sql);
			List<Follower> listOfFollower = new ArrayList<Follower>();

			PreparedStatement stmt1 = connection
					.prepareStatement("SELECT stock, quantity, transaction.orderid "
							+ "FROM following, account, transaction, orderlist "
							+ "WHERE following.id = account.id"
							+ "  AND transaction.orderid = orderlist.orderid	"
							+ "  AND following.transactionid = transaction.transactionid "
							+ "  AND following.traderid = ?"
							+ "  AND account.id = ?");

			while (rs.next()) {
				String traderid = rs.getString("traderid").trim();
				if (!mapOfTrader.containsKey(traderid)) {
					listOfFollower = new ArrayList<Follower>();
					mapOfTrader.put(traderid, listOfFollower);
				}

				String followerId = rs.getString("id");
				int maxOpen = rs.getInt("maxopen");
				float moneyAllocate = rs.getFloat("moneyallocate");
				int currentOpen = rs.getInt("currentopen");
				float currentSpend = rs.getFloat("cost");
				int riskFactor = rs.getInt("risk_factor");
				float cash = rs.getFloat("cash");

				if (!listOfFollowerEntity.containsKey(followerId)) {
					listOfFollowerEntity.put(followerId, new FollowerEntity(
							followerId, cash, riskFactor));
				}

				Map<String, Integer> mapStockQuantityFollow = new HashMap<String, Integer>();
				Map<String, String> mapStockOrderFollow = new HashMap<String, String>();

				stmt1.setString(1, traderid);
				stmt1.setString(2, followerId);

				ResultSet rs1 = stmt1.executeQuery();
				while (rs1.next()) {
					mapStockQuantityFollow.put(rs1.getString("stock").trim(),
							rs1.getInt("quantity"));
					mapStockOrderFollow.put(rs1.getString("stock").trim(),
							rs1.getString("orderid"));
				}
				rs1.close();

				listOfFollower.add(new Follower(followerId, maxOpen,
						currentOpen, moneyAllocate, currentSpend,
						mapStockQuantityFollow, mapStockOrderFollow));
			}

			stmt1.close();

			sql = "select * from  stockrisk";
			rs = stmt.executeQuery(sql);
			while (rs.next()) {
				String stock = rs.getString("stock").trim();
				int riskFactor = rs.getInt("risk");
				listOfStock.put(stock, riskFactor);
			}

			sql = "SELECT * FROM trader "
					+ "LEFT JOIN "
					+ "(SELECT id, sum(quantity * cost) AS totalcost FROM portfolio GROUP BY id) tb2 "
					+ "ON trader.traderid = tb2.id";
			rs = stmt.executeQuery(sql);

			while (rs.next()) {
				String traderid = rs.getString("traderid").trim();
				int numberFollow = rs.getInt("numberfollow");
				float moneyfollow = rs.getFloat("monneyfollow");
				float cash = rs.getFloat("cash");
				float stockOnhandValue = rs.getFloat("totalcost");

				listOfTraderEntity.put(traderid, new TraderEntity(traderid,
						numberFollow, moneyfollow, cash, stockOnhandValue));
			}

			rs.close();
			stmt.close();

		} catch (Exception e) {
			System.err.println(e.getClass().getName() + ": " + e.getMessage());
			System.exit(0);
		}

		// OrderPendingList.add("143279719767912");
		// OrderPendingFollower.put("143279719767912", "0001011079");
	}

	public QueueingConsumer defineConsumer(String queueName,
			String exchangeName, Connection conn) throws IOException {
		Channel channel = conn.createChannel();
		channel.queueDeclare(queueName, false, false, false, null);
		channel.queueBind(queueName, exchangeName, "");

		QueueingConsumer consumer = new QueueingConsumer(channel);
		channel.basicConsume(queueName, true, consumer);
		return consumer;
	}

	public static int getFloorPrice(String symbol) throws IOException {
		String link = "http://10.26.0.165:8000/sInfo?sym=" + symbol + "&ex="+ 2; // 1 cho hcm, 2 cho hn
		URL url = new URL(link);
		BufferedReader br = new BufferedReader(new InputStreamReader(
				url.openStream()));
		String strTemp = br.readLine();
		int start = strTemp.indexOf("floorPx");
		String floorPrice = strTemp.substring(start + 9, start + 17);
		return Integer
				.parseInt(floorPrice.substring(0, floorPrice.indexOf(",")));
	}

	public List<SendOrder> replicateOrderForFollowers(SendOrder order) {
		String acc = order.getAccount();
		String orderId = order.getOrderId();
		List<SendOrder> followerOrders = new ArrayList<SendOrder>();

		// Proceed if we are managing the trader who placed this order
		if (mapOfTrader.containsKey(acc)) {
			OrderPendingList.add(orderId);

			// Get his followers
			List<Follower> listOfFollower = mapOfTrader.get(acc);
			List<String> listOfOrderFollow = new ArrayList<String>();

			if (!OrderPendingMap.containsKey(orderId))
				OrderPendingMap.put(orderId, listOfOrderFollow);

			int side = order.getSide();
			String symbol = order.getSymbol();
			int price = order.getPrice();
			int quantity = order.getQty();
			int stockrisk = listOfStock.get(symbol);
			TraderEntity myTrader = listOfTraderEntity.get(acc);

			double percentStock = (myTrader.getStockOnhandValue() + price
					* quantity)
					/ (myTrader.getStockOnhandValue() + myTrader.getCash());

			// For each follower, duplicate the order made by the trader, with
			// some necessary adjustments
			for (Follower f : listOfFollower) {
				// check follower neu Riskfactor < riskfactor cua ma CK can
				// mua thi bo qua
				// FIXME Needs test
				if (side == 1
						&& listOfFollowerEntity.get(f.getId()).getRiskfactor() < stockrisk)
					continue;

				// check follower neu da mua nhieu hon muc cho phep thi bo
				// qua
				// FIXME Needs test
				if (side == 1 && f.getMaxopen() <= f.getCurrentOpen())
					continue;

				Map<String, Integer> mapStockFollow = null;
				// lenh ban, check follower neu khong co CK thi bo qua
				if (side == 2) {
					mapStockFollow = f.getMapStockQuantityFollow();
					if (!mapStockFollow.containsKey(symbol))
						continue;
				}

				try {
					price = getFloorPrice(symbol);
					SendOrder orderByThisFollower = new SendOrder();
					orderByThisFollower.setAccount(f.getId());
					orderByThisFollower.setSide(order.getSide());
					orderByThisFollower.setType(order.getType());
					orderByThisFollower.setSymbol(symbol);
					orderByThisFollower.setPrice(price);

					if (side == 1) {
						int quantityRecalculate = (int) ((percentStock
								* f.getMoneyAllocate() - f.getCurrentAllocate()) / price);
						int round_number = quantityRecalculate / 100;
						if (round_number < 1)
							round_number = 1;
						quantityRecalculate = round_number * 100;

						orderByThisFollower.setQty(quantityRecalculate);

					} else {
						int quantityOnHand = mapStockFollow.get(symbol);
						orderByThisFollower.setQty(quantityOnHand);
					}

					followerOrders.add(orderByThisFollower);
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
		}

		return followerOrders;
	}

	public void processMessageSent() throws ShutdownSignalException,
			ConsumerCancelledException, InterruptedException, SQLException {
		QueueingConsumer.Delivery delivery = consumerSent.nextDelivery();
		String message = new String(delivery.getBody());
		System.out.println(message);
		SendOrder orderByTrader = null;

		try {
			orderByTrader = mapper.readValue(message, SendOrder.class);
			List<SendOrder> followerOrders = replicateOrderForFollowers(orderByTrader);

			for (SendOrder followerOrder : followerOrders) {
				try {
					String accountOfFollower = followerOrder.getAccount();
					Report report = orderService
							.executePlaceOrder(accountOfFollower,
									Integer.toString(followerOrder.getSide())
											.charAt(0),
									followerOrder.getType() == 1 ? "MP" : "LO",
									followerOrder.getSymbol(), followerOrder
											.getPrice(), followerOrder.getQty());

					String order_id_return = report.getMessage();
					System.out.println("Print order id: " + order_id_return);
					System.out.println("Print report.getStatus()  id: "
							+ report.getStatus());

					// check lenh khong bi loi
					if (report.getStatus() != false) {
						OrderPendingList.add(order_id_return);
						OrderPendingFollower.put(order_id_return,orderByTrader.getAccount());
						
						SimpleDateFormat formatTime = new SimpleDateFormat("hh:mm:ss");
						DateFormat dateFormat = new SimpleDateFormat("yyyyMMdd-hh:mm:ss");
						Date date = new Date();
						//send thong tin lenh cho follower
						Session clientSession = mapOfSession.get(followerOrder.getAccount());
						if(clientSession !=null) {
							String msgPush = "SentOrder:" + order_id_return
									+ "," + followerOrder.getSide() + ","
									+ followerOrder.getType() + ","
									+ followerOrder.getSymbol() + ","
									+ followerOrder.getPrice() + ","
									+ followerOrder.getQty() + ","
									+ dateFormat.format(date);

							clientSession.getRemote().sendString(msgPush);
						}
						// update account
						if (followerOrder.getSide() == 1) {
							PreparedStatement accountUpdateSt = connection
									.prepareStatement("UPDATE account SET cash = ? WHERE id = ?");
							accountUpdateSt.setString(2, accountOfFollower);

							float cashUpdate = listOfFollowerEntity.get(
									accountOfFollower).getCash()
									- followerOrder.getPrice()
									* followerOrder.getQty();
							listOfFollowerEntity.get(accountOfFollower)
									.setCash(cashUpdate);

							accountUpdateSt.setFloat(1, cashUpdate);
							accountUpdateSt.executeUpdate();
							accountUpdateSt.close();
						}

						PreparedStatement insertSendOrder = connection
								.prepareStatement("insert into sentorder (orderid,stock,side,quantity,price,type,date,id,transactiontime) values (?,?,?,?,?,?,?,?,?)");
						insertSendOrder.setString(1, order_id_return);
						insertSendOrder.setString(2, followerOrder.getSymbol());
						insertSendOrder.setInt(3, followerOrder.getSide());
						insertSendOrder.setInt(4, followerOrder.getQty());
						insertSendOrder.setInt(5, followerOrder.getPrice());
						insertSendOrder.setInt(6, followerOrder.getType());
						//Timestamp sentDate = convertToSqlDate(dateFormat.format(date));
						//insertSendOrder.setTimestamp(7, sentDate);
						insertSendOrder.setDate(7, new java.sql.Date(date.getTime()));
						insertSendOrder.setString(8, followerOrder.getAccount());
						insertSendOrder.setString(9, formatTime.format(date));
						
						insertSendOrder.executeUpdate();
						insertSendOrder.close();

					}
				} catch (OrderException e) {
					e.printStackTrace();
				}
			}
		} catch (JsonGenerationException e) {
			e.printStackTrace();
		} catch (JsonMappingException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	public java.sql.Timestamp convertToSqlDate(String mydate) {
		SimpleDateFormat formatter = new SimpleDateFormat("yyyyMMdd-hh:mm:ss");
		java.util.Date returnDate = null;
		try {
			returnDate = (java.util.Date) formatter.parse(mydate);
		} catch (ParseException e) {
			e.printStackTrace();
		}
		return new java.sql.Timestamp(returnDate.getTime());
	}

	public void processMessageExecuted() throws ShutdownSignalException,
			ConsumerCancelledException, InterruptedException {
		QueueingConsumer.Delivery delivery = consumerExecuted.nextDelivery();
		String message = new String(delivery.getBody());
		System.out.println(message);
		ExecutedOrder order = null;
		try {
			order = mapper.readValue(message, ExecutedOrder.class);
			String acc = order.getAccount();
			String orderId = order.getOrderId();
			if (OrderPendingList.contains(orderId)) // neu list co order quan
													// tam thi update database
			{
				//send thong tin lenh khop cho follower
				Session clientSession = mapOfSession.get(acc);
				if (clientSession != null) {
					String msgPush = "ExecutedOrder:" + orderId + ","
							+ order.getSide() + "," + order.getSymbol() + ","
							+ order.getMatchedQty() + "," + ","
							+ order.getMatchedPrice() + ","
							+ order.getTransactTime() + ","
							+ order.getTradeDate();

					clientSession.getRemote().sendString(msgPush);
				}
				
				// xu ly khop lenh toan bo
				if (order.getMatchedQty() == order.getQty()) {
					if (listOfTraderEntity.containsKey(acc)) {
						try {
							updateDatabaseAfterExecuted(0, order, connection);
						} catch (SQLException e) {
							e.printStackTrace();
						}
					} else {
						try {
							updateDatabaseAfterExecuted(1, order, connection);
						} catch (SQLException e) {
							e.printStackTrace();
						}
					}
				}
				// neu la lenh mua, xu ly khop lenh 1 phan
			}
		} catch (JsonGenerationException e) {
			e.printStackTrace();
		} catch (JsonMappingException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	public void updateDatabaseAfterExecuted(int type, ExecutedOrder order,
			java.sql.Connection conn) throws SQLException {
		int quantity = order.getMatchedQty();
		int price = order.getMatchedPrice();
		String accountId = order.getAccount();
		String orderId = order.getOrderId();
		String symbol = order.getSymbol();
		Timestamp executedDate = convertToSqlDate(order.getTradeDate());
		Statement st = conn.createStatement();

		// update orderList
		PreparedStatement orderListUpdateSt = conn
				.prepareStatement("INSERT INTO orderlist (orderid, stock, quantity, price, date, side) VALUES (?, ?, ?, ?, ?, ?)");
		orderListUpdateSt.setString(1, orderId);
		orderListUpdateSt.setString(2, symbol);
		orderListUpdateSt.setInt(3, quantity);
		orderListUpdateSt.setInt(4, price);
		orderListUpdateSt.setTimestamp(5, executedDate);
		orderListUpdateSt.setInt(6, order.getSide());
		orderListUpdateSt.executeUpdate();

		// update history
		PreparedStatement historyUpdateSt;

		if (type == 0) {
			historyUpdateSt = conn
					.prepareStatement("insert into history (id, orderid, date) VALUES (?, ?, ?)");
			historyUpdateSt.setTimestamp(3, executedDate);
		} else {
			historyUpdateSt = conn
					.prepareStatement("insert into history (id, orderid, traderid, date) VALUES (?, ?, ?, ?)");
			historyUpdateSt.setString(3, OrderPendingFollower.get(orderId));
			historyUpdateSt.setTimestamp(4, executedDate);
		}

		historyUpdateSt.setString(1, accountId);
		historyUpdateSt.setString(2, orderId);
		historyUpdateSt.executeUpdate();
		
		// update portfolio of trader/follower (assume 1 follower follows 1 trader )
		PreparedStatement stmt1 = connection
				.prepareStatement("select * from portfolio where id=? and stock=?");
		stmt1.setString(1, accountId);
		stmt1.setString(2, symbol);

		ResultSet rs1 = stmt1.executeQuery();
		int quantityOnHand = 0, cost = 0;
		while (rs1.next()) {
			quantityOnHand = rs1.getInt("quantity");
			cost = rs1.getInt("cost");
		}
		rs1.close();
		stmt1.close();

		if (quantityOnHand == 0) {
			String sql = "insert into portfolio  (id ,stock,quantity,cost) VALUES ( ?,?,?,?) ";

			PreparedStatement porfolioUpdateSt = conn.prepareStatement(sql);
			porfolioUpdateSt.setString(1, accountId);
			porfolioUpdateSt.setString(2, symbol);
			porfolioUpdateSt.setInt(3, quantity);
			porfolioUpdateSt.setInt(4, price);

			porfolioUpdateSt.executeUpdate();
			porfolioUpdateSt.close();
		} else {
			if (order.getSide() == 2 && quantityOnHand == quantity) {
				String sql = "delete from portfolio  WHERE id = ? and stock= ?";

				PreparedStatement porfolioUpdateSt = conn.prepareStatement(sql);
				porfolioUpdateSt.setString(1, accountId);
				porfolioUpdateSt.setString(2, symbol);
				porfolioUpdateSt.executeUpdate();
				porfolioUpdateSt.close();
			} else {
				String sql = "update portfolio set quantity=?, cost=? where id=? and stock=?";

				PreparedStatement porfolioUpdateSt = conn.prepareStatement(sql);
				porfolioUpdateSt.setString(3, accountId);
				porfolioUpdateSt.setString(4, symbol);
				int newCost = cost;
				if (order.getSide() == 1) {
					porfolioUpdateSt.setInt(1, quantity + quantityOnHand);
					newCost = (price * quantity + quantityOnHand * cost)
							/ (quantity + quantityOnHand);
				} else
					porfolioUpdateSt.setInt(1, quantityOnHand - quantity);

				porfolioUpdateSt.setInt(2, newCost);
				porfolioUpdateSt.executeUpdate();
				porfolioUpdateSt.close();
			}
		}

		if (type == 0) { // la trader
			// update account of trader
			PreparedStatement traderUpdateSt = conn
					.prepareStatement("UPDATE trader SET cash = ? WHERE traderid = ?");

			if (order.getSide() == 1) {
				traderUpdateSt.setFloat(1, listOfTraderEntity.get(accountId)
						.getCash() - quantity * price);
			} else {
				traderUpdateSt.setFloat(1, listOfTraderEntity.get(accountId)
						.getCash() + quantity * price);
			}

			traderUpdateSt.setString(2, accountId);
			traderUpdateSt.executeUpdate();


		} else { // la follower
			String traderId = OrderPendingFollower.get(orderId);

			// update mapOfTrader for this follower
			List<Follower> listOfFollower = mapOfTrader.get(traderId);

			for (Follower f : listOfFollower) {
				if (f.getId().equals(accountId)) {
					if (order.getSide() == 1)
						f.getMapStockQuantityFollow().put(symbol, quantity);
					else
						f.getMapStockQuantityFollow().remove(symbol); // neu ban thanh cong thi bo ma nay ra 
					break;
				}
			}

			PreparedStatement getFolloweesQuery = conn
					.prepareStatement("SELECT transactionid, cash from account, following "
							+ "WHERE account.id = ? "
							+ "AND account.id = following.id "
							+ "AND following.traderid = ?");

			getFolloweesQuery.setString(1, accountId);
			getFolloweesQuery.setString(2, traderId);
			ResultSet rs = getFolloweesQuery.executeQuery();

			float cash = 0;
			String transactionid = "";

			while (rs.next()) {
				transactionid = rs.getString("transactionid");
				cash = rs.getFloat("cash");
			}
			rs.close();

			// update account
			if (order.getSide() == 2){
				PreparedStatement accountUpdateSt = conn
						.prepareStatement("UPDATE account SET cash = ? WHERE id = ?");
				accountUpdateSt.setString(2, accountId);
				accountUpdateSt.setFloat(1, cash + quantity * price);
				accountUpdateSt.executeUpdate();
			}

			// update transaction
			if (order.getSide() == 1) {
				PreparedStatement insertTransactionSt = conn
						.prepareStatement("INSERT INTO transaction (transactionid, orderid) VALUES (?, ?)");
				insertTransactionSt.setString(1, transactionid);
				insertTransactionSt.setString(2, orderId);
				insertTransactionSt.executeUpdate();
			} else {
				PreparedStatement findTransactionToDelete = conn
						.prepareStatement("SELECT transaction.orderid FROM transaction, orderlist "
								+ "WHERE transactionid = ? "
								+ "AND transaction.orderid = orderlist.orderid "
								+ "AND orderlist.stock = ?");
				findTransactionToDelete.setString(1, transactionid);
				findTransactionToDelete.setString(2, order.getSymbol());
				rs = findTransactionToDelete.executeQuery();

				String orderIdToDelete = null;
				while (rs.next()) {
					orderIdToDelete = rs.getString("orderid").trim();
				}

				PreparedStatement removeTransactionSt = conn
						.prepareStatement("DELETE FROM transaction WHERE orderid = ?");
				removeTransactionSt.setString(1, orderIdToDelete);
				removeTransactionSt.executeUpdate();
			}

		}

		st.close();
	}
	
	public void processMessageExpired() throws ShutdownSignalException, ConsumerCancelledException, InterruptedException, SQLException 
	{
		QueueingConsumer.Delivery delivery = consumerExpired.nextDelivery();
		String message = new String(delivery.getBody());
		System.out.println(message);
		SendOrder expiredOrder  = null;
		
		try {
			expiredOrder = mapper.readValue(message, SendOrder.class);
			OrderPendingList.remove(expiredOrder.getOrderId());
			String traderId= OrderPendingFollower.get(expiredOrder.getOrderId());
			
			// update account
			if (traderId!= null && expiredOrder.getSide() == 1){
				String account = expiredOrder.getAccount();
				PreparedStatement accountUpdateSt = connection
						.prepareStatement("UPDATE account SET cash = ? WHERE id = ?");
				accountUpdateSt.setString(2, account);
				
				float cashUpdate=  listOfFollowerEntity.get(account).getCash() + expiredOrder.getPrice() * expiredOrder.getQty();
				listOfFollowerEntity.get(account).setCash(cashUpdate);
				
				accountUpdateSt.setFloat(1,cashUpdate);
				accountUpdateSt.executeUpdate();
				accountUpdateSt.close();
				
				OrderPendingFollower.remove(expiredOrder.getOrderId());
				OrderPendingMap.get(traderId).remove(expiredOrder.getOrderId());
			}
			
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}
