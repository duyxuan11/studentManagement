package model;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class TotNghiepDAO {
	public static void insertTotNghiep(Connection conn, TotNghiep totNghiep) throws SQLException {
		String sql = "Insert into TOT_NGHIEP(SoCMND,MaTruong, MaNganh, HeTN, NgayTN, LoaiTN) values (?,?,?,?,?,?)";

		PreparedStatement pstm = conn.prepareStatement(sql);

		pstm.setString(1, totNghiep.getSoCMND());
		pstm.setString(2, totNghiep.getMaTruong());
		pstm.setString(3, totNghiep.getMaNganh());
		pstm.setString(4, totNghiep.getHeTN());
		pstm.setString(5, totNghiep.getNgayTN());
		pstm.setString(6, totNghiep.getLoaiTN());
		
		pstm.executeUpdate();
	}
}
