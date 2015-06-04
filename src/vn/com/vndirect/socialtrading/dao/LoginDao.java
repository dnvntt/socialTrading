package vn.com.vndirect.socialtrading.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import vn.com.vndirect.socialtrading.App;
import vn.com.vndirect.socialtrading.Config;
import vn.com.vndirect.socialtrading.entity.Follower;
import vn.com.vndirect.socialtrading.entity.FollowerEntity;
import vn.com.vndirect.socialtrading.entity.Following;
import vn.com.vndirect.socialtrading.entity.TraderEntity;

public class LoginDao {
	private final Connection connection;

	public LoginDao() throws SQLException {
		connection = DriverManager.getConnection(Config.DB_URL,
				Config.DB_USERNAME, Config.DB_PASSWORD);
	}

	public FollowerEntity getUser(String user1, String password1) throws SQLException {
		PreparedStatement stmt = connection
				.prepareStatement("SELECT * FROM account where  username =? and password =?");
		stmt.setString(1, user1);
		stmt.setString(2, password1);

		ResultSet rs = stmt.executeQuery();
		FollowerEntity follower = null;
		while (rs.next()) {
			follower = parseFollowerEntity(rs);
		}

		return follower;
	}

	public List<Following> getAccount(String followerId) throws SQLException {
		PreparedStatement stmt = connection
				.prepareStatement("select b.traderid,b.username,b.numberfollow,b.monneyfollow,a.moneyAllocate,a.maxOpen   from following a, trader b  where id= ? and a.traderid = b.traderid;");
		stmt.setString(1, followerId);
		ResultSet rs = stmt.executeQuery();
		List<Following> followingList = new ArrayList<Following>();
		while (rs.next()) {
			Following t = parseFollowing(rs);
			followingList.add(t);
		}

		return followingList;
	}

	private FollowerEntity parseFollowerEntity(ResultSet rs) throws SQLException {
		FollowerEntity follower = new FollowerEntity();
		follower.setId(rs.getString("id"));
		follower.setCash(rs.getFloat("cash"));
		follower.setRiskfactor(rs.getInt("risk_factor"));

		return follower;
	}

	private Following parseFollowing(ResultSet rs) throws SQLException {
		Following following = new Following();
		following.setTraderId(rs.getString("traderid"));
		following.setMaxopen(rs.getInt("maxOpen"));
		following.setMoneyAllocate(rs.getFloat("moneyAllocate"));

		return following;
	}

	public void followTrader(String followerId, String traderrId, int money,
			int maxOpen) throws SQLException {
		PreparedStatement stmt = connection
				.prepareStatement("insert into  following (id,traderid,moneyallocate,maxopen,transactionid) VALUES (?,?,?,?);");
		String transactionId = followerId + "_" + traderrId;
		stmt.setString(1, followerId);
		stmt.setString(2, traderrId);
		stmt.setInt(3, money);
		stmt.setInt(4, maxOpen);
		stmt.setString(5, transactionId);
		stmt.executeQuery();
		stmt.close();
		TraderEntity trader = App.listOfTraderEntity.get(traderrId);
		int curentFollow = trader.getNumberFollow();
		float curentMoneyfollow = trader.getNumberFollow();

		List<Follower> listFollower = App.mapOfTrader.get(traderrId);
		
		Follower follower = null;
		follower.setId(followerId);
		follower.setCurrentOpen(0);follower.setCurrentAllocate(0);
		follower.setMaxopen(maxOpen);follower.setMoneyAllocate(money);
		follower.setMapStockOrderFollow(new HashMap<String, String>());
		follower.setMapStockQuantityFollow(new HashMap<String, Integer>());

		listFollower.add(follower);
		
		trader.setMoneyFollow(money + curentMoneyfollow);
		trader.setNumberFollow(1 + curentFollow);

		PreparedStatement stmt1 = connection
				.prepareStatement("update trader set numberfollow=?, monneyfollow =? where traderid=?;");
		stmt1.setInt(1, 1 + curentFollow);
		stmt1.setFloat(2, money + curentMoneyfollow);
		stmt1.setString(3, traderrId);
		stmt1.executeQuery();
		stmt1.close();
	}

	public void unfollowTrader(String followerId, String traderrId)
			throws SQLException {
		PreparedStatement stmt = connection
				.prepareStatement("delete from following where id=? and traderid=?");
		stmt.setString(1, followerId);
		stmt.setString(2, traderrId);
		stmt.executeQuery();
		stmt.close();

		TraderEntity trader = App.listOfTraderEntity.get(traderrId);
		int curentFollow = trader.getNumberFollow();
		float curentMoneyfollow = trader.getNumberFollow();
		Follower folower = null;
		List<Follower> listFollower = App.mapOfTrader.get(traderrId);
		for (Follower f : listFollower) {
			if (f.getId().equals(followerId)) {
				folower = f;
				listFollower.remove(f);
			}
		}

		trader.setMoneyFollow(curentMoneyfollow - folower.getMoneyAllocate());
		trader.setNumberFollow(curentFollow - 1);

		PreparedStatement stmt1 = connection
				.prepareStatement("update trader set numberfollow=?, monneyfollow =? where traderid=?;");
		stmt1.setInt(1, curentFollow - 1);
		stmt1.setFloat(2, curentMoneyfollow - folower.getMoneyAllocate());
		stmt1.setString(3, traderrId);
		stmt1.executeQuery();
		stmt1.close();
	}

	public void updateRiskFactor(String followerId, int riskValue)
			throws SQLException {
		PreparedStatement stmt = connection
				.prepareStatement("update account set risk_factor = ? where id=? ");
		stmt.setInt(1, riskValue);
		stmt.setString(2, followerId);
		stmt.executeQuery();
		stmt.close();
		
		FollowerEntity follower = App.listOfFollowerEntity.get(followerId);
		follower.setRiskfactor(riskValue);
	}
}
