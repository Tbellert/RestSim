package guest;

import System.ReservationSystem;

public class GuestProfile extends Guest {
	public GuestProfile() {
		String chosenName = firstNamesArray[ReservationSystem.getRandom(0, (firstNamesArray.length-1))];
		this.setName(chosenName);
		String chosenLastName = lastNamesArray[ReservationSystem.getRandom(0, (lastNamesArray.length-1))];
		this.setLastname(chosenLastName);
		int chosenAge = ReservationSystem.getRandom(6, 100);
		this.setAge(chosenAge);
	}
	
}
