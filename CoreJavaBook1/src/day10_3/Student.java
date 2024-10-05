package day10_3;

import java.util.Scanner;

public class Student {

	int stdId;
	String name;
	int age;

	public Student() {
//		super();
//		stdId = 110;
//		name = "Akash";
//		age = 22;
	}

	public Student(int stdId, String name, int age) {
		super();
		this.stdId = stdId;
		this.name = name;
		this.age = age;
	}

	public void acceptData() throws NameException,AgeException {
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter Student Id : ");
		this.stdId = sc.nextInt();

		System.out.println("Enter Student Name : ");
		sc.nextLine();
		this.name = sc.nextLine();
		if(!isValidName(name))
		{
			throw new NameException("Name should contain only letters");
		}

		System.out.println("Enter Student Age : ");
		this.age = sc.nextInt();
		if(age<=18)
		{
			throw new AgeException("Age Must be greater than 18");
		}
	}

	public void displayData() {
		
		System.out.println("Student Id : "+this.stdId);
		System.out.println("Student Name : "+this.name);
		System.out.println("Student Age : "+this.age);
		
	}
	
	private boolean isValidName(String name) {
        return name.matches("[A-Za-z]{3,}"); 
    }

}
