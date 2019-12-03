package cn.sanxiau.bean;

public class User {
	
	private int id;
	
	private String username;
	
	private String pwd;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPwd() {
		return pwd;
	}

	public void setPwd(String pwd) {
		this.pwd = pwd;
	}

	public User(String username, String pwd) {
		this.username = username;
		this.pwd = pwd;
	}

	public User(int id, String username, String pwd) {
		this.id = id;
		this.username = username;
		this.pwd = pwd;
	}

	public User() {
		
	}
	
	
	
	
	
}
