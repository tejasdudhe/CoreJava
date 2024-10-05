package day11_3;

import java.util.Scanner;

public class TestStudent {

	public static void main(String[] args) {
		
		
		
		

	}
	
	public static Student getStudentDetail() {
		
		Scanner sc = new Scanner(System.in);
		Student st = new Student();
		
		System.out.println("Enter the Student Id : ");
		st.setStdId(sc.nextInt());
		
		System.out.println("Enter the Student Name : ");
		st.setName(sc.nextLine());
		
		
		System.out.println("Enter Number of Subject : ");
		
		
	}
}
