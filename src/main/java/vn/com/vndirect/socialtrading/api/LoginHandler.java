package vn.com.vndirect.socialtrading.api;

import org.codehaus.jackson.map.DeserializationConfig;
import org.codehaus.jackson.map.ObjectMapper;
import spark.*;
import vn.com.vndirect.socialtrading.dao.LoginDao;
import vn.com.vndirect.socialtrading.entity.ExecutedOrder;
import vn.com.vndirect.socialtrading.entity.FollowerEntity;
import vn.com.vndirect.socialtrading.entity.Following;
import vn.com.vndirect.socialtrading.entity.PortfolioRow;

import java.sql.SQLException;
import java.util.List;

public class LoginHandler extends AbstractHandler {
	public LoginHandler() {
		final ObjectMapper mapper = new ObjectMapper();

		// Set this config key so that when the client pushes an object with alien properties,
		// we don't die.
		mapper.configure(DeserializationConfig.Feature.FAIL_ON_UNKNOWN_PROPERTIES, false);

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
				FollowerEntity follower = dao.authenticate(user, password);

				if (follower == null) {
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

		Spark.post(PREFIX + "/logout", new Route() {
			public Object handle(Request request, Response response) throws Exception {
				request.session().invalidate();
				return "ok";
			}
		});

		Spark.get(PREFIX + "/me", new Route() {
			public Object handle(Request request, Response response) throws Exception {
				LoginDao dao = new LoginDao();
				String userId = (String) request.session().attribute("id");
				if (userId == null) {
					Spark.halt(401);
					return null;
				} else {
					FollowerEntity follower = dao.get(userId);
					return mapper.writeValueAsString(follower);
				}
			}
		});

		Spark.put(PREFIX + "/me", new Route() {
			@Override
			public Object handle(Request request, Response response) throws Exception {
				response.redirect(PREFIX + "/follower/" + request.session().attribute("id"));
				return "";
			}
		});

		// List all traders this follower is following
		Spark.get(PREFIX + "/follower/:id/following", new Route() {
			public Object handle(Request request, Response response)
					throws SQLException, Exception {
				String followerId = request.params(":id");
				LoginDao dao = new LoginDao();
				List<Following> followingList = dao.getAccount(followerId);
				return mapper.writeValueAsString(followingList);
			}
		});

		// get portfolio's detail of follower or trader 
		Spark.get(PREFIX + "/follower/:id/portfolio", new Route() {
			public Object handle(Request request, Response response)
					throws SQLException, Exception {
				String followerId = request.params(":id");
				LoginDao dao = new LoginDao();
				List<PortfolioRow> portfolioRowList = dao.getPortfolio(followerId);
				return mapper.writeValueAsString(portfolioRowList);
			}
		});
		
		// get open order detail of follower or trader 
		Spark.get(PREFIX + "/follower/:id/sentorder", new Route() {
			public Object handle(Request request, Response response)
					throws SQLException, Exception {
				String followerId = request.params(":id");
				LoginDao dao = new LoginDao();
				List<ExecutedOrder> waitingOrderList = dao
						.getSentOrder(followerId);
				return mapper.writeValueAsString(waitingOrderList);
			}
		});
						
				
		// follow a trader
		Spark.post(PREFIX + "/follower/:id/following", new Route() {
			public Object handle(Request request, Response response)
					throws SQLException, Exception {
				// FIXME This method always returns 200 OK even on error

				String followerId = request.params(":id");
				String traderId = request.queryParams("traderid");

				try {
					int moneyAllocate = Integer.parseInt(request
							.queryParams("money"));
					int maxOpen = Integer.parseInt(request.queryParams("maxopen"));

					LoginDao dao = new LoginDao();

					dao.followTrader(followerId, traderId, moneyAllocate, maxOpen);
				} catch (NumberFormatException e) {
					Spark.halt(400);
				}

				return "";
			}
		});

		// unfollow a trader
		Spark.delete(PREFIX + "/follower/:id/following/:traderid", new Route() {
			public Object handle(Request request, Response response)
					throws Exception {
				String traderId = request.params(":traderid");
				String followerId = request.params(":id");

				LoginDao dao = new LoginDao();
				dao.unfollowTrader(followerId, traderId);

				response.status(200);
				return "ok";
			}
		});

		// Update a follower
		Spark.put(PREFIX + "/follower/:id", new Route() {
			public Object handle(Request request, Response response)
					throws Exception {
				if (!request.params(":id").equals(request.session().attribute("id"))) {
					Spark.halt(401);
				}

				LoginDao dao = new LoginDao();

				FollowerEntity current = dao.getFollower(request.params(":id"));
				FollowerEntity updated = null;

				// TODO: Validation. Null check.
				try {
					updated = mapper.readValue(request.body(), FollowerEntity.class);
				} catch (Exception e) {
					e.printStackTrace();
				}

				updated.setId(current.getId());
				boolean ok = dao.save(updated);

				if (ok) {
					response.status(200);
					return "{}";  // Backbone.Model.save() expects a valid JSON response
				} else {
					response.status(500);
					return "Error, please ask the admin to check the log.";
				}
			}
		});

	}
}
