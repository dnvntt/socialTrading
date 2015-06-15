package vn.com.vndirect.socialtrading.api;

import com.mashape.unirest.http.HttpResponse;
import com.mashape.unirest.http.JsonNode;
import com.mashape.unirest.http.Unirest;
import com.mashape.unirest.http.exceptions.UnirestException;
import org.json.JSONObject;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.mockito.Mockito;
import spark.Spark;
import vn.com.vndirect.socialtrading.Config;
import vn.com.vndirect.socialtrading.dao.FollowerDao;
import vn.com.vndirect.socialtrading.entity.FollowerEntity;
import vn.com.vndirect.socialtrading.entity.Following;

import java.util.ArrayList;

import static org.junit.Assert.*;
import static org.mockito.Mockito.mock;


public class FollowerHandlerTest {
    String BASE_URL = "http://localhost:4567/api/v1";
    private FollowerDao followerDao;

    @Before
    public void setUp() throws Exception {
        Config.loadConfig();
        followerDao = Mockito.mock(FollowerDao.class);
        new FollowerHandler(followerDao);
    }

    @After
    public void tearDown() throws Exception {
        Spark.stop();
    }

    private HttpResponse<JsonNode> login(String username, String password) throws UnirestException {
        return Unirest.post(BASE_URL + "/login")
                .field("user", username)
                .field("pass", password)
                .asJson();
    }

    @Test
    public void MeRouteReturnsTheLoggedInFollower() throws UnirestException {
        // Throw 401 - Not Authorized when not logged in
        HttpResponse<JsonNode> res = Unirest.get(BASE_URL + "/me").asJson();
        assertEquals(401, res.getStatus());

        // Mock a follower
        FollowerEntity follower = new FollowerEntity();
        follower.setId("0001210287");
        Mockito.when(followerDao.authenticate("vnds", "vnds1234")).thenReturn(follower);
        Mockito.when(followerDao.get("0001210287")).thenReturn(follower);

        // Then login as that user
        res = login("vnds", "vnds1234");
        assertEquals(200, res.getStatus());

        res = Unirest.get(BASE_URL + "/me").asJson();
        JSONObject body = res.getBody().getObject();

        assertNotNull(body.getString("id"));
        assertNotNull(body.getDouble("cash"));
        assertNotNull(body.getInt("riskfactor"));
    }

    @Test
    public void followATrader() throws UnirestException {
        String traderId = "0001052458";
        String followerId = "0001210287";
        float money = 323;
        int maxOpen = 3;

        // We are following no one
        Mockito.when(followerDao.getAccount(followerId)).thenReturn(new ArrayList<Following>());

        HttpResponse<JsonNode> res = Unirest.post(BASE_URL + "/follower/{userId}/following")
                .routeParam("userId", followerId)
                .field("traderId", traderId)
                .field("money", money)
                .field("maxOpen", maxOpen).asJson();

        // Check that the request is made successfully and the new relationship is returned
        assertEquals(200, res.getStatus());
        JSONObject postResultBody = res.getBody().getObject();
        assertEquals(money, postResultBody.getDouble("money"), 0.001);
        assertEquals(maxOpen, postResultBody.getInt("maxOpen"));
        assertEquals(traderId, postResultBody.getString("traderId"));

        // Verify that the new relationship is saved
        Mockito.verify(followerDao).followTrader(followerId, traderId, money, maxOpen);
    }

    @Test
    public void getListOfTradersWeAreFollowing() throws UnirestException {
        String userId = "0001210287";

        ArrayList<Following> followings = new ArrayList<>();
        followings.add(new Following());
        followings.add(new Following());
        followings.add(new Following());
        Mockito.when(followerDao.getAccount(userId)).thenReturn(followings);

        HttpResponse<JsonNode> res = Unirest.get(BASE_URL + "/follower/{userId}/following")
                .routeParam("userId", userId)
                .asJson();
        assertEquals(200, res.getStatus());
        assertTrue(res.getBody().getArray().length() == 3);
    }
}