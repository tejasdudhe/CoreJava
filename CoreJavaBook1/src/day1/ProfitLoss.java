package day1;

import java.util.Scanner;

public class ProfitLoss {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter Selling Price : ");
		double sell = sc.nextDouble();
		
		System.out.print("Enter Cost Price : ");
		double cost = sc.nextDouble();
		
		
		if(sell>cost)
		{
			System.out.print("Profit incurred");
		}
		else if(cost>sell)
		{
			System.out.print("Loss incurred");
		}
		else
		{
			System.out.print("nor Profit nor Loss");
		}
	}

}
