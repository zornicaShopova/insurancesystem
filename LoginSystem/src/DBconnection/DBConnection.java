package DBconnection;

import java.sql.*;
import java.util.logging.Level;
import java.util.logging.Logger;

import com.mysql.cj.jdbc.MysqlDataSource;

public class DBConnection {

	private static String  servername = "localhost";
	private static String  username = "root";
	private static String  dbname = "insurance";
	private static String  password= "";
	private static Integer portnumber = 3306;
	PreparedStatement prepStmt = null;
	public static Connection getConnection(){
		Connection cnx = null;
		
		MysqlDataSource datasource = new MysqlDataSource();
		
		datasource.setServerName(servername);
		datasource.setUser(username);
		datasource.setPassword(password);
		datasource.setDatabaseName(dbname);
		datasource.setPort(portnumber);
		
		try {
			cnx = datasource.getConnection();
			}catch (SQLException e) {
				Logger.getLogger("Get Connection.-> " + DBConnection.class.getName()).log(Level.SEVERE,null,e);
			}
		
		return cnx;
	}
	
	public void insertinsurance(String fname,String faddress, String gsm) throws SQLException ,Exception{
		String query = "INSERT INTO insurance (fname,faddress,gsm) VALUES(?,?,?)";
		
		
		
	}
	
	
}
