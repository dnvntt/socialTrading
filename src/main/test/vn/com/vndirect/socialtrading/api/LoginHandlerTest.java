package vn.com.vndirect.socialtrading.api;

import com.mashape.unirest.http.HttpResponse;
import com.mashape.unirest.http.JsonNode;
import com.mashape.unirest.http.Unirest;
import com.mashape.unirest.http.exceptions.UnirestException;
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

    @Test
    public void MeRouteReturnsTheLoggedInFollower() throws UnirestException {
        // Throw 401 - Not Authorized when not logged in
        HttpResponse<JsonNode> res = Unirest.get(BASE_URL + "/me").asJson();
        assertEquals(res.getStatus(), 401);

        res = Unirest.post(BASE_URL + "/login")
                .field("user", "vnds")
                .field("pass", "vnds1234")
                .asJson();
        assertEquals(res.getStatus(), 200);

        res = Unirest.get(BASE_URL + "/me").asJson();
        JSONObject body = res.getBody().getObject();

        assertNotNull(body.getString("id"));
        assertNotNull(body.getDouble("cash"));
        assertNotNull(body.getInt("riskfactor"));
    }
}