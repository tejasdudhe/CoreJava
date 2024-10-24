package day5_HW;

import java.util.Scanner;

public class Batsman extends Cricketer {

	int runsScored;
	int centuries;

	public Batsman() {
		super();
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Run Scored by Batsman :");
		runsScored = sc.nextInt();

		System.out.println("Enter Centuries Scored by Batsman :");
		centuries = sc.nextInt();
	}

	public Batsman(String name, int age, String team, String role, int matchesPlayed, int runsScored, int centuries) {
		super(name, age, team, role, matchesPlayed);
		this.runsScored = runsScored;
		this.centuries = centuries;
	}

	public void display() {

		super.display();

		System.out.println("\n...............Batsman Status...............");

		System.out.println(" Run Scored By Batsman : " + this.runsScored);
		System.out.println(" Centuries Scored By Batsman  : " + this.centuries);
	}
}
