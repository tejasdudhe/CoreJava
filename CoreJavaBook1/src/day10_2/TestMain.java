package day10_2;

import java.util.Scanner;

public class TestMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the Number : ");
		int num = sc.nextInt();

		try {

			if (num >= 0 && num <= 10) {
				throw new SmallNumberException(num + " Number is a Small Number.");
			} else if (num >= 11 && num <= 15) {
				throw new ProperNumberException(num + " Number is a Proper Number.");
			} else if (num >= 16 && num <= 20) {
				throw new GreaterNumberException(num + " Number is a Greater Number.");
			}
		} catch (SmallNumberException e) {

			System.out.println(e.getMessage());
		} catch (ProperNumberException e) {

			System.out.println(e.getMessage());
		} catch (GreaterNumberException e) {

			System.out.println(e.getMessage());
		}
	}

}
