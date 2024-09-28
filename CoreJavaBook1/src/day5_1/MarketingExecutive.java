package day5_1;

import java.util.Scanner;

public class MarketingExecutive extends Employee {

	double km_Travelled;
	double tour_Allowance;
	static int tele_Allowance;
	
	static {
		tele_Allowance=1500;
	}

	public MarketingExecutive() {

		Scanner sc = new Scanner(System.in);

		System.out.println("Enter the travelled Kilometer by MarketingExecutive : ");
		km_Travelled = sc.nextDouble();

		tour_Allowance = km_Travelled * 5;
		
		System.out.println("MarketingExecutive constructor executed.......");

	}
	
	@Override
	public String toString() {

		
		return super.toString()+"KiloMeter Travelled by MarketingExecutive : " + km_Travelled + "\n Food Allowance of MarketingExecutive : " + tour_Allowance
				+ "\n TelePhone Allowance MarketingExecutive :" + tele_Allowance + "\n";
		
	}

}
