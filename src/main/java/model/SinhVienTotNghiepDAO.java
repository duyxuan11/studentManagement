package model;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class SinhVienTotNghiepDAO {
	public static List<SinhVienTotNghiep> findSinhVienTotNghiep(Connection conn,String soCMND, String hoTen, String maNganh,String maTruong,String maNganhDangLam,String tenCongTy,String thoiGianLamViec) throws SQLException{
		String sql = "SELECT sv.SoCMND, sv.HoTen, tn.MaNganh, tn.MaTruong, cv.MaNganh AS MaNganhDangLamViec, cv.TenCongTy, cv.ThoiGianLamViec "
				+ "FROM SINHVIEN sv JOIN TOT_NGHIEP tn ON sv.SoCMND = tn.SoCMND JOIN CONG_VIEC cv ON sv.SoCMND = cv.SoCMND "
				+ "where sv.SoCMND like ? or sv.HoTen like ? or tn.MaNganh like ? or tn.MaTruong like ? or cv.MaNganh like ? or cv.TenCongTy like ? or cv.ThoiGianLamViec like ?";

		PreparedStatement pstm = conn.prepareStatement(sql);
		pstm.setString(1, soCMND);
		pstm.setString(2, hoTen);
		pstm.setString(3, maNganh);
		pstm.setString(4, maTruong);
		pstm.setString(5, maNganhDangLam);
		pstm.setString(6, tenCongTy);
		pstm.setString(7, thoiGianLamViec);
		

		ResultSet rs = pstm.executeQuery();
		List<SinhVienTotNghiep> list = new ArrayList<SinhVienTotNghiep>();
		while (rs.next()) {
			String soCMND1 = rs.getString("SoCMND");
			String hoTen1 = rs.getString("HoTen");
			String maNganh1 = rs.getString("MaNganh");
			String maTruong1 = rs.getString("MaTruong");
			String maNganhDangLam1 = rs.getString("MaNganhDangLamViec");
			String tenCongTy1 = rs.getString("TenCongTy");
			String thoiGianLamViec1 = rs.getString("ThoiGianLamViec");
			
			SinhVienTotNghiep svtn = new SinhVienTotNghiep();
			svtn.setSoCMND(soCMND1);
			svtn.setHoTen(hoTen1);
			svtn.setMaNganh(maNganh1);
			svtn.setMaTruong(maTruong1);
			svtn.setMaNganhDangLam(maNganhDangLam1);
			svtn.setTenCongTy(tenCongTy1);
			svtn.setThoiGianLamViec(thoiGianLamViec1);
			list.add(svtn);
		}
		return list;
	}
	
	public static List<SinhVienTotNghiep> querySinhVienTotNghiep(Connection conn) throws SQLException{
		String sql = "SELECT sv.SoCMND, sv.HoTen, tn.MaNganh, tn.MaTruong, cv.MaNganh AS MaNganhDangLamViec, cv.TenCongTy, cv.ThoiGianLamViec "
				+ "FROM SINHVIEN sv JOIN TOT_NGHIEP tn ON sv.SoCMND = tn.SoCMND JOIN CONG_VIEC cv ON sv.SoCMND = cv.SoCMND ";
		
		PreparedStatement pstm = conn.prepareStatement(sql);
		ResultSet rs = pstm.executeQuery();
		List<SinhVienTotNghiep> list = new ArrayList<SinhVienTotNghiep>();
		while (rs.next()) {
			String soCMND1 = rs.getString("SoCMND");
			String hoTen1 = rs.getString("HoTen");
			String maNganh1 = rs.getString("MaNganh");
			String maTruong1 = rs.getString("MaTruong");
			String maNganhDangLam1 = rs.getString("MaNganhDangLamViec");
			String tenCongTy1 = rs.getString("TenCongTy");
			String thoiGianLamViec1 = rs.getString("ThoiGianLamViec");
			
			SinhVienTotNghiep svtn = new SinhVienTotNghiep();
			svtn.setSoCMND(soCMND1);
			svtn.setHoTen(hoTen1);
			svtn.setMaNganh(maNganh1);
			svtn.setMaTruong(maTruong1);
			svtn.setMaNganhDangLam(maNganhDangLam1);
			svtn.setTenCongTy(tenCongTy1);
			svtn.setThoiGianLamViec(thoiGianLamViec1);
			list.add(svtn);
		}
		return list;
	}
}
