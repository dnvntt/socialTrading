import com.rabbitmq.client.Channel;
import com.rabbitmq.client.Connection;
import com.rabbitmq.client.ConnectionFactory;
import com.rabbitmq.client.QueueingConsumer;


public class Test {
    
	public static void main(String[] args) throws java.io.IOException, InterruptedException {
 
		 String QUEUE_NAME = "MarketData.Stock";
		 String EXCHANGE_NAME = "MarketDataStockfanoutExchange2S";
		 
		 
		ConnectionFactory factory = new ConnectionFactory();
		 factory.setHost("10.25.1.60");   //10.26.0.160
		 factory.setPort(9300);
		 factory.setUsername("guest");
		 factory.setPassword("guest");
		 
		 Connection conn = factory.newConnection();
		

		 Channel channel = conn.createChannel();
		 //channel.exchangeDeclare(EXCHANGE_NAME, "fanout"); //declare exchange name, error if it already exist
		 
		 channel.queueDeclare(QUEUE_NAME, true, false, false, null);
		 channel.queueBind(QUEUE_NAME, EXCHANGE_NAME,"");
		 
		System.out.println(" [*] Waiting for messages. To exit press CTRL+C");
		QueueingConsumer consumer = new QueueingConsumer(channel);
		channel.basicConsume(QUEUE_NAME, true, consumer);

		while (true) {
			QueueingConsumer.Delivery delivery = consumer.nextDelivery();
			String message = new String(delivery.getBody());
			System.out.println(message );
		}
	}

}
