package com.onlinereservation;
import java.util.Scanner;

public class ReservationUse {
	Scanner sc=new Scanner(System.in);
	int trainNo; String trainName;
	public void reservation() {
		System.out.println("Enter no.of Passengers:");
		int passenger=sc.nextInt();
		System.out.println("1.1401 KCG-KNT Express\n2.1402 KCG-YTP Express\n3.1403"
				+ " TELANGANA EXPRESS\n4.1404-MUMBAI Express");
		System.out.println("Enter Train no:");
		int sl=sc.nextInt();
			switch(sl) {
			case 1:
				trainNo=1401;
				trainName="KCG-KNT Express";
				break;
			case 2:
				trainNo=1402;
				trainName="KCG-YTP Express";
				break;
			case 3:
				trainNo=1403;
				trainName="TELANGANA Express";
				break;
			case 4:
				trainNo=1404;
				trainName="MUMBAI Express";
				break;
				default:
					System.out.println("Enter valid choice");
					break;
			}
		
		sc.nextLine();
		int pnr=(int) (Math.random()*10000000)+1;
		System.out.println("Enter reservation date (yyyy-MM-dd):");
		String daate=sc.nextLine();
		Reservation use=new Reservation(passenger, trainNo, pnr,daate, trainName);
		System.out.println("Your details "+use.toString());
	}
	public void cancellation() {
		System.out.println("Enter your pnr number");
		int pnr=sc.nextInt();
		if(pnr==Reservation.getPnr())
			System.out.println("Cancellation successfull");
		else System.out.println("Enter valid pnr");
	}

}
