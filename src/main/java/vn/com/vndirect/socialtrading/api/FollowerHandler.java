package vn.com.vndirect.socialtrading.api;

import org.codehaus.jackson.map.DeserializationConfig;
import org.codehaus.jackson.map.ObjectMapper;
import spark.*;
import vn.com.vndirect.socialtrading.dao.FollowerDao;
import vn.com.vndirect.socialtrading.entity.ExecutedOrder;
import vn.com.vndirect.socialtrading.entity.FollowerEntity;
import vn.com.vndirect.socialtrading.entity.Following;
import vn.com.vndirect.socialtrading.entity.PortfolioRow;

import java.sql.SQLException;
import java.util.HashMap;
import java.util.List;


class JsonTransformer implements ResponseTransformer {
	private ObjectMapper mapper = new ObjectMapper();

	@Override
	public String render(Object model) throws Exception {
		return mapper.writeValueAsString(model);
	}
}


public class FollowerHandler extends AbstractHandler {
	public FollowerHandler() {
		this(new FollowerDao());
	}

	public FollowerHandler(final FollowerDao followerDao) {
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

		Spark.get(PREFIX + "/me", new Route() {
			public Object handle(Request request, Response response) throws Exception {
				String userId = (String) request.session().attribute("id");
				if (userId == null) {
					Spark.halt(401);
					return null;
				} else {
					FollowerEntity follower = followerDao.get(userId);
					return follower;
				}
			}
		}, new JsonTransformer());

		Spark.put(PREFIX + "/me", new Route() {
			@Override
			public Object handle(Request request, Response response) throws Exception {
				response.redirect(PREFIX + "/follower/" + request.session().attribute("id"));
				return null;
			}
		}, new JsonTransformer());

		// get portfolio's detail of follower or trader 
		Spark.get(PREFIX + "/follower/:id/portfolio", new Route() {
			public Object handle(Request request, Response response)
					throws SQLException, Exception {
				String followerId = request.params(":id");
				List<PortfolioRow> portfolioRowList = followerDao.getPortfolio(followerId);
				return portfolioRowList;
			}
		}, new JsonTransformer());
		
		// get open order detail of follower or trader 
		Spark.get(PREFIX + "/follower/:id/sentorder", new Route() {
			public Object handle(Request request, Response response)
					throws SQLException, Exception {
				String followerId = request.params(":id");
				List<ExecutedOrder> waitingOrderList = followerDao
						.getSentOrder(followerId);
				return waitingOrderList;
			}
		}, new JsonTransformer());

		// List all traders this follower is following
		Spark.get(PREFIX + "/follower/:id/following", new Route() {
			public Object handle(Request request, Response response)
					throws SQLException, Exception {
				String followerId = request.params(":id");
				List<Following> followingList = followerDao.getAccount(followerId);
				return followingList;
			}
		}, new JsonTransformer());

		// follow a trader
		Spark.post(PREFIX + "/follower/:id/following", new Route() {
			public Object handle(Request request, Response response)
					throws Exception {
				String followerId = request.params(":id");
				String traderId = request.queryParams("traderId");

				try {
					float moneyAllocate = Float.parseFloat(request
							.queryParams("money"));
					int maxOpen = Integer.parseInt(request.queryParams("maxOpen"));

					followerDao.followTrader(followerId, traderId, moneyAllocate, maxOpen);
					HashMap<String, Object> result = new HashMap<>();
					result.put("id", followerId);
					result.put("traderId", traderId);
					result.put("money", moneyAllocate);
					result.put("maxOpen", maxOpen);

					return result;
				} catch (NumberFormatException e) {
					e.printStackTrace();
					Spark.halt(400);
					return null;
				}
			}
		}, new JsonTransformer());

		// unfollow a trader
		Spark.delete(PREFIX + "/follower/:id/following/:traderid", new Route() {
			public Object handle(Request request, Response response)
					throws Exception {
				String traderId = request.params(":traderId");
				String followerId = request.params(":id");

				followerDao.unfollowTrader(followerId, traderId);

				return null;
			}
		}, new JsonTransformer());

		// Update a follower
		Spark.put(PREFIX + "/follower/:id", new Route() {
			public Object handle(Request request, Response response)
					throws Exception {
				if (!request.params(":id").equals(request.session().attribute("id"))) {
					Spark.halt(401);
				}

				FollowerEntity current = followerDao.getFollower(request.params(":id"));
				FollowerEntity updated = null;

				// TODO: Validation. Null check.
				try {
					updated = mapper.readValue(request.body(), FollowerEntity.class);
				} catch (Exception e) {
					e.printStackTrace();
				}

				updated.setId(current.getId());
				boolean ok = followerDao.save(updated);

				if (ok) {
					response.status(200);
				} else {
					response.status(500);
				}
				return null;
			}
		}, new JsonTransformer());

	}
}
