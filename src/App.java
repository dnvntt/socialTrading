import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.URL;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
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

	static ObjectMapper mapper;
	static OrderService orderService;
	static QueueingConsumer consumerSent;
	static QueueingConsumer consumerExecuted;
	static java.sql.Connection connection = null;
	
	static Map<String, List<Follower>> mapOfTrader; // map signalprovider with
													// list of follower
	static Map<String, Integer> listOfStock; // list all stock with its risk
												// factor
	static Map<String, Trader> listOfTrader; // list all trader or signal
												// provider
	static Map<String, List<String>> OrderPendingMap; // map signalprovider's
														// order with list of
														// follower's orders
	
	static Map<String,String> OrderPendingFollower;   //map order generated by follower with account of trader
	
	static List<String> OrderPendingList; // list all order pending of trader and follower
	
	
	public static QueueingConsumer defineCosumer(String queueName,
			String exchangeName, Connection conn) throws IOException {
		Channel channel = conn.createChannel();
		channel.queueDeclare(queueName, false, false, false, null);
		channel.queueBind(queueName, exchangeName, "");

		QueueingConsumer consumer = new QueueingConsumer(channel);
		channel.basicConsume(queueName, true, consumer);
		return consumer;
	}

	public static void main(String[] args) throws java.io.IOException,
			InterruptedException {
		String QUEUE_NAME_SENT = "sentOrderList2";
		String EXCHANGE_NAME_SENT = "NotiCenter.Exchange.SentOrder";

		String QUEUE_NAME_EXECUTED = "executedOrderList2";
		String EXCHANGE_NAME_EXECUTED = "NotiCenter.Exchange.ExecutedOrder";

		ConnectionFactory factory = new ConnectionFactory();
		factory.setHost("10.25.1.94");
		factory.setPort(5672);
		factory.setUsername("noticenter");
		factory.setPassword("abcd@123");
		Connection conn = factory.newConnection();
		
		consumerSent = defineCosumer(QUEUE_NAME_SENT, EXCHANGE_NAME_SENT, conn);
		consumerExecuted = defineCosumer(QUEUE_NAME_EXECUTED, EXCHANGE_NAME_EXECUTED, conn);

		mapper = new ObjectMapper();
		orderService = new OrderServiceImpl();
		mapOfTrader = new HashMap<String, List<Follower>>();
		listOfStock = new HashMap<String, Integer>();
		listOfTrader = new HashMap<String, Trader>();
		OrderPendingMap = new HashMap<String, List<String>>();
		OrderPendingList = new ArrayList<String>();
		OrderPendingFollower = new HashMap<String,String >();
		
		Statement stmt = null;
		try {
			Class.forName("org.postgresql.Driver");
			connection = DriverManager.getConnection(
					"jdbc:postgresql://localhost:5432/zulu", "postgres",
					"123456");

			stmt = connection.createStatement();

			String sql = "select * from (select * FROM following, account where following.id = account.id order by following.traderid asc) tb1 LEFT JOIN "
					+ "(select transactionid, count(*) as currentopen, sum(quantity*price) as cost from transaction, orderlist where transaction.orderid = orderlist.orderid"
					+ " GROUP BY transactionid) tb2  ON tb1.transactionid=tb2.transactionid";

			ResultSet rs = stmt.executeQuery(sql);
			List<Follower> listOfFollower = new ArrayList<Follower>();

			Statement stmt1 = connection.createStatement();

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
				String sql1 = "select stock, quantity,transaction.orderid FROM following, account, transaction, orderlist where following.id = account.id"
						+ " and transaction.orderid = orderlist.orderid	and following.transactionid=transaction.transactionid"
						+ " and  following.traderid ='"
						+ traderid
						+ "' and account.id='" + followerId + "';";

				ResultSet rs1 = stmt1.executeQuery(sql1);
				while (rs1.next()) {
					mapStockQuantityFollow.put(rs1.getString("stock").trim(),rs1.getInt("quantity"));
					mapStockOrderFollow.put(rs1.getString("stock").trim(),rs1.getString("orderid"));
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

			sql = "select * from trader LEFT JOIN (select id, sum(quantity*cost) as totalcost from portfolio group by id ) tb2  ON trader.traderid= tb2.id;";
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
		
		
		/*while (true) {
			processMessage();
		}*/
		
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

	public static List<SendOrder> replicateOrderForFollowers(SendOrder order) {
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

			char side = Integer.toString(order.getSide()).charAt(0);
			int type = order.getType();
			String OrsType = "LO";
			if (type == 1)
				OrsType = "MP";
			String symbol = order.getSymbol();
			double price = order.getPrice();
			double quantity = order.getQty();
			int stockrisk = listOfStock.get(symbol);
			Trader myTrader = listOfTrader.get(acc);

			double percentStock = (myTrader.getStockOnhandValue() + price * quantity) /
				(myTrader.getStockOnhandValue() + myTrader.getCash());

			// For each follower, duplicate the order made by the trader, with some necessary adjustments
			for (Follower f : listOfFollower) {
				// check follower neu Riskfactor < riskfactor cua ma CK can
				// mua thi bo qua
				// FIXME Needs test
				if (side == '1'	&& f.getRiskfactor() < stockrisk)
					continue;

				// check follower neu da mua nhieu hon muc cho phep thi bo
				// qua
				// FIXME Needs test
				if (side == '1'	&& f.getMaxopen() <= f.getCurrentOpen())
					continue;

				Map<String, Integer> mapStockFollow = null;
				// lenh ban, check followee neu khong co CK thi bo qua
				if (side == '2') {
					mapStockFollow = f.getMapStockFollow();
					if (!mapStockFollow.containsKey(symbol))
						continue;
				}

				// FIXME: Contain the trim() in entity classes
				String account = f.getId().trim();

				try {
					price = getFloorPrice(symbol);
					SendOrder orderByThisFollower = new SendOrder();
					orderByThisFollower.setAccount(acc);
					orderByThisFollower.setSide(side);
					orderByThisFollower.setType(type);
					orderByThisFollower.setSymbol(symbol);
					// FIXME: Dangerous cast. Why is SendOrder.price int?;
					orderByThisFollower.setPrice((int) price);

					if (side == '1') {
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

	public static void processMessageSent() throws ShutdownSignalException,
			ConsumerCancelledException, InterruptedException {
		QueueingConsumer.Delivery delivery = consumerSent.nextDelivery();
		String message = new String(delivery.getBody());
		System.out.println(message);
		SendOrder order = null;

		try {
			order = mapper.readValue(message, SendOrder.class);
			List<SendOrder> followerOrders = replicateOrderForFollowers(order);

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
						OrderPendingFollower.put(order_id_return, followerOrder.getAccount());
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

	public static void processMessageExecuted() throws ShutdownSignalException,
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
				//xu ly khop lenh toan bo
				if(order.getMatchedQty()==order.getQty() )  //order.getSide()=='1' && 
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
	
	public static void updateDatabaseAfterExecuted(int type, ExecutedOrder order, java.sql.Connection conn ) throws SQLException
	{
		int quantity= order.getMatchedQty();
		int price = order.getMatchedPrice();
		String acc = order.getAccount();
		String orderId= order.getOrderId();
		
		Statement st = conn.createStatement();
		
		//update orderList
		String sql = "insert into orderlist (orderid,stock,quantity,price,date,side) VALUES ("+ orderId+","+ order.getSymbol().trim()+","+
		  order.getMatchedQty()+ "," + order.getMatchedPrice()+  "," +order.getTradeDate() +","+order.getSide()+ ")";
		st.executeUpdate(sql);
		
		//update history
	    sql = "insert into history (id ,orderid,traderid,date) VALUES ('"+ order.getAccount()+"','"+ orderId+ "','"+OrderPendingFollower.get(orderId) +"',"+ order.getTradeDate()+ ")";
	    st.executeUpdate(sql);
		
		if(type ==0 ){  //la trader
			//update portfolio
			if(order.getSide()=='1')
			 sql = "update trader set cash = "+ (listOfTrader.get(acc).getCash() - quantity*price) +" where traderid='"+ acc + "'; ";
			else
				sql = "update trader set cash = "+ (listOfTrader.get(acc).getCash() + quantity*price) +" where traderid='"+ acc + "'; ";
			 st.executeUpdate(sql);
		}
		else //la follower
		{
		    sql = "select * from account, following where id ='"+acc+"' and account.id = following.id and following.traderid ='"+ OrderPendingFollower.get(acc) +"';" ;
		    ResultSet rs = st.executeQuery(sql);
		    int cash = 0;
		    String transactionid = "";
		    
		    while (rs.next()) {
				transactionid = rs.getString("transactionid");
				cash = rs.getInt("cash");
			}
			rs.close();
			
			//update portfolio
			if(order.getSide()=='1')
				sql = "update account set cash = "+ (cash - quantity*price) +" where id='"+ acc + "'; ";
			else
				sql = "update account set cash = "+ (cash + quantity*price) +" where id='"+ acc + "'; ";
			st.executeUpdate(sql);
			
		   //update transaction
		    if(order.getSide()=='1')  {
		    	sql = "insert into transaction (transactionid, orderid) VALUES ('"+ transactionid +"','"+ orderId + "'; ";
		    	st.executeUpdate(sql);
		    }
		    else{
		    	sql = "select transaction.orderid from transaction, orderlist where transactionid='"+transactionid +
		    			"' and transaction.orderid =orderlist.orderid and  orderlist.stock='"+ order.getSymbol().trim()+"';";
		    	rs = st.executeQuery(sql);
		    	String orderIdDelete = null;
		    	 while (rs.next()) {
		    		 orderIdDelete=  rs.getString("orderid").trim();
		    	 }
		    	 
		    	sql = "delete from transaction where  orderid='"+  orderIdDelete + "'; ";
		    	st.executeUpdate(sql);
		    }
		}
		
		st.close();
	}

}
