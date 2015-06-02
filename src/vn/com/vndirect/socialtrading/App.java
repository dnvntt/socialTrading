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
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.codehaus.jackson.JsonGenerationException;
import org.codehaus.jackson.map.JsonMappingException;
import org.codehaus.jackson.map.ObjectMapper;

import vn.com.vndirect.ors.client.api.OrderService;
import vn.com.vndirect.ors.client.api.OrderServiceImpl;
import vn.com.vndirect.ors.client.api.entity.Report;
import vn.com.vndirect.ors.client.api.utils.OrderException;

import com.rabbitmq.client.Channel;
import com.rabbitmq.client.Connection;
import com.rabbitmq.client.ConnectionFactory;
import com.rabbitmq.client.ConsumerCancelledException;
import com.rabbitmq.client.QueueingConsumer;
import com.rabbitmq.client.ShutdownSignalException;

public class App {

	public static void main(String[] args) throws java.io.IOException,
			InterruptedException {
		Config.loadConfig();
		App app = new App();
		app.run();
	}

	private ObjectMapper mapper;
	private OrderService orderService;
	private QueueingConsumer consumerSent;
	private QueueingConsumer consumerExecuted;
	private java.sql.Connection connection = null;
	
	private Map<String, List<Follower>> mapOfTrader; // map signalprovider with
													// list of follower
	private Map<String, Integer> listOfStock; // list all stock with its risk
												// factor
	private Map<String, Trader> listOfTrader; // list all trader or signal
												// provider
	private Map<String, List<String>> OrderPendingMap; // map signalprovider's
														// order with list of
														// follower's orders
	
	private Map<String,String> OrderPendingFollower;   //map order generated by follower with account of trader
	
	private List<String> OrderPendingList; // list all order pending of trader and follower

	public App() throws IOException {
		ConnectionFactory factory = new ConnectionFactory();
		factory.setHost(Config.RABBIT_HOST);
		factory.setPort(Config.RABBIT_PORT);
		factory.setUsername(Config.RABBIT_USERNAME);
		factory.setPassword(Config.RABBIT_PASSWORD);
		Connection conn = factory.newConnection();

		consumerSent = defineConsumer(Config.QUEUE_NAME_SENT, Config.EXCHANGE_NAME_SENT, conn);
		consumerExecuted = defineConsumer(Config.QUEUE_NAME_EXECUTED, Config.EXCHANGE_NAME_EXECUTED, conn);

		mapper = new ObjectMapper();
		orderService = new OrderServiceImpl();
		mapOfTrader = new HashMap<String, List<Follower>>();
		listOfStock = new HashMap<String, Integer>();
		listOfTrader = new HashMap<String, Trader>();
		OrderPendingMap = new HashMap<String, List<String>>();
		OrderPendingList = new ArrayList<String>();
		OrderPendingFollower = new HashMap<String,String >();

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
	}

