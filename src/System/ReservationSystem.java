package System;

import java.util.ArrayList;

import Department.Restaurant;

public class ReservationSystem {
	// deze variabele 'capacity' een methode laten callen die per dag de gewenste capaciteit invult
	public int capacity = Restaurant.numberOfSeats;
	public int seatsFilledToday;
	public int seatsFilledWeekly;
	public int seatsFilledMonthly;
	public int seatsFilledYearly;
	
	public ArrayList<Reservation> reservations = new ArrayList<>();
	public ArrayList<Reservation> reservationsWeekly = new ArrayList<>();
	public ArrayList<Reservation> reservationsMonthly = new ArrayList<>();
	public ArrayList<Reservation> reservationsTotal = new ArrayList<>();

	public ArrayList<Reservation> getReservations() {
		int seatsFilled = 0;
		while (seatsFilled < capacity ) {
			int randomNumber = getRandom(1,8);
			Reservation reservation = new Reservation(randomNumber);
			reservations.add(reservation);
			seatsFilled += randomNumber;
			seatsFilledToday = seatsFilled;
		}
		System.out.println("You have: " + reservations.size() + " reservations today with a total of " + seatsFilled + " guests.");
		seatsFilledWeekly += seatsFilledToday;
		return reservations;
	}
	
	public static int getRandom(int min, int max) {
		int randomNumber = (int) Math.floor(Math.random() *(max - min + 1) + min);
		return randomNumber;
	}
	
	public void copyToWeekly() {
		System.out.println("Adding reservations to weektotal");
		for (Reservation reservation : reservations) {
			reservationsWeekly.add(reservation);
		}
		reservations.clear();
	}
	
	public void copyToMonthly() {
		System.out.println("Adding reservations to monthtotal");
		System.out.println("You had: " + reservationsWeekly.size() + " reservations this week with a total of " + seatsFilledWeekly + " guests.");
		seatsFilledMonthly += seatsFilledWeekly;
		seatsFilledWeekly = 0;
		for (Reservation reservation : reservationsWeekly) {
			reservationsMonthly.add(reservation);
		}
		reservationsWeekly.clear();
	}
	
	public void copyToYearly() {
		System.out.println("Adding reservations to yeartotal");
		System.out.println("You had: " + reservationsMonthly.size() + " reservations this month with a total of " + seatsFilledMonthly + " guests.");
		seatsFilledYearly += seatsFilledMonthly;
		seatsFilledMonthly = 0;
		for (Reservation reservation : reservationsMonthly) {
			reservationsTotal.add(reservation);
		}
		reservationsMonthly.clear();
	}
}
