package vn.com.vndirect.socialtrading.dao;


import vn.com.vndirect.socialtrading.Config;
import vn.com.vndirect.socialtrading.entity.Trader;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class TraderDao {
    private final Connection connection;

    public TraderDao() throws SQLException {
        connection = DriverManager.getConnection(
                Config.DB_URL, Config.DB_USERNAME, Config.DB_PASSWORD);
    }

    public List<Trader> allTraders() throws SQLException {
        ResultSet rs = connection.prepareStatement("SELECT * FROM trader").executeQuery();
        List<Trader> traders = new ArrayList<Trader>();

        while (rs.next()) {
            Trader t = parseTrader(rs);
            traders.add(t);
        }

        return traders;
    }

    // Might return null if no such trader is found
    // FIXME: throw an exception?
    public Trader getTraderById(String id) throws SQLException {
        PreparedStatement query = connection.prepareStatement("SELECT * FROM trader WHERE traderid = ?");
        query.setString(1, id);

        ResultSet rs = query.executeQuery();
        Trader t = null;
        while (rs.next()) {
            t = parseTrader(rs);
        }

        return t;
    }

    private Trader parseTrader(ResultSet rs) throws SQLException {
        Trader trader = new Trader();
        trader.setId(rs.getString("traderid"));
        trader.setCash(rs.getFloat("cash"));
        trader.setMoneyFollow(rs.getFloat("monneyfollow"));
        trader.setNumberFollow(rs.getInt("numberfollow"));
        trader.setName(rs.getString("name"));
        trader.setUsername(rs.getString("username"));

        return trader;
    }
}
