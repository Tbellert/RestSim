package Department;

import java.util.ArrayList;
import java.util.Scanner;

import Employee.Waiter;
import System.CashRegister;
import System.Reservation;
import System.ReservationSystem;
import beverages.Beverage;
import guest.Guest;

public class Restaurant {
	// generic
	public boolean isOpen;
	public String[] dayOfWeek = {"Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday", "Sunday"};
	public static int numberOfSeats = 60;
	public ArrayList<Integer> availableTables = new ArrayList<Integer>();
	public double surfaceAres;
	public int staffCount;
	
	// departments and systems
	public Kitchen kitchen = new Kitchen();
	public CashRegister cashRegister = new CashRegister();
	public ReservationSystem resSystem = new ReservationSystem();
	Scanner scanner = new Scanner(System.in);
	
	// staff
	public Waiter waiter;
	public ArrayList<Reservation> reservations;
	
	// products
	public Beverage beverage;
	
	public Restaurant() {
		System.out.println("_______________________________");
		System.out.println(" ");
		System.out.println("   Welcome to Restaurant Simulator  ");
		System.out.println("_______________________________");
		System.out.println(" ");
		mainMenu();
	}
	
	public void mainMenu() {
		System.out.println("----Main Menu----");
		System.out.println("1 | New Game");
		System.out.println("2 | Backend Things and stuff");
		System.out.println("3 | Quit");
		String input = scanner.next();
		
		switch (input.toLowerCase()) {
		case "1":
			gameStart();
			break;
		case "2": 
			backEnd();
			break;
		case "3": 
			System.out.println("Thank you for your visit!");
			System.exit(0);
			break;
		default:
			System.out.println("Look like meat IS NOT back on the menu boys!");
			System.out.println("Try again.");
			mainMenu();
			break;
		}
	}
	
	public void gameStart() {
		outer: for (int months=1; months<13; months++) {
			System.out.println("This is month " + months);
			inner: for (int weeks=1; weeks<5;weeks++ ) {
				System.out.println("This is week " + weeks);
				for (int days=0;days<7;days++) {
					if (days == 0) {
						// start menu that will ask user to hire staff, make changes to menu, invest in marketing etc.
						System.out.println("Today is monday, time for strategy and preparations");
						System.out.println("End of " + dayOfWeek[days]);
						isOpen = false;
					} else {
						// start of regular day of service
						System.out.println("Today is " + dayOfWeek[days]);
						isOpen = true;
						
						while (isOpen) {
							System.out.println("Open for business");
							
							// get reservations for that day by method of ReservationSystem
							System.out.println("Getting reservations for today");
							
							System.out.println("End of " + dayOfWeek[days]);
							isOpen = false;
						}
					}
				// days
				}
			// weeks
				System.out.println("End of week " + weeks);
				boolean makeChoice = true;
				if (weeks == 4) {
					makeChoice = false;
				}
				while (makeChoice) {
					System.out.println("Would you like to start a new week?");
					System.out.println("Y | Yes");
					System.out.println("N | Quit");
					String input = scanner.next();
					
					switch (input.toLowerCase()) {
					case "y":
						continue inner;
					case "n": 
						mainMenu();
						break;
					default:
						System.out.println("Look like meat IS NOT back on the menu boys!");
						System.out.println("Try again.");
						continue;
					}
				}
			}
		// months	
			System.out.println("End of month " + months);
			boolean makeChoice = true;
			if (months == 12) {
				makeChoice = false;
			}
			while (makeChoice) {
				System.out.println("Would you like to start a new month?");
				System.out.println("Y | Yes");
				System.out.println("N | Quit");
				String input = scanner.next();
				
				switch (input.toLowerCase()) {
				case "y":
					continue outer;
				case "n": 
					mainMenu();
					break;
				default:
					System.out.println("Look like meat IS NOT back on the menu boys!");
					System.out.println("Try again.");
					continue;
				}
			}
		}
	}
	
	public void backEnd() {
		System.out.println("Under construction");
	}
}
