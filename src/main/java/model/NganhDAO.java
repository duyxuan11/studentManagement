package model;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class NganhDAO {
	public static List<Nganh> queryNganh(Connection conn) throws SQLException{
		String sql = "Select * from NGANH ";

		PreparedStatement pstm = conn.prepareStatement(sql);

		ResultSet rs = pstm.executeQuery();
		List<Nganh> list = new ArrayList<Nganh>();
		while (rs.next()) {
			String maNganh = rs.getString("MaNganh");
			String tenNganh = rs.getString("TenNganh");
			String loaiNganh = rs.getString("LoaiNganh");
			Nganh nganh = new Nganh();
			nganh.setMaNganh(maNganh);
			nganh.setTenNganh(tenNganh);
			nganh.setLoaiNganh(loaiNganh);
			list.add(nganh);
		}
		return list;
	}
}
