package vn.com.vndirect.socialtrading.api;

import java.sql.SQLException;
import java.util.List;

import org.codehaus.jackson.map.ObjectMapper;

import spark.*;
import vn.com.vndirect.socialtrading.dao.LoginDao;
import vn.com.vndirect.socialtrading.entity.FollowerEntity;
import vn.com.vndirect.socialtrading.entity.Following;

public class LoginHandler extends AbstractHandler {
	public LoginHandler() {
		final ObjectMapper mapper = new ObjectMapper();

//		Spark.before(new Filter() {
//			public void handle(Request request, Response response) throws Exception {
//				// Check if the user is authenticated.
//				// We only require authentication for the /api routes.
//				if (request.pathInfo().startsWith(PREFIX) &&
//						!request.pathInfo().equals(PREFIX + "/login")) {
//					String id = request.session().attribute("id");
//					if (id == null || id.isEmpty()) {
//						Spark.halt(401, String.format("Please login at {0}/login", PREFIX));
//					}
//				}
//			}
//		});

		Spark.post(PREFIX + "/login", new Route() {
			public Object handle(Request request, Response response)
					throws SQLException, Exception {
				String user = request.queryParams("user");
				String password = request.queryParams("pass");
				LoginDao dao = new LoginDao();
				FollowerEntity follower = dao.getUser(user, password);
				if (follower.equals(null)) {
					response.status(404);
					return "Fail";
				} else {
					Session session = request.session(true);
					session.attribute("id", follower.getId());
					response.status(200);
					return mapper.writeValueAsString(follower);
				}
			}
		});

		// get account info api e.g. /account
		Spark.get(PREFIX + "/follower/account", new Route() {
			public Object handle(Request request, Response response)
					throws SQLException, Exception {
				String followerId = request.session().attribute("id");
				LoginDao dao = new LoginDao();
				List<Following> followingList = dao.getAccount(followerId);
				return mapper.writeValueAsString(followingList);

			}
		});

		// follow trader api
		Spark.post(PREFIX + "/follower/:id/follow", new Route() {
			public Object handle(Request request, Response response)
					throws SQLException, Exception {
				String followerId =request.queryParams(":id");

				String traderId = request.queryParams("traderid");
				int moneyAllocate = Integer.parseInt(request
						.queryParams("money"));
				int maxOpen = Integer.parseInt(request.queryParams("maxopen"));
				LoginDao dao = new LoginDao();

				dao.followTrader(followerId, traderId, moneyAllocate, maxOpen);

				response.status(200);
				return "ok";
			}
		});

		// unfollow trader api
		Spark.get(PREFIX + "/follower/:id/unfollow/:traderid", new Route() {
			public Object handle(Request request, Response response)
					throws Exception {
				String traderId = request.params(":traderid");
				String followerId = request.queryParams(":id");
				
				LoginDao dao = new LoginDao();
				dao.unfollowTrader(followerId, traderId);

				response.status(200);
				return "ok";
			}
		});
		
		Spark.put(PREFIX + "/follower/:id", new Route() {
			public Object handle(Request request, Response response)
					throws Exception {

				int newRiskFactor = Integer.parseInt(request.queryParams("riskfactor"));
				String followerId = request.params(":id");

				LoginDao dao = new LoginDao();
				dao.updateRiskFactor(followerId, newRiskFactor);

				response.status(200);
				return "ok";
			}
		});

	}
}
