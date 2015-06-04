package vn.com.vndirect.socialtrading.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import vn.com.vndirect.socialtrading.Config;
import vn.com.vndirect.socialtrading.entity.Follower;
import vn.com.vndirect.socialtrading.entity.Following;

public class LoginDao {
	private final Connection connection;

    public LoginDao() throws SQLException {
        connection = DriverManager.getConnection(
                Config.DB_URL, Config.DB_USERNAME, Config.DB_PASSWORD);
    }

    public Follower getUser(String user1, String password1) throws SQLException {
    	PreparedStatement stmt =  connection.prepareStatement("SELECT * FROM account where  username =? and password =?");
    	stmt.setString(1, user1);
		stmt.setString(2, password1);

		ResultSet rs = stmt.executeQuery();
		Follower follower= null;
        while (rs.next()) {
        	follower=parseFollower(rs);
        }

        return follower;
    }

    public List<Following> getAccount(String followerId) throws SQLException {
    	PreparedStatement stmt =  connection.prepareStatement("select b.traderid,b.username,b.numberfollow,b.monneyfollow,a.moneyAllocate,a.maxOpen   from following a, trader b  where id= ? and a.traderid = b.traderid;");
    	stmt.setString(1, followerId);
		ResultSet rs = stmt.executeQuery();
		 List<Following> followingList = new ArrayList<Following>();
        while (rs.next()) {
        	Following t = parseFollowing(rs);
            followingList.add(t);
        }

        return followingList;
    }
    
    private Follower parseFollower(ResultSet rs) throws SQLException {
    	Follower follower = new Follower();
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
   
}
