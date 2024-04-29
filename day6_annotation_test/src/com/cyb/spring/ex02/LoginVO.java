package com.cyb.spring.ex02;

public class LoginVO {
	private String userID;
	private String userName;
	
	@Override
	public String toString() {
		return "LoginVO [userID=" + userID + ", userName=" + userName + "]";
	}
	public String getUserID() {
		return userID;
	}
	public void setUserID(String userID) {
		this.userID = userID;
	}
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public LoginVO() {
		// TODO Auto-generated constructor stub
	}

}
