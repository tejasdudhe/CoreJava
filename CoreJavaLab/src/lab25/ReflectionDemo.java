/*
		 	Lab Exercise - 25
		
		Objective
		
		Use features provided by reflection classes.
		Pre-condition
		
		Employee class should be created.
		Problem Statement
		
		Write a class 'ReflectDemo' to find out information of 'Employee' class and related classes of Employee.
		Use methods like getClass(), Class.forName(), newInstance().
 * */




package lab25;

import java.util.HashSet;

public class ReflectionDemo {

	public static void main(String[] args) {
		
		Employee e1 = new Employee(101, "Tejas", 5000, new HashSet<String>());
		
		Class c1 = e1.getClass();
		System.out.println("Class c1 : "+ c1);
		
//		Class<Employee> employeeClass = Employee.class;
		
	
		try {
			Class c2 = Class.forName("lab25.Employee");
			System.out.println("Class c2 : "+ c2);
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		try {
			Employee e2 = (Employee) Class.forName("lab25.Employee").newInstance();
			System.out.println("New EMp : "+e2);
		} catch (InstantiationException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IllegalAccessException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		

	}

}
