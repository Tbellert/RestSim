package System;

import java.util.ArrayList;

import guest.Guest;
import guest.GuestProfile;

public class Reservation {
	public String name;
	public int numberOfGuests;
	public ArrayList<Guest> guests = new ArrayList<>();
		
	public Reservation(int randomNumber) {
		for (int i = randomNumber; i>0 ; i--) {
			this.numberOfGuests = randomNumber;
			Guest guest = new GuestProfile();
			guests.add(guest);
			if (i == 1) {
				this.name = guest.getLastname();
			}
		}
	}
}
