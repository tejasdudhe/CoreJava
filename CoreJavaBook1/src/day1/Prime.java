package day1;

import java.util.Scanner;

public class Prime {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter Number : ");
		int num = sc.nextInt();
		
		int prime = 0;
		
		for(int i=2;i<num/2;i++) {
			
			if(num%2 ==0 || num%3 ==0)
			{
				prime =1 ;
				break;
			}
			
			if(num%i==0)
			{
				prime = 1;
			}
		}
		
		if(prime==0)
		{
			System.out.print(num+" is prime Number");
		}
		else
		{
			System.out.print(num+" is not prime Number");
		}
		
	}

}
