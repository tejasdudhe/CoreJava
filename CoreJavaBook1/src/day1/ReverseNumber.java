package day1;

import java.util.Scanner;

public class ReverseNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter Integer Value : ");
		int n = sc.nextInt();
		
		int rev=0;
		
		while(n!=0)
		{
			int temp = n%10;
			n=n/10;
			rev = temp+rev*10;
		}
		
		sc.close();
		System.out.println("Reverse Number : "+rev);
	}
}