package vn.com.vndirect.socialtrading.test;

import org.junit.Test;
import vn.com.vndirect.socialtrading.App;
import vn.com.vndirect.socialtrading.entity.SendOrder;

import java.util.List;

import static org.junit.Assert.*;


public class AppTest {

    @Test
    public void testReplicateOrderForFollowers() throws Exception {
        SendOrder parentOrder = new SendOrder();
        parentOrder.setAccount("atrader");
        parentOrder.setOrderId("anorderid");
        parentOrder.setPrice(100);
        parentOrder.setQty(20);
        parentOrder.setSide(1);
        parentOrder.setSymbol("VND");
        parentOrder.setType(2);

        App app = new App();
        List<SendOrder> followerOrders = app.replicateOrderForFollowers(parentOrder);
    }
}