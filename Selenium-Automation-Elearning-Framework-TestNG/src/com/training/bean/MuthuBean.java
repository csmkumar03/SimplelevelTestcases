package com.training.bean;

public class MuthuBean {
	//private String userName;
	//private String password;
	private String firstname;
	private String lastname;
	private String email;
	private String phone;
	private String loginname;
	private String loginpwd;
	private String profile;
	
	public MuthuBean() {
	}

	public MuthuBean(String firstname, String lastname, String email, String phone, String loginname, String loginpwd, String profile ) {
		super();
		//firstname,lastname,email,phone,loginname,loginpwd,profile
		//this.userName = userName;
		//this.password = password;
		this.firstname = firstname;
		this.lastname = lastname;
		this.email = email;
		this.phone = phone;
		this.loginname = loginname;
		this.loginpwd = loginpwd;
		this.profile = profile;
	}

	public String getfirstname() {
		return firstname;
	}

	public void setfirstname(String firstname) {
		this.firstname = firstname;
	}

	public String getlastname() {
		return lastname;
	}

	public void setlastname(String lastname) {
		this.lastname = lastname;
	}

	public String getemail() {
		return email;
	}

	public void setemail(String email) {
		this.email = email;
	}

	public String getphone() {
		return phone;
	}

	public void setphone(String phone) {
		this.phone = phone;
	}
	
	public String getloginname() {
		return loginname;
	}

	public void setloginname(String loginname) {
		this.loginname = loginname;
	}
	
	public String getloginpwd() {
		return loginname;
	}

	public void setloginpwd(String loginpwd) {
		this.loginpwd = loginpwd;
	}
	
		public String getprofile() {
		return profile;
	}

	public void setprofile(String profile) {
		this.profile = profile;
	}
	
	@Override
	public String toString() {
		return "MuthuBean [firstname=" + firstname + ", lastname=" + lastname + ", email=" + email + ", phone=" + phone + ", loginname=" + loginname + ", loginpwd=" + loginpwd + ", profile=" + profile + "]";
	}

}
