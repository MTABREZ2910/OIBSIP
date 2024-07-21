package com.onlinereservation;

public class CreateAccount {
	private String userName,password;

	public CreateAccount(String userName, String password) {
		super();
		this.userName = userName;
		this.password = password;
	}

	public String getUserName() {
		return userName;
	}

	public String getPassword() {
		return password;
	}
	

}
