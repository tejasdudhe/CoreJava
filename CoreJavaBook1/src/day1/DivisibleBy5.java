package day1;

import java.util.Scanner;

public class DivisibleBy5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter Integer Value : ");
		int n = sc.nextInt();
		
		if(n%5==0)
		{
			System.out.print(n+" is divisible By 5");
		}
		else
		{
			System.out.print(n+" is not divisible By 5");
		}
		
		

	}

}
