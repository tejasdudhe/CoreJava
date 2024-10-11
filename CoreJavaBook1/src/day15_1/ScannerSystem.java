package day15_1;
import java.util.Scanner;


public class ScannerSystem {

	
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Enter no1 and No2: ");
		int no1 = scanner.nextInt();
		int no2 = scanner.nextInt();
		
		
		
		int res = no1 + no2;
		System.out.println("Addition is " + res);
	}

}
