package vn.com.vndirect.socialtrading.api;

import com.mashape.unirest.http.HttpResponse;
import com.mashape.unirest.http.JsonNode;
import com.mashape.unirest.http.Unirest;
import com.mashape.unirest.http.exceptions.UnirestException;
import org.json.JSONArray;
import org.json.JSONObject;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import spark.Spark;
import vn.com.vndirect.socialtrading.Config;

import static org.junit.Assert.*;


public class LoginHandlerTest {
    String BASE_URL = "http://localhost:4567/api/v1";

    @Before
    public void setUp() throws Exception {
        Config.loadConfig();
        new LoginHandler();
    }

    @After
    public void tearDown() throws Exception {
        Spark.stop();
    }

    private HttpResponse<JsonNode> login() throws UnirestException {
        return Unirest.post(BASE_URL + "/login")
                .field("user", "vnds")
                .field("pass", "vnds1234")
                .asJson();
    }

    @Test
    public void MeRouteReturnsTheLoggedInFollower() throws UnirestException {
        // Throw 401 - Not Authorized when not logged in
        HttpResponse<JsonNode> res = Unirest.get(BASE_URL + "/me").asJson();
        assertEquals(401, res.getStatus());

        res = login();
        assertEquals(200, res.getStatus());

        res = Unirest.get(BASE_URL + "/me").asJson();
        JSONObject body = res.getBody().getObject();

        assertNotNull(body.getString("id"));
        assertNotNull(body.getDouble("cash"));
        assertNotNull(body.getInt("riskfactor"));
    }

    @Test
    public void followATrader() throws UnirestException {
        // FIXME: mock the daos
        String traderId = "0001052458";
        String followerId = "0001210287";

        // Make sure we are not following this trader
        HttpResponse<JsonNode> res = Unirest.get(BASE_URL + "/follower/{userId}/following")
                .routeParam("userId", followerId)
                .asJson();

        JSONArray body = res.getBody().getArray();
        boolean found = false;
        for (int i = 0; i < body.length(); i++) {
            if (body.getJSONObject(i).get("traderId").equals(traderId)) {
                found = true;
                break;
            }
        }
        assertFalse(found);

        // Then actually follow them
        float money = 323;
        int maxOpen = 3;
        res = Unirest.post(BASE_URL + "/follower/{userId}/following")
                .routeParam("userId", followerId)
                .field("traderId", traderId)
                .field("money", money)
                .field("maxOpen", maxOpen)
                .asJson();
        assertEquals(200, res.getStatus());

        JSONObject postResultBody = res.getBody().getObject();
        assertEquals(money, postResultBody.getDouble("money"), 0.001);
        assertEquals(maxOpen, postResultBody.getInt("maxOpen"));
        assertEquals(traderId, postResultBody.getString("traderId"));
    }

    @Test
    public void getListOfTradersWeAreFollowing() throws UnirestException {
        HttpResponse<JsonNode> res = Unirest.get(BASE_URL + "/follower/{userId}/following")
                .routeParam("userId", "0001210287")
                .asJson();
        assertEquals(200, res.getStatus());
        assertTrue(res.getBody().getArray().length() > 0);
    }
}