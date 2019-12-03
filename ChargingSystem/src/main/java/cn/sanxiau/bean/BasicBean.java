package cn.sanxiau.bean;

public class BasicBean {
	private String name;
	private String meal;
	private String level;
	private String papers;
	private String papers_number;
	private String account_manager;
	private String hotline;
	private String bill_name;
	private String pay_method;
	private String email;
	private String address;
	private int user_id;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getMeal() {
		return meal;
	}
	public void setMeal(String meal) {
		this.meal = meal;
	}
	public String getLevel() {
		return level;
	}
	public void setLevel(String level) {
		this.level = level;
	}
	public String getPapers() {
		return papers;
	}
	public void setPapers(String papers) {
		this.papers = papers;
	}
	public String getPapers_number() {
		return papers_number;
	}
	public void setPapers_number(String papers_number) {
		this.papers_number = papers_number;
	}
	public String getAccount_manager() {
		return account_manager;
	}
	public void setAccount_manager(String account_manager) {
		this.account_manager = account_manager;
	}
	public String getHotline() {
		return hotline;
	}
	public void setHotline(String hotline) {
		this.hotline = hotline;
	}
	public String getBill_name() {
		return bill_name;
	}
	public void setBill_name(String bill_name) {
		this.bill_name = bill_name;
	}
	public String getPay_method() {
		return pay_method;
	}
	public void setPay_method(String pay_method) {
		this.pay_method = pay_method;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public int getUser_id() {
		return user_id;
	}
	public void setUser_id(int user_id) {
		this.user_id = user_id;
	}
	public BasicBean(String name, String meal, String level, String papers,
			String papers_number, String account_manager, String hotline,
			String bill_name, String pay_method, String email, String address,
			int user_id) {
		this.name = name;
		this.meal = meal;
		this.level = level;
		this.papers = papers;
		this.papers_number = papers_number;
		this.account_manager = account_manager;
		this.hotline = hotline;
		this.bill_name = bill_name;
		this.pay_method = pay_method;
		this.email = email;
		this.address = address;
		this.user_id = user_id;
	}
	public BasicBean() {
		
	}
	@Override
	public String toString() {
		return "BasicBean [name=" + name + ", meal=" + meal + ", level="
				+ level + ", papers=" + papers + ", papers_number="
				+ papers_number + ", account_manager=" + account_manager
				+ ", hotline=" + hotline + ", bill_name=" + bill_name
				+ ", pay_method=" + pay_method + ", email=" + email
				+ ", address=" + address + ", user_id=" + user_id + "]";
	}
	
	
	
}
