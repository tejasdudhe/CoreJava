package Lab8.Pack1;

public class Student {
	
	public int stdId;
	public String name;
	private int age;
	
	
	
	public Student() {
		stdId = 101;
		name = "Akash";
		age = 22;
	}



	public Student(int stdId, String name, int age) {
		super();
		this.stdId = stdId;
		this.name = name;
		this.age = age;
	}
	
	public void display() {
		System.out.println("Student Id : "+stdId);
		System.out.println("Student Name : "+name);
		System.out.println("Student Age : "+age);
	}
	
	
}
