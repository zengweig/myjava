package cn.sanxiau.bean;

import java.util.Date;

public class Phone {
	
	private int phone_id;
	
	private String status;
	
	private String type;
	
	private Date admission;
	
	private String level;
	
	private String brand;
	
	private int user_id;

	public int getPhone_id() {
		return phone_id;
	}

	public void setPhone_id(int phone_id) {
		this.phone_id = phone_id;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public Date getAdmission() {
		return admission;
	}

	public void setAdmission(Date admission) {
		this.admission = admission;
	}

	public String getLevel() {
		return level;
	}

	public void setLevel(String level) {
		this.level = level;
	}

	public String getBrand() {
		return brand;
	}

	public void setBrand(String brand) {
		this.brand = brand;
	}

	public int getUser_id() {
		return user_id;
	}

	public void setUser_id(int user_id) {
		this.user_id = user_id;
	}

	public Phone(int phone_id, String status, String type, Date admission,
			String level, String brand, int user_id) {
		this.phone_id = phone_id;
		this.status = status;
		this.type = type;
		this.admission = admission;
		this.level = level;
		this.brand = brand;
		this.user_id = user_id;
	}

	public Phone(String status, String type, Date admission, String level,
			String brand, int user_id) {
		this.status = status;
		this.type = type;
		this.admission = admission;
		this.level = level;
		this.brand = brand;
		this.user_id = user_id;
	}

	public Phone() {

	}
	
	
	
}
