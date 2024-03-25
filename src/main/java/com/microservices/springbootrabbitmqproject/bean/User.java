package com.microservices.springbootrabbitmqproject.bean;

public class User {
	
	private int userId;
	private String userName;
	private String designation;
	
	public User()
	{
		
	}
	
	public User(int userId, String userName, String designation) {
		this.userId = userId;
		this.userName = userName;
		this.designation = designation;
	}
	
	public int getUserId() {
		return userId;
	}

	public void setUserId(int userId) {
		this.userId = userId;
	}
	
	public String getUserName() {
		return userName;
	}
	
	public void setUserName(String userName) {
		this.userName = userName;
	}
	
	public String getDesignation() {
		return designation;
	}
	
	public void setDesignation(String designation) {
		this.designation = designation;
	}

	@Override
	public String toString() {
		return "User [userId=" + userId + ", userName=" + userName + ", designation=" + designation + "]";
	}
	
	

}