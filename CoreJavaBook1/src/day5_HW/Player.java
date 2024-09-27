package day5_HW;

import java.util.Scanner;

public class Player {
	
	String name;
    int age;
    String team;
    
    public Player()
    {
    	Scanner sc = new Scanner(System.in);
    	
    	System.out.println("Enter Player Name :");
    	name = sc.nextLine();
    	
    	System.out.println("Enter Player Age :");
    	age = sc.nextInt();
    	
    	sc.nextLine();
    	
    	System.out.println("Enter Team Name :");
    	team = sc.nextLine();
  	
    	
    }

	public Player(String name, int age, String team) {
		this.name = name;
		this.age = age;
		this.team = team;
	}
	
	
	public void display() {
		
		System.out.println("...............Player Details...............");
		
		System.out.println("Player Name : "+this.name);
		System.out.println("Player Age : "+this.age);
		System.out.println("Player Team Name : "+this.team);
		
	}
	
}
