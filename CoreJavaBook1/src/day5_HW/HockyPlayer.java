package day5_HW;

import java.util.Scanner;

public class HockyPlayer extends Player {
	String position;
	int goalsScored;

	public HockyPlayer() {
		super();
		

		Scanner sc = new Scanner(System.in);

		System.out.println("Enter Player Position :");
		this.position = sc.nextLine();

		System.out.println("Enter goal Scored by Player in Hockey :");
		goalsScored = sc.nextInt();

	}

	public HockyPlayer(String name, int age, String team, String position, int goalsScored) {
		super(name, age, team);
		this.position = position;
		this.goalsScored = goalsScored;
	}

	@Override
	public void display() {
		
		super.display();

		System.out.println("\n...............Hockey Status...............");

		System.out.println(" Player Position : " + this.position);
		System.out.println(" Goal Scored by Player in Hockey : " + this.goalsScored);
	}
}
