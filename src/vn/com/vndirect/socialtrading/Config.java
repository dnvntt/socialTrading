package vn.com.vndirect.socialtrading;


import java.io.IOException;
import java.io.InputStream;
import java.lang.reflect.Field;
import java.util.AbstractMap;
import java.util.Properties;

public class Config {
    public static String QUEUE_NAME_SENT = "sentOrderList2";
    public static String EXCHANGE_NAME_SENT = "NotiCenter.Exchange.SentOrder";
    public static String QUEUE_NAME_EXECUTED = "executedOrderList2";
    public static String EXCHANGE_NAME_EXECUTED = "NotiCenter.Exchange.ExecutedOrder";

    public static String RABBIT_HOST = "10.25.1.94";
    public static int RABBIT_PORT = 5672;
    public static String RABBIT_USERNAME = "noticenter";
    public static String RABBIT_PASSWORD = "abcd@123";

    public static void loadConfig() {
        Properties props = new Properties();

        try {
            InputStream configStream = Config.class.getClassLoader().getResourceAsStream("config.properties");
            if (configStream == null) {
                return;
            }
            props.load(configStream);

            String[] keys = new String[] {
                    "QUEUE_NAME_SENT",
                    "EXCHANGE_NAME_SENT",
                    "QUEUE_NAME_EXECUTED",
                    "EXCHANGE_NAME_EXECUTED",
                    "RABBIT_HOST",
                    "RABBIT_USERNAME",
                    "RABBIT_PASSWORD"
            };

            for (String key : keys) {
                String value = props.getProperty(key);
                if (value != null) {
                    Field field = Config.class.getDeclaredField(key);
                    field.set(null, value);
                }
            }

            String value = props.getProperty("RABBIT_PORT");
            if (value != null) {
                try {
                    int port = Integer.parseInt(value);
                    RABBIT_PORT = port;
                } catch (NumberFormatException e) {
                    System.err.println("RABBIT_PORT config key should be an integer. Using default value.");
                }
            }
        } catch (IOException e) {
            // Cannot load the config file? Use default values;
            // FIXME: Error message?
            e.printStackTrace();
        } catch (NoSuchFieldException e) {
            // Should not be reached
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            // Should not be reached
            e.printStackTrace();
        }
    }
}
