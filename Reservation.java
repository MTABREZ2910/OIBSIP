package com.onlinereservation;


public class Reservation {
	private static int passengers;
	private static int trainNo;
	private static int pnr;
	private String date;
	private static String trainName;
	public Reservation(int passengers, int trainNo,int pnr, String date, String trainName) {
		super();
		this.passengers = passengers;
		this.trainNo = trainNo;
		this.pnr=pnr;
		this.date = date;
		this.trainName = trainName;
	}
	public int getPassengers() {
		return passengers;
	}
	public int getTrainNo() {
		return trainNo;
	}
	public static int getPnr() {
		return pnr;
	}
	public String getDate() {
		return date;
	}
	public String toString() {
			return "Reservation [passengers=" + passengers + ", trainNo=" + trainNo + ", pnr=" + pnr + ", date=" + date
					+ ", trainName=" + trainName + "]";
	}
		
	public String getTrainName() {
		return trainName;
	}
	
}
