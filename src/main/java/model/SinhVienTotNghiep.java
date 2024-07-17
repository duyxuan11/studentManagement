package model;

public class SinhVienTotNghiep {
	private String soCMND;
	private String hoTen;
	private String maNganh;
	private String maTruong;
	private String maNganhDangLam;
	private String tenCongTy;
	private String thoiGianLamViec;
	
	public SinhVienTotNghiep() {
		// TODO Auto-generated constructor stub
	}
	
	public SinhVienTotNghiep(String soCMND, String hoTen, String maNganh,String maTruong,String maNganhDangLam,String tenCongTy,String thoiGianLamViec) {
		this.soCMND = soCMND; 
		this.hoTen = hoTen;
		this.maNganh = maNganh;
		this.maTruong = maTruong;
		this.maNganhDangLam = maNganhDangLam;
		this.tenCongTy = tenCongTy;
		this.thoiGianLamViec = thoiGianLamViec;
	}

	public String getSoCMND() {
		return soCMND;
	}

	public void setSoCMND(String soCMND) {
		this.soCMND = soCMND;
	}

	public String getHoTen() {
		return hoTen;
	}

	public void setHoTen(String hoTen) {
		this.hoTen = hoTen;
	}

	public String getMaNganh() {
		return maNganh;
	}

	public void setMaNganh(String maNganh) {
		this.maNganh = maNganh;
	}

	public String getMaTruong() {
		return maTruong;
	}

	public void setMaTruong(String maTruong) {
		this.maTruong = maTruong;
	}

	public String getMaNganhDangLam() {
		return maNganhDangLam;
	}

	public void setMaNganhDangLam(String maNganh2) {
		this.maNganhDangLam = maNganh2;
	}

	public String getTenCongTy() {
		return tenCongTy;
	}

	public void setTenCongTy(String tenCongTy) {
		this.tenCongTy = tenCongTy;
	}

	public String getThoiGianLamViec() {
		return thoiGianLamViec;
	}

	public void setThoiGianLamViec(String thoiGianLamViec) {
		this.thoiGianLamViec = thoiGianLamViec;
	}
	
	
	
	
}
