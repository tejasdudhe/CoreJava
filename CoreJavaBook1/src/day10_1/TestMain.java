package day10_1;

import java.util.Scanner;

public class TestMain {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the Number : ");
		int num = sc.nextInt();
		try {
			checkPositive(num);
			
		} catch (NegativeNumberException e) {
			
			System.out.println(e.getMessage());
		}
	}
	
	public static void checkPositive(int num) throws NegativeNumberException
	{
		if(num<0)
		{
			throw new NegativeNumberException(num+" Negative Number is Not Allow");
		}
		else {
			System.out.println(num+" Positive Number is Allow........");
		}
	}
}
