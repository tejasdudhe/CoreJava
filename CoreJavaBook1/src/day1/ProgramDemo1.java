package day1;

import java.util.Scanner;

public class ProgramDemo1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scan = new Scanner(System.in);

		System.out.print("Enter Integer Value : ");
		int n = scan.nextInt();

		System.out.print("Enter Float Value : ");
		float f = scan.nextFloat();

		System.out.print("Enter Double Value : ");
		double d = scan.nextDouble();

		System.out.print("Enter Single String Value : ");
		String str1 = scan.next();
		scan.nextLine();

		System.out.print("Enter Multi String Value : ");
		String str2 = scan.nextLine();

		System.out.print("Enter char Value : ");
		char ch = scan.next().charAt(0);

		scan.close();

		System.out.println("Integer value is " + n);
		System.out.println("Float value is " + f);
		System.out.println("Double value is " + d);
		System.out.println("Single String value is " + str1);
		System.out.println("Multi String value is " + str2);
		System.out.println("Character value is " + ch);

	}

}
