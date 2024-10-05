package day8_1;

import java.util.Scanner;

public class SumOfAscii {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the First Character : ");
		char c1 =sc.next().charAt(0);
		
		System.out.println("Enter the Second Character : ");
		char c2 =sc.next().charAt(0);
		
		int sum = c1+c2;
		int diff = c1-c2;
		
		
		System.out.println("Sum : "+sum+"\ndiff : "+diff);

	}

}
