package day1;

import java.util.Scanner;

public class LeapYear {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter Year : ");
		int year = sc.nextInt();
		
		if(year%4==0)
	    {
	        if(year%100!=0){

	        	System.out.print("leap year");
	        }
	        else if( year % 400 == 0 )
	        {
	        	System.out.print("Leap year");
	        }
	        else{
	        	System.out.print("Not Leap year");
	        }
	    }
	    else{
	    	System.out.print("Not leap year");
	    }



	}

}
