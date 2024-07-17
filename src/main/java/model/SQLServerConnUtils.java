package model;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class SQLServerConnUtils {
	    
	public static Connection getSQLServerConnection_SQLJDBC() //
			throws ClassNotFoundException, SQLException {

		// Chú ý: Thay đổi các thông số kết nối cho phù hợp.
//		String hostName = "localhost";
//		String sqlInstanceName = "DESKTOP-CPK38TQ";
//		String database = "SINHVIENTOTNGHIEP";
//		String userName = "sa";
//		String password = "123456";
		
		 String jdbcURL = "jdbc:mysql://localhost:3306/demo?useSSL=false";
		 String jdbcUsername = "root";
		 String jdbcPassword = "";

//		return getSQLServerConnection_SQLJDBC(hostName, sqlInstanceName, database, userName, password);
		 return getSQLServerConnection_SQLJDBC(jdbcURL,jdbcUsername,jdbcPassword);
	}
	
	private static Connection getSQLServerConnection_SQLJDBC(String jdbcURL, //
			 String jdbcUsername, String jdbcPassword)//
			throws ClassNotFoundException, SQLException {

		//Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
		//jdbc:sqlserver://localhost:1433;instance=DESKTOP-CPK38TQ;databaseName=SINHVIENTOTNGHIEP
//		String connectionURL = "jdbc:sqlserver://" + hostName + ":1433" //
//				+ ";instance=" + sqlInstanceName + ";databaseName=" + database;
		Class.forName("com.mysql.jdbc.Driver");
		String connection = "jdbc:mysql://localhost:3306/sinhvientotnghiep?useSSL=false";

		Connection conn = DriverManager.getConnection(connection, jdbcUsername, jdbcPassword);
		return conn;
	}

//	private static Connection getSQLServerConnection_SQLJDBC(String hostName, //
//			String sqlInstanceName, String database, String userName, String password)//
//			throws ClassNotFoundException, SQLException {
//
//		//Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
//		//jdbc:sqlserver://localhost:1433;instance=DESKTOP-CPK38TQ;databaseName=SINHVIENTOTNGHIEP
////		String connectionURL = "jdbc:sqlserver://" + hostName + ":1433" //
////				+ ";instance=" + sqlInstanceName + ";databaseName=" + database;
//		Class.forName("com.mysql.jdbc.Driver");
//		String connection = DriverManager.getConnection(jdbcURL, jdbcUsername, jdbcPassword);
//
//		Connection conn = DriverManager.getConnection(connection, userName, password);
//		return conn;
//	}
}
