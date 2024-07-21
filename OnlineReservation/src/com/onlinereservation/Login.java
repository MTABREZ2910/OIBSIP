package com.onlinereservation;
import java.util.Scanner;

public class Login {
	Scanner sc=new Scanner(System.in);
	public String userName,password;
	public CreateAccount createuser;
	public Login(CreateAccount createuser) {
		this.createuser=createuser;
	}
	public boolean login() {
		System.out.println("Enter User-name");
		userName=sc.nextLine();
		System.out.println("Enter Password");
		password=sc.nextLine();
		if((userName.equals(createuser.getUserName()))&&
				(password.equals(createuser.getPassword()))) {
			System.out.println("Log in Sucessfully!!!!");
			return true;
			
		}
		else {
			System.out.println("Invalid Credentials");
			return false;
		}
	}

}
