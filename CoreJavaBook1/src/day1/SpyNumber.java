package day1;

import java.util.Scanner;

public class SpyNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter Integer Value : ");
		int n = sc.nextInt();
		int check=n;
		
		
		int sum=0;
		int mul =1;
		
		while(n!=0)
		{
			int digit = n%10;
			n=n/10;
			
			sum=sum+digit;
			mul=mul*digit;
		}
		
		if(sum==mul)
		{
			System.out.print(check+" is a Spy Number");
		}
		else
		{
			System.out.print(check+" is Not a Spy Number");
		}
	}
	
	

}
