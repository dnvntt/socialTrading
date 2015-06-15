package vn.com.vndirect.socialtrading.api;

import com.mashape.unirest.http.HttpResponse;
import com.mashape.unirest.http.JsonNode;
import com.mashape.unirest.http.Unirest;
import com.mashape.unirest.http.exceptions.UnirestException;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import spark.Spark;
import vn.com.vndirect.socialtrading.Config;

import static org.junit.Assert.*;


public class LoginHandlerTest {

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
    public void Return404BeforeLogin() throws UnirestException {
        HttpResponse<String> res = Unirest.get("http://localhost:4567/api/v1/me").asString();
        assertEquals(res.getStatus(), 404);
    }

    @Test
    public void ReturnAccountInfoAfterLogin() throws UnirestException {
        HttpResponse<String> res = Unirest.post("http://localhost:4567/api/v1/login")
                .field("user", "vnds")
                .field("pass", "vnds1234")
                .asString();
        assertEquals(res.getStatus(), 200);
    }
}