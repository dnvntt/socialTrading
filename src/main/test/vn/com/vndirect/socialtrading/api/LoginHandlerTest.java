package vn.com.vndirect.socialtrading.api;

import com.mashape.unirest.http.HttpResponse;
import com.mashape.unirest.http.JsonNode;
import com.mashape.unirest.http.Unirest;
import com.mashape.unirest.http.exceptions.UnirestException;
import oracle.jdbc.util.Login;
import org.codehaus.jackson.map.ObjectMapper;
import org.json.JSONArray;
import org.json.JSONObject;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.mockito.Mock;
import org.mockito.Mockito;
import spark.Spark;
import vn.com.vndirect.socialtrading.Config;
import vn.com.vndirect.socialtrading.dao.LoginDao;
import vn.com.vndirect.socialtrading.dao.NotFoundException;
import vn.com.vndirect.socialtrading.entity.FollowerEntity;
import vn.com.vndirect.socialtrading.entity.Following;

import java.util.ArrayList;

import static org.junit.Assert.*;
import static org.mockito.Mockito.mock;


public class LoginHandlerTest {
    String BASE_URL = "http://localhost:4567/api/v1";
    private LoginDao loginDao;

    @Before
    public void setUp() throws Exception {
        Config.loadConfig();
        loginDao = Mockito.mock(LoginDao.class);
        new LoginHandler(loginDao);
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
        Mockito.when(loginDao.authenticate("vnds", "vnds1234")).thenReturn(follower);
        Mockito.when(loginDao.get("0001210287")).thenReturn(follower);

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

        // We are following no one
        Mockito.when(loginDao.getAccount(followerId)).thenReturn(new ArrayList<Following>());

        float money = 323;
        int maxOpen = 3;

        HttpResponse<JsonNode> res = Unirest.post(BASE_URL + "/follower/{userId}/following")
                .routeParam("userId", followerId)
                .field("traderId", traderId)
                .field("money", money)
                .field("maxOpen", maxOpen).asJson();
        assertEquals(200, res.getStatus());

        JSONObject postResultBody = res.getBody().getObject();
        assertEquals(money, postResultBody.getDouble("money"), 0.001);
        assertEquals(maxOpen, postResultBody.getInt("maxOpen"));
        assertEquals(traderId, postResultBody.getString("traderId"));
    }

    @Test
    public void getListOfTradersWeAreFollowing() throws UnirestException {
        String userId = "0001210287";

        ArrayList<Following> followings = new ArrayList<>();
        followings.add(new Following());
        Mockito.when(loginDao.getAccount(userId)).thenReturn(followings);

        HttpResponse<JsonNode> res = Unirest.get(BASE_URL + "/follower/{userId}/following")
                .routeParam("userId", userId)
                .asJson();
        assertEquals(200, res.getStatus());
        assertTrue(res.getBody().getArray().length() == 1);
    }
}