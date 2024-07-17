package beans;

import java.sql.Date;
import java.text.SimpleDateFormat;

import org.apache.taglibs.standard.tag.el.sql.SetDataSourceTag;

public class TotNghiep {
	private String soCMND;
	private String maTruong;
	private String maNganh;
	private String heTN;
	private String ngayTN;
	private String loaiTN;
	
	public TotNghiep() {
		// TODO Auto-generated constructor stub
	}
	
	public TotNghiep(String soCMND,String maTruong,String maNganh,String heTN,String ngayTN,String loaiTN) {
		this.soCMND = soCMND;
		this.maTruong = maTruong;
		this.maNganh = maNganh;
		this.heTN = heTN;
		this.ngayTN = ngayTN;
		this.loaiTN = loaiTN;
	}

	public String getSoCMND() {
		return soCMND;
	}

	public void setSoCMND(String soCMND) {
		this.soCMND = soCMND;
	}

	public String getMaTruong() {
		return maTruong;
	}

	public void setMaTruong(String maTruong) {
		this.maTruong = maTruong;
	}

	public String getMaNganh() {
		return maNganh;
	}

	public void setMaNganh(String maNganh) {
		this.maNganh = maNganh;
	}

	public String getHeTN() {
		return heTN;
	}

	public void setHeTN(String heTN) {
		this.heTN = heTN;
	}

	public String getNgayTN() {
		return ngayTN;
	}

	public void setNgayTN(String ngayTN) {
		this.ngayTN = ngayTN;
	}

	public String getLoaiTN() {
		return loaiTN;
	}

	public void setLoaiTN(String loaiTN) {
		this.loaiTN = loaiTN;
	}
}