	private void reloadData() {
		Statement stmt = null;
		try {
			Class.forName("org.postgresql.Driver");
			connection = DriverManager.getConnection(
					"jdbc:postgresql://localhost:5432/zulu", "postgres",
					"123456");

			stmt = connection.createStatement();

			String sql = "SELECT * FROM (SELECT * FROM following, account WHERE following.id = account.id ORDER BY following.traderid asc) tb1 LEFT JOIN "
					+ "(SELECT transactionid, count(*) AS currentopen, sum(quantity * price) AS cost FROM transaction, orderlist WHERE transaction.orderid = orderlist.orderid"
					+ " GROUP BY transactionid) tb2  ON tb1.transactionid = tb2.transactionid";

			ResultSet rs = stmt.executeQuery(sql);
			List<Follower> listOfFollower = new ArrayList<Follower>();

			PreparedStatement stmt1 = connection.prepareStatement(
					"SELECT stock, quantity, transaction.orderid " +
							"FROM following, account, transaction, orderlist " +
							"WHERE following.id = account.id" +
							"  AND transaction.orderid = orderlist.orderid	" +
							"  AND following.transactionid = transaction.transactionid " +
							"  AND following.traderid = ?" +
							"  AND account.id = ?");

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
				float cashAvailable = rs.getFloat("cash");

				Map<String, Integer> mapStockQuantityFollow = new HashMap<String, Integer>();
				Map<String, String> mapStockOrderFollow = new HashMap<String, String>();

				stmt1.setString(1, traderid);
				stmt1.setString(2, followerId);

				ResultSet rs1 = stmt1.executeQuery();
				while (rs1.next()) {
					mapStockQuantityFollow.put(rs1.getString("stock").trim(), rs1.getInt("quantity"));
					mapStockOrderFollow.put(rs1.getString("stock").trim(), rs1.getString("orderid"));
				}
				rs1.close();

				listOfFollower.add(new Follower(followerId, maxOpen,
						currentOpen, moneyAllocate, currentSpend, riskFactor,
						cashAvailable, mapStockQuantityFollow,mapStockOrderFollow));
			}

			stmt1.close();

			sql = "select * from  stockrisk";
			rs = stmt.executeQuery(sql);
			while (rs.next()) {
				String stock = rs.getString("stock").trim();
				int riskFactor = rs.getInt("risk");
				listOfStock.put(stock, riskFactor);
			}

			sql = "SELECT * FROM trader " +
					"LEFT JOIN " +
					"(SELECT id, sum(quantity * cost) AS totalcost FROM portfolio GROUP BY id) tb2 " +
					"ON trader.traderid = tb2.id";
			rs = stmt.executeQuery(sql);

			while (rs.next()) {
				String traderid = rs.getString("traderid").trim();
				int numberFollow = rs.getInt("numberfollow");
				float moneyfollow = rs.getFloat("monneyfollow");
				float cash = rs.getFloat("cash");
				float stockOnhandValue = rs.getFloat("totalcost");

				listOfTrader.put(traderid, new Trader(traderid, numberFollow,
						moneyfollow, cash, stockOnhandValue));
			}

			rs.close();
			stmt.close();
			//connection.close();

		} catch (Exception e) {
			System.err.println(e.getClass().getName() + ": " + e.getMessage());
			System.exit(0);
		}
		
		//OrderPendingList.add("143279719767912");
		//OrderPendingFollower.put("143279719767912", "0001011079");
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
	
