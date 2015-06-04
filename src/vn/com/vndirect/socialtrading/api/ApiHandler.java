package vn.com.vndirect.socialtrading.api;

import java.sql.Timestamp;
import java.util.Map;

import org.codehaus.jackson.map.ObjectMapper;

import spark.ExceptionHandler;
import spark.Request;
import spark.Response;
import spark.Route;
import spark.Spark;
import vn.com.vndirect.socialtrading.dao.NotFoundException;
import vn.com.vndirect.socialtrading.dao.TraderDao;
import vn.com.vndirect.socialtrading.entity.TraderEntity;


public class ApiHandler {
    public ApiHandler() {
        final ObjectMapper mapper = new ObjectMapper();
        String PREFIX = "/api";

        // Return all traders
        Spark.get(PREFIX + "/traders", new Route() {
            public Object handle(Request request, Response response) throws Exception {
                TraderDao dao = new TraderDao();
                return mapper.writeValueAsString(dao.allTraders());
            }
        });

        // Return a specific trader
        Spark.get(PREFIX + "/trader/:id", new Route() {
            public Object handle(Request request, Response response) throws Exception {
                TraderDao dao = new TraderDao();
                TraderEntity trader = dao.getTraderById(request.params(":id"));

                if (trader != null) {
                    return mapper.writeValueAsString(trader);
                } else {
                    throw new NotFoundException();
                }
            }
        });
        
        // Return  trader or follower 's history performance 
        Spark.get(PREFIX + "/performance/:id", new Route() {
            public Object handle(Request request, Response response) throws Exception {
                TraderDao dao = new TraderDao();
                Map<Timestamp,Float> result= dao.getTraderProfitMap(request.params(":id"));
                if (result != null) {
                    return mapper.writeValueAsString(result);
                } else {
                    throw new NotFoundException();
                }
            }
        });

        Spark.exception(NotFoundException.class, new ExceptionHandler() {
            public void handle(Exception e, Request request, Response response) {
                response.status(404);
                response.body("Resource not found");
            }
        });
    }
}
