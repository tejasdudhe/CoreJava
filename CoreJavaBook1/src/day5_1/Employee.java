package day5_1;

import java.util.Scanner;

public class Employee {
	
	int EmpId;
	String Name;
	double bSal;
	
	
	public Employee(){
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the Employee Id : ");
		EmpId = sc.nextInt();
		
		sc.nextLine();
		System.out.println("Enter the Employee Name : ");
		Name = sc.nextLine();
		
		System.out.println("Enter the Employee Basic Salary : ");
		bSal = sc.nextDouble();
		
		System.out.println("Employee constructor executed.......");
	}
	
	@Override
	public String toString() {
		
		return "Employee ID : "+EmpId+"\n Employee Name : "+Name+"\n Employee Basic Salary : "+bSal+"\n";
	}

}