	public static int getFloorPrice(String symbol) throws IOException
	{
		String link= "http://10.26.0.165:8000/sInfo?sym="+symbol+"&ex="+2; //1 cho hcm, 2 cho hn
		URL url = new URL(link);  
		BufferedReader br = new BufferedReader(new InputStreamReader(url.openStream()));
		String strTemp =  br.readLine();
		int start =strTemp.indexOf("floorPx");
		String floorPrice= strTemp.substring(start+9,start+17);
		return Integer.parseInt(floorPrice.substring(0, floorPrice.indexOf(",")));
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
			Trader myTrader = listOfTrader.get(acc);

			double percentStock = (myTrader.getStockOnhandValue() + price * quantity) /
				(myTrader.getStockOnhandValue() + myTrader.getCash());

			// For each follower, duplicate the order made by the trader, with some necessary adjustments
			for (Follower f : listOfFollower) {
				// check follower neu Riskfactor < riskfactor cua ma CK can
				// mua thi bo qua
				// FIXME Needs test
				if (side == 1	&& f.getRiskfactor() < stockrisk)
					continue;

				// check follower neu da mua nhieu hon muc cho phep thi bo
				// qua
				// FIXME Needs test
				if (side == 1	&& f.getMaxopen() <= f.getCurrentOpen())
					continue;

				Map<String, Integer> mapStockFollow = null;
				// lenh ban, check followeer neu khong co CK thi bo qua
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
					orderByThisFollower.setPrice( price);

					if (side == 1) {
						int quantityRecalculate =
							(int) ((percentStock * f.getMoneyAllocate() - f.getCurrentAllocate()) / price);
						int round_number = quantityRecalculate / 100;
						if (round_number < 1) round_number = 1;
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
			ConsumerCancelledException, InterruptedException {
		QueueingConsumer.Delivery delivery = consumerSent.nextDelivery();
		String message = new String(delivery.getBody());
		System.out.println(message);
		SendOrder orderByTrader = null;

		try {
			orderByTrader = mapper.readValue(message, SendOrder.class);
			List<SendOrder> followerOrders = replicateOrderForFollowers(orderByTrader);

			for (SendOrder followerOrder : followerOrders) {
				try {
					Report report = orderService.executePlaceOrder(
							followerOrder.getAccount(),
							Integer.toString(followerOrder.getSide()).charAt(0),
							followerOrder.getType() == 1 ? "MP" : "LO",
							followerOrder.getSymbol(),
							followerOrder.getPrice(),
							followerOrder.getQty());

					String order_id_return = report.getMessage();
					System.out.println("Print order id: " + order_id_return);
					System.out.println("Print report.getStatus()  id: " + report.getStatus());

					// check lenh khong bi loi
					if(report.getStatus() != false) {
						OrderPendingList.add(order_id_return);
						OrderPendingFollower.put(order_id_return, orderByTrader.getAccount()); 
					}
				} catch (OrderException e) {
					// FIXME: What to do if this order fails to send?
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

	public java.sql.Timestamp convertToSqlDate(String mydate )
	{
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
				// xu ly khop lenh toan bo
				if(order.getMatchedQty()==order.getQty() )  
				{
					if(listOfTrader.containsKey(acc))
					{
						try {
							updateDatabaseAfterExecuted(0,order, connection);
						} catch (SQLException e) {
							e.printStackTrace();
						}
					}
					else
					{
						try {
							updateDatabaseAfterExecuted(1,order, connection);
						} catch (SQLException e) {
							e.printStackTrace();
						}
					}
				}
				//neu la lenh mua, xu ly khop lenh 1 phan 
				
			}
		} catch (JsonGenerationException e) {
			e.printStackTrace();
		} catch (JsonMappingException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	public void updateDatabaseAfterExecuted(int type, ExecutedOrder order, java.sql.Connection conn ) throws SQLException
	{
		int quantity= order.getMatchedQty();
		int price = order.getMatchedPrice();
		String accountId = order.getAccount();
		String orderId= order.getOrderId();
		String symbol=  order.getSymbol();
		Timestamp executedDate = convertToSqlDate(order.getTradeDate());
		Statement st = conn.createStatement();
		
		// update orderList
		PreparedStatement orderListUpdateSt = conn.prepareStatement(
				"INSERT INTO orderlist (orderid, stock, quantity, price, date, side) VALUES (?, ?, ?, ?, ?, ?)");
		orderListUpdateSt.setString(1, orderId);
		orderListUpdateSt.setString(2, symbol);
		orderListUpdateSt.setInt(3,quantity);
		orderListUpdateSt.setInt(4, price);
		orderListUpdateSt.setTimestamp(5, executedDate);
		orderListUpdateSt.setInt(6, order.getSide());
		orderListUpdateSt.executeUpdate();
		
		// update history
		PreparedStatement historyUpdateSt;
				
		if (type == 0) {
			historyUpdateSt = conn.prepareStatement(
					"insert into history (id, orderid, date) VALUES (?, ?, ?)");
			historyUpdateSt.setTimestamp(3, executedDate);
		} else {
			historyUpdateSt = conn.prepareStatement(
					"insert into history (id, orderid, traderid, date) VALUES (?, ?, ?, ?)");
			historyUpdateSt.setString(3, OrderPendingFollower.get(orderId));
			historyUpdateSt.setTimestamp(4, executedDate);
		}

		historyUpdateSt.setString(1, accountId);
		historyUpdateSt.setString(2, orderId);
	    historyUpdateSt.executeUpdate();
		
		if (type == 0 ) {  // la trader
			// update account of trader 
			PreparedStatement traderUpdateSt = conn.prepareStatement(
					"UPDATE trader SET cash = ? WHERE traderid = ?");

			if (order.getSide() == 1) {
				traderUpdateSt.setFloat(1, listOfTrader.get(accountId).getCash() - quantity * price);
			} else {
				traderUpdateSt.setFloat(1, listOfTrader.get(accountId).getCash() + quantity * price);
			}

			traderUpdateSt.setString(2, accountId);
			traderUpdateSt.executeUpdate();
			
			// update portfolio of trader 
			String sql= "insert into portfolio  (id ,stock,quantity,cost) VALUES ( ?,?,?,?) ";
			if (order.getSide() == 2)
				sql= "delete from portfolio  WHERE id = ? and stock= ?";
			
			PreparedStatement porfolioUpdateSt = conn.prepareStatement(sql);
			porfolioUpdateSt.setString(1, accountId);
			porfolioUpdateSt.setString(2, symbol);
			
			if (order.getSide() == 1) {
				porfolioUpdateSt.setInt(3, quantity);
				porfolioUpdateSt.setInt(4, price);
			}
			porfolioUpdateSt.executeUpdate();
			
		} else { // la follower
			String traderId= OrderPendingFollower.get(orderId);
			
			//update mapOfTrader for this follower
			List<Follower> listOfFollower = mapOfTrader.get(traderId);
			
			for (Follower f : listOfFollower){
				if (f.getId().equals(accountId)){
					if(order.getSide() == 1)
						f.getMapStockQuantityFollow().put(symbol, quantity);
					else
						f.getMapStockQuantityFollow().remove(symbol); //neu ban thanh cong thi bo ma nay ra
					break;
				}
			}
			
			PreparedStatement getFolloweesQuery = conn.prepareStatement(
					"SELECT transactionid, cash from account, following " +
							"WHERE account.id = ? " +
							"AND account.id = following.id " +
							"AND following.traderid = ?");

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
			PreparedStatement portfolioUpdateSt = conn.prepareStatement(
					"UPDATE account SET cash = ? WHERE id = ?");
			portfolioUpdateSt.setString(2, accountId);

			if (order.getSide() == 1)
				portfolioUpdateSt.setFloat(1, cash - quantity * price);
			else
				portfolioUpdateSt.setFloat(1, cash + quantity * price);

			portfolioUpdateSt.executeUpdate();

		    // update transaction
		    if (order.getSide() == 1){
				PreparedStatement insertTransactionSt = conn.prepareStatement(
						"INSERT INTO transaction (transactionid, orderid) VALUES (?, ?)");
				insertTransactionSt.setString(1, transactionid);
				insertTransactionSt.setString(2, orderId);
				insertTransactionSt.executeUpdate();
		    } else {
				PreparedStatement findTransactionToDelete = conn.prepareStatement(
						"SELECT transaction.orderid FROM transaction, orderlist " +
								"WHERE transactionid = ? " +
								"AND transaction.orderid = orderlist.orderid " +
								"AND orderlist.stock = ?");
				findTransactionToDelete.setString(1, transactionid);
				findTransactionToDelete.setString(2, order.getSymbol());
		    	rs = findTransactionToDelete.executeQuery();

		    	String orderIdToDelete = null;
		    	while (rs.next()) {
					orderIdToDelete = rs.getString("orderid").trim();
		    	}

				PreparedStatement removeTransactionSt = conn.prepareStatement(
						"DELETE FROM transaction WHERE orderid = ?");
				removeTransactionSt.setString(1, orderIdToDelete);
				removeTransactionSt.executeUpdate();
		    }
		}
		
		st.close();
	}

}
