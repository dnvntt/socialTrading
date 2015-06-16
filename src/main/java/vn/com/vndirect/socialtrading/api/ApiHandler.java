package vn.com.vndirect.socialtrading.api;

import java.sql.SQLException;
import java.sql.Timestamp;
import java.util.Map;

import org.codehaus.jackson.map.ObjectMapper;

import spark.*;
import vn.com.vndirect.socialtrading.dao.FollowerDao;
import vn.com.vndirect.socialtrading.dao.NotFoundException;
import vn.com.vndirect.socialtrading.dao.TraderDao;
import vn.com.vndirect.socialtrading.entity.FollowerEntity;
import vn.com.vndirect.socialtrading.entity.TraderEntity;


public class ApiHandler extends AbstractHandler {
    public ApiHandler() {
        this(new FollowerDao());
    }

    public ApiHandler(final FollowerDao followerDao) {
        final ObjectMapper mapper = new ObjectMapper();

        Spark.post(PREFIX + "/login", new Route() {
            public Object handle(Request request, Response response)
                    throws SQLException, Exception {
                String user = request.queryParams("user");
                String password = request.queryParams("pass");
                FollowerEntity follower = followerDao.authenticate(user, password);

                if (follower == null) {
                    response.status(404);
                    return null;
                } else {
                    Session session = request.session(true);
                    session.attribute("id", follower.getId());
                    response.status(200);
                    return follower;
                }
            }
        }, new JsonTransformer());

        Spark.post(PREFIX + "/logout", new Route() {
            public Object handle(Request request, Response response) throws Exception {
                request.session().invalidate();
                return null;
            }
        }, new JsonTransformer());

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
