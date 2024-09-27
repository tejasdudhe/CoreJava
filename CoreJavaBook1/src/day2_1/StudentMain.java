package day2_1;

public class StudentMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student st = new Student();
		st.initStudent();
		st.printDetails();
	}

}

class Student{
	
	int rollNo;
	String name;
	double percent;
	
	public void initStudent() {
		rollNo = 21;
		name = "Akash";
		percent = 80;
	}
	
	
	public void printDetails() {
		System.out.println("Roll No : "+rollNo);
		System.out.println("Name : "+name);
		System.out.println("Percentage : "+percent+"%");
		
	}
	
	
}
