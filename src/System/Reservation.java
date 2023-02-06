package System;

import guest.Guest;
import guest.GuestProfile;

public class Reservation {
	
	// constructor voor het aanmaken van gasten binnen de nieuwe reservering
	Reservation() {
		// methode aanroepen die een random teruggeeft
		for (int i = getRandom(1,6); i>0 ; i--) {
			Guest guest = new GuestProfile();
		}
		
		
	}
	
	
	public int getRandom(int min, int max) {
		int randomNumber = (int) Math.floor(Math.random() *(max - min + 1) + min);
		return randomNumber;
	}
	
}
