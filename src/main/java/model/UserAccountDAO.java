package model;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;


public class UserAccountDAO {
	public static UserAccount findUser(Connection conn, String userName, String password) throws SQLException {

		String sql = "Select UserName, passwd, SoDT from User_Account " 
				+ " where UserName = ? and passwd= ?";

		PreparedStatement pstm = conn.prepareStatement(sql);
		pstm.setString(1, userName);
		pstm.setString(2, password);
		ResultSet rs = pstm.executeQuery();

		if (rs.next()) {
			String soDT = rs.getString("SoDT");
			UserAccount user = new UserAccount();
			user.setUserName(userName);
			user.setPassword(password);
			user.setSoDT(soDT);
			return user;
		}
		return null;
	}
	
	public static UserAccount findUserByName(Connection conn, String userName) throws SQLException {

		String sql = "Select UserName, passwd, SoDT from User_Account " 
				+ " where UserName = ?";

		PreparedStatement pstm = conn.prepareStatement(sql);
		pstm.setString(1, userName);
		ResultSet rs = pstm.executeQuery();

		if (rs.next()) {
			String password = rs.getString("passwd");
			String soDT = rs.getString("SoDT");
			UserAccount user = new UserAccount();
			user.setUserName(userName);
			user.setPassword(password);
			user.setSoDT(soDT);
			return user;
		}
		return null;
	}
}
