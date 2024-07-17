package model;

public class Truong {
	private String maTruong;
	private String tenTruong;
	private String diaChi;
	private String soDT;
	
	public Truong() {
		
	}
	
	public Truong(String maTruong, String tenTruong, String diaChi, String email) {
		this.maTruong = maTruong;
		this.tenTruong = tenTruong;
		this.diaChi = diaChi;
		this.soDT = email;
	}
	
	/**
	 * @return the maTruong
	 */
	public String getMaTruong() {
		return maTruong;
	}

	/**
	 * @param maTruong the maTruong to set
	 */
	public void setMaTruong(String maTruong) {
		this.maTruong = maTruong;
	}

	/**
	 * @return the tenTruong
	 */
	public String getTenTruong() {
		return tenTruong;
	}

	/**
	 * @param tenTruong the tenTruong to set
	 */
	public void setTenTruong(String tenTruong) {
		this.tenTruong = tenTruong;
	}

	/**
	 * @return the diaChi
	 */
	public String getDiaChi() {
		return diaChi;
	}

	/**
	 * @param diaChi the diaChi to set
	 */
	public void setDiaChi(String diaChi) {
		this.diaChi = diaChi;
	}

	/**
	 * @return the email
	 */
	public String getSoDT() {
		return soDT;
	}

	/**
	 * @param email the email to set
	 */
	public void setSoDT(String soDT) {
		this.soDT = soDT;
	}

	
	
}
