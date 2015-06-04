package vn.com.vndirect.socialtrading.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import vn.com.vndirect.socialtrading.Config;
import vn.com.vndirect.socialtrading.entity.TraderEntity;

public class TraderDao {
    private final Connection connection;

    public TraderDao() throws SQLException {
        connection = DriverManager.getConnection(
                Config.DB_URL, Config.DB_USERNAME, Config.DB_PASSWORD);
    }

    public List<TraderEntity> allTraders() throws SQLException {
        ResultSet rs = connection.prepareStatement("SELECT * FROM trader").executeQuery();
        List<TraderEntity> traders = new ArrayList<TraderEntity>();

        while (rs.next()) {
            TraderEntity t = parseTrader(rs);
            traders.add(t);
        }

        return traders;
    }

    // Might return null if no such trader is found
    // FIXME: throw an exception?
    public TraderEntity getTraderById(String id) throws SQLException {
        PreparedStatement query = connection.prepareStatement("SELECT * FROM trader WHERE traderid = ?");
        query.setString(1, id);

        ResultSet rs = query.executeQuery();
        TraderEntity t = null;
        while (rs.next()) {
            t = parseTrader(rs);
        }

        return t;
    }

    private TraderEntity parseTrader(ResultSet rs) throws SQLException {
        TraderEntity trader = new TraderEntity();
        trader.setId(rs.getString("traderid"));
        trader.setCash(rs.getFloat("cash"));
        trader.setMoneyFollow(rs.getFloat("monneyfollow"));
        trader.setNumberFollow(rs.getInt("numberfollow"));

        return trader;
    }
    
    public float getTraderProfitAccumulate(String id ) throws SQLException {
        PreparedStatement query = connection.prepareStatement("SELECT * FROM history, orderlist  WHERE id = ? and history.orderid = orderlist.orderid order by history.date asc");
        query.setString(1, id);
        float MoneyAccumulate =0;
        ResultSet rs = query.executeQuery();
        
        while (rs.next()) {
        	if(rs.getInt("side") ==1)
        	   MoneyAccumulate -= rs.getInt("quantity")  * rs.getInt("price");
        	else
        		MoneyAccumulate += rs.getInt("quantity")  * rs.getInt("price");
        }
        query = connection.prepareStatement("SELECT * FROM portfolio  WHERE id = ? ");
        query.setString(1, id);
        while (rs.next()) {
        	   MoneyAccumulate += rs.getInt("quantity")  * rs.getInt("cost");
        }
        
        return MoneyAccumulate;
    }
    
    public Map<Timestamp,Float> getTraderProfitMap(String id ) throws SQLException {
    	PreparedStatement query = connection.prepareStatement("SELECT * FROM accumulate WHERE id = ?  order by date asc");
        query.setString(1, id);
        Map<Timestamp,Float> MoneyAccumulateMap = new HashMap<Timestamp, Float>();
        ResultSet rs = query.executeQuery();
        
        while (rs.next()) {
        	MoneyAccumulateMap.put(rs.getTimestamp("date"), rs.getFloat("profit"));
        }
        
        return MoneyAccumulateMap;
    }
}
