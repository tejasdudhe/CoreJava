package day3;

import java.util.Scanner;

public class Fibbonachi {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the no of of Fibb Number to show : ");
		int f = sc.nextInt();
		
		int num1 = 0, num2 =1;
		int num3=0;
		
		for(int i=0 ; i<f;i++)
		{
			System.out.print(num1+" ");
			num3 = num1 +num2;
			num1 = num2;
			num2 = num3; 
			
		}
		
	}
	
	

}
