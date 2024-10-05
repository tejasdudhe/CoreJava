
/*
 Accept two numbers as input from the user using Scanner class's nextint()
method. First input is total cost of the CCTV cameras (totalCost). Second
input is the number of the cameras purchased (no).
Find the cost of each camera. (totalCost / no).
If the input provided by the user is not a number (i.e.contains alphabets
or special characters), it will result in InputMismatchException. Handle
this exception and display appropriate message - "Input is not an
integer"
The second input should not be zero. if entered, will result in
ArithmeticException. Handle this exception and display appropriate
message - "Cannot divide by zero. Enter the number (non-zero) of
cameras purchased"
Also handle any other exception occurred.
 * */



package day11_1;

import java.util.InputMismatchException;
import java.util.Scanner;

public class CCTV {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);

		try {

			System.out.println("Enter the Total Cost of CCTV : ");
			int totalCost = sc.nextInt();

			System.out.println("Enter the Number of CCTV : ");
			int no = sc.nextInt();

			int price = totalCost/no;

			System.out.println("Price of Each CCTV Camera is " + price);

		} catch (InputMismatchException e) {

			System.err.println(e+" : Input is Not an Integer....");
			
		} catch (ArithmeticException e) {
			
			System.err.println(e+" : Number of Camera should not be Zero or Negative");
			
		} catch (Exception e) {
			
			e.printStackTrace();
			
		}

	}
	


}
