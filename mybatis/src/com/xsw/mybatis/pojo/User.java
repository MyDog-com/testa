package com.xsw.mybatis.pojo;

public class User {

	private int uId;
	private String uName;
	private String uPassword;
	private int uAge;
	public int getuId() {
	return uId;
	}
	public void setuId(int uId) {
		this.uId = uId;
	}
	public String getuName() {
		return uName;
	}
	public void setuName(String uName) {
		this.uName = uName;
	}
	public String getuPassword() {
		return uPassword;
	}
	public void setuPassword(String uPassword) {
		this.uPassword = uPassword;
	}
	public int getuAge() {
		return uAge;
	}
	public void setuAge(int uAge) {
		this.uAge = uAge;
	}
	@Override
	public String toString() {
		return "User [uId=" + uId + ", uName=" + uName + ", uPassword=" + uPassword + ", uAge=" + uAge + "]";
	}
	public User(int uId, String uName, String uPassword, int uAge) {
		super();
		this.uId = uId;
		this.uName = uName;
		this.uPassword = uPassword;
		this.uAge = uAge;
	}
	public User(String uName, String uPassword, int uAge) {
		super();
		this.uName = uName;
		this.uPassword = uPassword;
		this.uAge = uAge;
	}
	public User() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
}
