package model;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class TruongDAO {
	public static List<Truong> queryTruong(Connection conn) throws SQLException{
		String sql = "Select * from TRUONG ";

		PreparedStatement pstm = conn.prepareStatement(sql);

		ResultSet rs = pstm.executeQuery();
		List<Truong> list = new ArrayList<Truong>();
		while (rs.next()) {
			String maTruong = rs.getString("MaTruong");
			String tenTruong = rs.getString("TenTruong");
			String diaChi = rs.getString("DiaChi");
			String SoDT = rs.getString("SoDT");
			Truong truong = new Truong();
			truong.setMaTruong(maTruong);
			truong.setTenTruong(tenTruong);
			truong.setDiaChi(diaChi);
			truong.setSoDT(SoDT);
			list.add(truong);
		}
		return list;
	}
}
