package vn.com.vndirect.socialtrading.api;

import org.codehaus.jackson.map.ObjectMapper;
import spark.*;
import vn.com.vndirect.socialtrading.dao.NotFoundException;
import vn.com.vndirect.socialtrading.dao.TraderDao;
import vn.com.vndirect.socialtrading.entity.Trader;


public class ApiHandler {
    public ApiHandler() {
        final ObjectMapper mapper = new ObjectMapper();

        // FIXME: This should be removed when we extract the frontend code to its own application
        Spark.externalStaticFileLocation("src/web/dist");
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
                Trader trader = dao.getTraderById(request.params(":id"));

                if (trader != null) {
                    return mapper.writeValueAsString(trader);
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
