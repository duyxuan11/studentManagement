package model;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;




public class SinhVienDAO {
	public static List<SinhVien> querySinhVien(Connection conn) throws SQLException{
		String sql = "Select * from SINHVIEN ";

		PreparedStatement pstm = conn.prepareStatement(sql);

		ResultSet rs = pstm.executeQuery();
		List<SinhVien> list = new ArrayList<SinhVien>();
		while (rs.next()) {
			String soCMND = rs.getString("SoCMND");
			String hoTen = rs.getString("HoTen");
			String email = rs.getString("Email");
			String soDT = rs.getString("SoDT");
			String diaChi = rs.getString("DiaChi");
			SinhVien sinhVien = new SinhVien();
			sinhVien.setSoCMND(soCMND);
			sinhVien.setHoTen(hoTen);
			sinhVien.setEmail(email);
			sinhVien.setSoDT(soDT);
			sinhVien.setDiaChi(diaChi);
			list.add(sinhVien);
		}
		return list;
	}
	
	public static List<SinhVien> findSinhVienList (Connection conn, String soCMND,String hoTen,String email,String soDT, String diaChi) throws SQLException {
		String sql = "Select * from SINHVIEN where SoCMND = ? or HoTen = ? or Email = ? or SoDT = ? or DiaChi = ?";

		PreparedStatement pstm = conn.prepareStatement(sql);
		pstm.setString(1, soCMND);
		pstm.setString(2, hoTen);
		pstm.setString(3, email);
		pstm.setString(4, soDT);
		pstm.setString(5, diaChi);

		ResultSet rs = pstm.executeQuery();
		List<SinhVien> list = new ArrayList<SinhVien>();
		while (rs.next()) {
			String soCMND1 = rs.getString("SoCMND");
			String hoTen1 = rs.getString("HoTen");
			String email1 = rs.getString("Email");
			String soDT1 = rs.getString("SoDT");
			String diaChi1 = rs.getString("DiaChi");
			
			SinhVien sinhVien = new SinhVien();
			sinhVien.setSoCMND(soCMND1);
			sinhVien.setHoTen(hoTen1);
			sinhVien.setEmail(email1);
			sinhVien.setSoDT(soDT1);
			sinhVien.setDiaChi(diaChi1);
			list.add(sinhVien);
		}
		return list;
	}
	
	public static SinhVien checkSinhVien(Connection conn, String code) throws SQLException {
		String sql = "Select * from SINHVIEN where SoCMND LIKE ?";

		PreparedStatement pstm = conn.prepareStatement(sql);
		pstm.setString(1, code);

		ResultSet rs = pstm.executeQuery();

		while (rs.next()) {
			String soCMND1 = rs.getString("SoCMND");
			String hoTen1 = rs.getString("HoTen");
			String email1 = rs.getString("Email");
			String soDT1 = rs.getString("SoDT");
			String diaChi1 = rs.getString("DiaChi");
			SinhVien sinhVien = new SinhVien(soCMND1,hoTen1,email1,soDT1,diaChi1);
			return sinhVien;
		}
		return null;
	}
	
	public static void insertSinhVien(Connection conn, SinhVien sinhVien) throws SQLException {
		String sql = "Insert into SINHVIEN(SoCMND, HoTen, Email, SoDT, DiaChi) values (?,?,?,?,?)";

		PreparedStatement pstm = conn.prepareStatement(sql);

		pstm.setString(1, sinhVien.getSoCMND());
		pstm.setString(2, sinhVien.getHoTen());
		pstm.setString(3, sinhVien.getEmail());
		pstm.setString(4, sinhVien.getSoDT());
		pstm.setString(5, sinhVien.getDiaChi());

		pstm.executeUpdate();
	}
	
	public static void updateSinhVien(Connection conn, SinhVien sinhVien) throws SQLException {
		String sql = "Update SINHVIEN set HoTen =?, Email=?, SoDT=?, DiaChi=? where SoCMND=? ";

		PreparedStatement pstm = conn.prepareStatement(sql);

		pstm.setString(1, sinhVien.getHoTen());
		pstm.setString(2, sinhVien.getEmail());
		pstm.setString(3, sinhVien.getSoDT());
		pstm.setString(4, sinhVien.getDiaChi());
		pstm.setString(5, sinhVien.getSoCMND());
		pstm.executeUpdate();
	}
	
	public static void deleteSinhVien(Connection conn, String soCMND) throws SQLException {
		String sql = "Delete From SINHVIEN where SoCMND= ?";

		PreparedStatement pstm = conn.prepareStatement(sql);

		pstm.setString(1, soCMND);

		pstm.executeUpdate();
	}
}
