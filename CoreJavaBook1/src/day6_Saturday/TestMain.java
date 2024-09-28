package day6_Saturday;

import java.util.Scanner;

public class TestMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int  n;
		
		System.out.println("Enter the Number of Book you want to register :");
		n = sc.nextInt();
		Book[] book = new Book[n];
		
		for(int i=0;i<n;i++)
		{
			book[i]= new Book();
			book[i].setter();
		}
		
		for(int i=0;i<n;i++)
		{
			
			book[i].display();
		}
		
		
		 
		

	}

}
