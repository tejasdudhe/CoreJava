package day13_2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

public class TestMain {

	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Student> stud = new ArrayList<>();
		Scanner sc = new Scanner(System.in);
		int op;

		do {

			System.out.println("Enter 1 to add Student : ");
			System.out.println("Enter 2 to delete Student : ");
			System.out.println("Enter 3 to Search Student : ");
			System.out.println("Enter 4 to Display Accending order by Student Id : ");
			System.out.println("Enter 5 to Display Accending order by Student Name : ");
			System.out.println("Enter 6 to to Exit : ");

			System.out.println("Enter Your Choice ");
			op = sc.nextInt();

		

		switch (op) {
		
		case 1:
			
			Student st = new Student();
			System.out.println("Enter Student Id : ");
			st.setStdId(sc.nextInt());
			
			sc.nextLine();
			System.out.println("Enter Student Name : ");
			st.setName(sc.nextLine());
			
			System.out.println("Enter Student Marks : ");
			st.setMarks(sc.nextInt());
			
			stud.add(st);

			
			break;

		case 2:
			
			int rem;
			System.out.println("Enter Student Id to remove Student : ");
			rem = sc.nextInt();
			
			Iterator<Student> it = stud.iterator();
			boolean b = true;
			while(it.hasNext())
			{
				Student std = it.next();
				if(std.getStdId() == rem)
				{
					it.remove();
					System.out.println("\n Remove Successfully....");
					b= false;
					
				}
				
			}
			
			if(b)
			{
				System.err.println("Student is Not in database....");
			}
			
			
			break;

		case 3:
			int search;
			System.out.println("Enter Student Id to Search Student detail : ");
			search = sc.nextInt();
			
			
			Iterator<Student> i = stud.iterator();
			boolean bl = true;
			while(i.hasNext())
			{
				Student s = i.next();
				if(s.getStdId() == search)
				{
					
					System.out.println("\n Student Details :  "+s);
					bl= false;
				}
				
			}
			
			if(bl)
			{
				System.err.println("Student is Not in database....");
			}
			
			break;
			
		case 4:
			Collections.sort(stud);
			display(stud);
			
			break;
			
		case 5:
			Collections.sort(stud,new StdNameComparator());
			display(stud);
			
			break;

		default: System.out.println("\n Inavlid Input");
			break;
		}

		
		} while (op != 6);
	}
	
	public static void display(List<Student> st)
	{
		for (Student student : st) {
			System.out.println(student+"\n");
		}
	}
}
