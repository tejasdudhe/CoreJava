package day15_2;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Scanner;

public class EmployeesTest {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		

		int op;
		ArrayList<Employee> elist = new ArrayList<Employee>();
		HashSet<String> skill= new HashSet<>();
		HashMap<String,Integer> card = new HashMap<String, Integer>();
		ArrayList<String> Qu = new ArrayList<String>();
		
		do {

			op = menu();

			switch (op) {

			case 1:
				
				Employee e= new Employee();
				e.addData();
				
				
				
				System.out.println("Enter Employee SkillSet : ");
				
				skill.add(sc.nextLine());
				
				while(true)
				{
					System.out.print("Do you Wnat to Enter ANothor Skill?(Y/N) :");
					char c = sc.next().charAt(0);
					if( c== 'N' ||  c=='n')
					{
						break;
					}
					sc.nextLine();
					System.out.println("Enter Employee SkillSet : ");
					skill.add(sc.nextLine());
					
				}			
				e.setSkillSet(skill);
				
				
				
				
				
				
				System.out.println("Enter Employee Personal Cards : ");
				
				sc.nextLine();
				System.out.print("Enter Card Type : ");
				String cardName = sc.nextLine();
				
				System.out.print("Enter Card Number : ");
				int cardNum = sc.nextInt();
				
				card.put(cardName,cardNum);
				
				while(true)
				{
					System.out.print("Do you Wnat to Enter ANothor Personal Card?(Y/N) :");
					char c = sc.next().charAt(0);
					if( c== 'N' ||  c=='n')
					{
						break;
					}
					System.out.println("Enter Employee Personal Cards : ");
					sc.nextLine();
					System.out.print("Enter Card Type : ");
					 cardName = sc.nextLine();
					
					System.out.print("Enter Card Number : ");
					 cardNum = sc.nextInt();
					
					card.put(cardName,cardNum);
				}			
				e.setpCards(card);
				
				
				
				
				
				System.out.println("Enter Employee Qualification : ");
				
				sc.nextLine();
				Qu.add(sc.nextLine());
				
				while(true)
				{
					System.out.print("Do you Wnat to Enter Anothor Qualification?(Y/N) :");
					char c = sc.next().charAt(0);
					if( c== 'N' ||  c=='n')
					{
						break;
					}
					System.out.println("Enter Employee Qualification : ");
					sc.nextLine();
					Qu.add(sc.nextLine());
				}			
				e.setQuali(Qu);

				
				elist.add(e);
					
				break;
			case 2:
				
				if(!elist.isEmpty())
				{
					for (Employee emp : elist) 
					{
						emp.display();
					}
				}
				else
				{
					System.err.println("|| There is not a single Employee Registered ||");
				}

				break;
				
			case 3:
				
				try {
					
					FileOutputStream fout = new FileOutputStream("data.txt");
				     ObjectOutputStream oos = new ObjectOutputStream(fout);
				     
				    
				    	 oos.writeObject(elist);
					
				     
				     System.out.println("Object serialized successfully");
				     
				} catch (FileNotFoundException ex) {
					ex.printStackTrace();
				}catch(IOException ex)
				{
					ex.printStackTrace();
				}
				
				
				break;
			case 4 :

				break;

			default:
				System.err.println("\nEnter Valid Choice......");
				break;
			}

		} while (op != 5);

	}

	public static int menu() {
		Scanner sc = new Scanner(System.in);
		System.out.println("-----------------------------\n");
		System.out.println("Enter 1 to Add Employee.");
		System.out.println("Enter 2 to Display All Employee.");
		System.out.println("Enter 3 to Save Employees.");
		System.out.println("Enter 4 to Load Employee.");
		System.out.println("\n-----------------------------");

		System.out.print("Enter Your Choice : ");

		return sc.nextInt();

	}
	
	public static void saveData(ArrayList<Employee> elist) throws FileNotFoundException,IOException
	{
		FileOutputStream fout = new FileOutputStream("data.txt");
	     ObjectOutputStream oos = new ObjectOutputStream(fout);
	     
	     for (Employee emp : elist) {
	    	 oos.writeObject(emp);
		}
	     
	     System.out.println("Object serialized successfully");
	}
	
	
}
