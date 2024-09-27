package day3;

import java.util.Scanner;

public class OddEvenMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Number :");
		int n = sc.nextInt();
		
		OddEven check = new OddEven();
		check.isOddEven(n);
	}

}

class OddEven {

	public void isOddEven(int i) {

		if (i % 2 == 0) {
			System.out.println(i + " is a Even Number");
		} else {
			System.out.println(i + " is a Odd Number");
		}
	}
}
