package vn.com.vndirect.socialtrading.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;

import vn.com.vndirect.socialtrading.App;
import vn.com.vndirect.socialtrading.Config;
import vn.com.vndirect.socialtrading.entity.Follower;
import vn.com.vndirect.socialtrading.entity.FollowerEntity;
import vn.com.vndirect.socialtrading.entity.Following;
import vn.com.vndirect.socialtrading.entity.PortfolioRow;
import vn.com.vndirect.socialtrading.entity.TraderEntity;

public class LoginDao implements Dao<FollowerEntity, String> {
	private final Connection connection;

	public LoginDao() throws SQLException {
		connection = DriverManager.getConnection(Config.DB_URL,
				Config.DB_USERNAME, Config.DB_PASSWORD);
	}

	public FollowerEntity authenticate(String user1, String password1) throws SQLException {
		PreparedStatement stmt = connection
				.prepareStatement("SELECT * FROM account where  username =? and password =?");
		stmt.setString(1, user1);
		stmt.setString(2, password1);

		ResultSet rs = stmt.executeQuery();
		FollowerEntity follower = new FollowerEntity();
		while (rs.next()) {
			follower = parseFollowerEntity(rs);
		}

		return follower;
	}

	public FollowerEntity getFollower(String id) throws SQLException {
		PreparedStatement stmt = connection
				.prepareStatement("SELECT * FROM account where  username =? and password =?");
		stmt.setString(1, id);

		ResultSet rs = stmt.executeQuery();
		FollowerEntity follower = null;
		while (rs.next()) {
			follower = parseFollowerEntity(rs);
		}

		return follower;
	}
	
	public List<PortfolioRow> getPortfolio(String followerId) throws SQLException {
		PreparedStatement stmt = connection
				.prepareStatement("select * from portfolio where id= ? ");
		stmt.setString(1, followerId);
		ResultSet rs = stmt.executeQuery();
		List<PortfolioRow> portfolioRowList = new ArrayList<PortfolioRow>();
		while (rs.next()) {
			PortfolioRow t = parsePortfolioRow(rs);
			portfolioRowList.add(t);
		}

		return portfolioRowList;
	}
	
	private PortfolioRow parsePortfolioRow(ResultSet rs) throws SQLException {
		PortfolioRow portfolioRow = new PortfolioRow();
		portfolioRow.setStock(rs.getString("stock"));
		portfolioRow.setQuantity(rs.getInt("quantity"));
		portfolioRow.setCost(rs.getInt("cost"));

		return portfolioRow;
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

	public void followTrader(String followerId, String traderId, int money,
			int maxOpen) throws SQLException {
		PreparedStatement stmt = connection
				.prepareStatement("insert into  following (id,traderid,moneyallocate,maxopen,transactionid) VALUES (?,?,?,?,?);");
		String transactionId = followerId + "_" + traderId;
		stmt.setString(1, followerId);
		stmt.setString(2, traderId);
		stmt.setInt(3, money);
		stmt.setInt(4, maxOpen);
		stmt.setString(5, transactionId);
		try{
			stmt.executeUpdate();
		}
		catch(Exception e){
			stmt.close();
			return;
		}
		stmt.close();
		TraderEntity trader = App.listOfTraderEntity.get(traderId);
		int curentFollow = trader.getNumberFollow();
		float curentMoneyfollow = trader.getNumberFollow();
		
		if(! App.mapOfTrader.containsKey(traderId)) App.mapOfTrader.put(traderId,  new ArrayList<Follower>());
		List<Follower> listFollower = App.mapOfTrader.get(traderId);
		
		Follower follower = new Follower();
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
		stmt1.setString(3, traderId);
		stmt1.executeUpdate();
		stmt1.close();
	}

	public void unfollowTrader(String followerId, String traderId)
			throws SQLException {
		PreparedStatement stmt = connection
				.prepareStatement("delete from following where id=? and traderid=?");
		stmt.setString(1, followerId);
		stmt.setString(2, traderId);
		stmt.executeUpdate();
		stmt.close();

		TraderEntity trader = App.listOfTraderEntity.get(traderId);
		int curentFollow = trader.getNumberFollow();
		float curentMoneyfollow = trader.getMoneyFollow();
		
		Follower folower = new Follower();
		List<Follower> listFollower = App.mapOfTrader.get(traderId);
		
		Iterator<Follower> iter = listFollower.iterator();
		while(iter.hasNext()) {
		  Follower f = iter.next();
			if (f.getId().equals(followerId)) {
				folower = f;
				 iter.remove();
				break;
			}
		}

		trader.setMoneyFollow(curentMoneyfollow - folower.getMoneyAllocate());
		trader.setNumberFollow(curentFollow - 1);

		PreparedStatement stmt1 = connection
				.prepareStatement("update trader set numberfollow=?, monneyfollow =? where traderid=?;");
		stmt1.setInt(1, curentFollow - 1);
		stmt1.setFloat(2, curentMoneyfollow - folower.getMoneyAllocate());
		stmt1.setString(3, traderId);
		stmt1.executeUpdate();
		stmt1.close();
	}

	public List<FollowerEntity> all() {
		List<FollowerEntity> followers = new ArrayList<FollowerEntity>();

		try {
			ResultSet rs = connection
					.createStatement()
					.executeQuery("SELECT * FROM account");

			while(rs.next()) {
				FollowerEntity f = parseFollowerEntity(rs);
				followers.add(f);
			}

		} catch (SQLException e) {
			// FIXME: Log this error
			e.printStackTrace();
		}

		return followers;
	}

	public FollowerEntity get(String id) throws NotFoundException {
		FollowerEntity f = null;

		try {
			PreparedStatement query = connection
					.prepareStatement("SELECT * from account WHERE id = ?");
			query.setString(1, id);

			ResultSet rs = query.executeQuery();
			while (rs.next()) {
				f = parseFollowerEntity(rs);
			}

			if (f == null) {
				throw new NotFoundException();
			}

		} catch (SQLException e) {
			e.printStackTrace();
		}

		return f;
	}

	public boolean save(FollowerEntity object) {
		try {
			PreparedStatement updateStatement = connection
					.prepareStatement("UPDATE account SET cash = ?, risk_factor = ? WHERE id = ?");
			updateStatement.setFloat(1, object.getCash());
			updateStatement.setInt(2, object.getRiskfactor());
			updateStatement.setString(3, object.getId());

			int count = updateStatement.executeUpdate();

			return count == 1;
		} catch (SQLException e) {
			e.printStackTrace();
			return false;
		}
	}

	public boolean insert(FollowerEntity object) {
		// FIXME: Implementation
		return false;
	}

	public boolean delete(FollowerEntity object) {
		// FIXME: Implementation
		return false;
	}
}
