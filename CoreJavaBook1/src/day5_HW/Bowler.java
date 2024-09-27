package day5_HW;

import java.util.Scanner;

public class Bowler extends Cricketer {
	int wicketsTaken;
	double hatricks;

	public Bowler() {
		super();

		Scanner sc = new Scanner(System.in);

		System.out.println("Enter Wicket Taken By Bowler:");
		wicketsTaken = sc.nextInt();

		System.out.println("Enter Hatrick takrn by  Bowler :");
		hatricks = sc.nextInt();
		sc.close();

	}

	public Bowler(String name, int age, String team, String role, int matchesPlayed, int wicketsTaken,
			double hatricks) {

		super(name, age, team, role, matchesPlayed);
		this.wicketsTaken = wicketsTaken;
		this.hatricks = hatricks;

	}

	public void display() {

		super.display();

		System.out.println("\n...............Bowler Status...............");

		System.out.println(" Wicket Taken  By Bowler : " + this.wicketsTaken);
		System.out.println(" Hatricks Taken  By Bowler : " + this.hatricks);
	}

}
