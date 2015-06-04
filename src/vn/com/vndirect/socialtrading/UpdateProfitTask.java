package vn.com.vndirect.socialtrading;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Timestamp;
import java.util.Date;
import java.util.TimerTask;

public class UpdateProfitTask extends TimerTask {
	private final Connection connection;

	public UpdateProfitTask() throws SQLException {
		connection = DriverManager.getConnection(Config.DB_URL,
				Config.DB_USERNAME, Config.DB_PASSWORD);
	}

	@Override
	public void run() {
		//Calendar rightNow = Calendar.getInstance();
		//int hour = rightNow.get(Calendar.HOUR_OF_DAY);
		//if(hour <16 || hour >17 ) return; //update accumulated profit for each trader from 4pm to 5pm every day
		
		try {
			PreparedStatement query = connection
					.prepareStatement("SELECT * FROM history, orderlist  WHERE history.orderid = orderlist.orderid order by id asc, history.date asc");

			float MoneyAccumulate = 0;
			ResultSet rs = query.executeQuery();
			String tempId = null;
			
			Date date = new Date(); 
			Timestamp dateA =    new Timestamp(date.getTime());
			while (rs.next()) {
				String curentId = rs.getString("id");
				if (tempId == null)
					tempId = curentId;
				
				if(!curentId.equals(tempId))
				{
					 PreparedStatement query1 = connection.prepareStatement("SELECT * FROM portfolio  WHERE id = ? ");
					
					 query1.setString(1, tempId); 
					 ResultSet rs1 =query1.executeQuery(); 
					 while (rs1.next()) {
						MoneyAccumulate += rs1.getInt("quantity") * rs1.getInt("cost"); 
					 }
					 rs1.close();
					 query1 = connection.prepareStatement("insert into accumulate  values (?,?,?) ");
						
					 query1.setString(1, tempId); 
					 query1.setFloat(2, MoneyAccumulate); 
					 query1.setTimestamp(3, dateA); 
					 
					 query1.executeQuery(); 
					 tempId = curentId;
					 MoneyAccumulate=0;
				}

				if (rs.getInt("side") == 1)
					MoneyAccumulate -= rs.getInt("quantity") * rs.getInt("price");
				else
					MoneyAccumulate += rs.getInt("quantity") * rs.getInt("price");
			}
			rs.close();

		} catch (SQLException ex) {

		}
	}
}
