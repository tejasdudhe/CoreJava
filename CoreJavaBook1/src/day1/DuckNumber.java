package day1;

import java.util.Scanner;

public class DuckNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter Integer Value : ");
		int n = sc.nextInt();
		int check=n;
		
		int digit = -1;
		int flag = 0;
		while(n!=0)
		{
			digit = n%10;
			n=n/10;
			
			if(digit == 0)
			{
				flag=1;
			}
		}
		
		
		if(digit!=0)
		{
			if(flag==1)
			{
				System.out.print(check+" is a Duck Number");
			}
			else
			{
				System.out.print(check+" is Not a Duck Number");
			}
		}
		else
		{
			System.out.print(check+" is Not a Duck Number");
		}
		
	}

}


