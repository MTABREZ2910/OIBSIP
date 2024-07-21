package com.onlinereservation;

import java.util.Scanner;

public class OnlineReservation {

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("\t--------------------------------------");
		System.out.println("\tWELCOME TO ONLINE RESERVATION SYSTEM");
		System.out.println("\t--------------------------------------");
		System.out.println("\t\t   CREATE ACCOUNT");
		System.out.println("CREATE USER-Id:");
		String userName=sc.nextLine();
		System.out.println("CREATE PASSWORD:");
		String password=sc.nextLine();
		CreateAccount createuser=new CreateAccount(userName,password);
		System.out.println("Account created successfully !!!!!!!!");
		ReservationUse use=new ReservationUse();
		while(true) {
			System.out.println("1.Log in\n2.Exit");
			int i=sc.nextInt();
			switch(i) {
			case 1:
				Login login=new Login(createuser);
				 boolean loggedIn = false;
                 while (!loggedIn) {
                     loggedIn = login.login();
                 }
				while(true) {
					System.out.println("1.Reservation\n2.Cancellation\n3.Exit");
					int s=sc.nextInt();
					switch(s) {
				case 1:use.reservation();
				break;
				case 2:use.cancellation();
				break;
				case 3:
					System.exit(0);
                    break;
					default:
						System.out.println("Enter valid choice");
						break;
					}
				}
				
			case 2:
				System.exit(0);
				break;
			default:
				System.out.println("Invalid Input");
				break;

	}
	}
}
}


