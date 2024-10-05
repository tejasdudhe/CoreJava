package day10_4;

import java.util.Scanner;

public class Factorial {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);

		System.out.print("Enter the Number to See Factorial : ");
		int num = sc.nextInt();

		try {
			if (num < 0) {
				throw new NegativeNumberException("Number must Be Positoive to Calc Factorial");
			}
			else
			{
				calcFact(num);
			}
		}catch (NegativeNumberException e) {
			
			System.err.println(e.getMessage());
		}

	}
	
	public static void calcFact(int num)
	{
		int fact =1;
		for(int i=num;i>=2;i--) {
			fact=fact*i;
		}
		
		System.out.println("Factorial of Number "+num+" is "+fact);
	}

}
