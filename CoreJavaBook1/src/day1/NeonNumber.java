package day1;

import java.util.Scanner;

public class NeonNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter Integer Value : ");
		int n = sc.nextInt();
		
		int sq = n*n;
		int sum=0;
		
		while(sq!=0)
		{
			int digit = sq%10;
			sq=sq/10;
			
			sum = sum+digit;
		}
		
		if(sum==n)
		{
			System.out.print(n+" is a Neon Number");
		}
		else
		{
			System.out.print(n+" is Not a Neon Number");
		}
	}

}
