package System;

import java.util.ArrayList;

import Department.Restaurant;

public class ReservationSystem {
	int capacity = Restaurant.numberOfSeats;
	int seatsFilled;
	ArrayList<Reservation> reservations = new ArrayList<>();

	public ArrayList<Reservation> getReservations() {
		seatsFilled = 0;
		// deze variabele 'capacity' een methode laten callen die per dag de gewenste capaciteit invult
		int seatsLeftToFill = capacity - seatsFilled;
		while (seatsLeftToFill > 0 ) {
			System.out.println(capacity);
			System.out.println(capacity - seatsFilled);
			int randomNumber = getRandom(1,8);
			Reservation reservation = new Reservation(randomNumber);
			System.out.println("new reservation");
			reservations.add(reservation);
			seatsFilled += randomNumber;
			System.out.println("Added " + randomNumber + " to seatsFilled");
			System.out.println("Number of seats filled " + seatsFilled);
			System.out.println(seatsLeftToFill);
			
		}
		return reservations;
	}
	
	public static int getRandom(int min, int max) {
		int randomNumber = (int) Math.floor(Math.random() *(max - min + 1) + min);
		return randomNumber;
	}
}
