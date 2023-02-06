package System;

import java.util.ArrayList;

import guest.Guest;
import guest.GuestProfile;

public class Reservation {
	ArrayList<Guest> guests = new ArrayList<>();
	
	public Reservation(int randomNumber) {
		for (int i = randomNumber; i>0 ; i--) {
			Guest guest = new GuestProfile();
			guests.add(guest);
		}
	}
}
