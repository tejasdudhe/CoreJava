package day5_HW;

import java.util.Scanner;

public class Cricketer extends Player {

	String role;
	int matchesPlayed;

	public Cricketer() {
		super();
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter Player Role :");
		role = sc.nextLine();

		System.out.println("Enter Match Played by Player :");
		matchesPlayed = sc.nextInt();

	}

	public Cricketer(String name, int age, String team, String role, int matchesPlayed) {
		super(name, age, team);
		this.role = role;
		this.matchesPlayed = matchesPlayed;

	}
	
	@Override
	public void display() {
		
		super.display();

		System.out.println("\n...............Cricket Status...............");

		System.out.println(" Player Role in Cricket  : " + this.role);
		System.out.println(" Player Matches played in Cricket  : " + this.matchesPlayed);
	}

}