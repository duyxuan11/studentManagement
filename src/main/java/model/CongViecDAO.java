package model;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class CongViecDAO {
	public static void insertTotNghiep(Connection conn, CongViec congViec) throws SQLException {
		String sql = "INSERT INTO CONG_VIEC (SoCMND,NgayVaoCongTy,MaNganh,TenCongViec,TenCongTy,DiaChiCongTy,ThoiGianLamViec) VALUES (?,?,?,?,?,?,?)";

		PreparedStatement pstm = conn.prepareStatement(sql);

		pstm.setString(1, congViec.getSoCMND());
		pstm.setString(2, congViec.getNgayVaoCongTy());
		pstm.setString(3, congViec.getMaNganh());
		pstm.setString(4, congViec.getTenCongViec());
		pstm.setString(5, congViec.getTenCongTy());
		pstm.setString(6, congViec.getDiaChiCongty());
		pstm.setString(7, congViec.getThoiGianLamViec());
		pstm.executeUpdate();
	}
}
