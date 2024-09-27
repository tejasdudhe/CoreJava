package day3;

public class MainEmployee {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Employee e1 = new Employee("Pranav",15000.50f);
		Employee e2 = new Employee("Akash",12000.50f);
		Employee e3 = new Employee("Sahil",25000.50f);
		
		e1.display();
		e2.display();
		e3.display();
	}

}

class Employee{
	
	int EmpId;
	String name;
	float sal;
	
	static int genId;
	static {
		genId = 101;
	}
	
	public Employee(String name,float sal){
		this.EmpId = genId++;
		this.name = name;
		this.sal = sal;
	}
	
	public void display() {
		System.out.println("Employee ID : "+EmpId);
		System.out.println("Employee Name : "+name);
		System.out.println("Employee Salary : "+sal);
		System.out.println();
	}
}
