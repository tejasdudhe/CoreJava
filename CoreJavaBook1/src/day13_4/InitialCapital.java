package day13_4;

import java.util.Scanner;

public class InitialCapital {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the String : ");
		String str = sc.nextLine();
		
		String arr[] = str.split(" ");
		
		int c=0;
		String res="";
		for(String st : arr)
		{
			if(isCapLetter(st))
			{
				c++;
			}
		
				res +=  capFirstletter(st) + " ";
		}
		
		if(c==arr.length)
		{
			System.err.print("Already in UpperCase");
		}
		else
		{
			System.out.println("First Letter in Upper : "+res.trim());
		}
		
		
		
	}
	
	public static boolean isCapLetter(String s)
	{
		return Character.isUpperCase(s.charAt(0));
	}
	
	public static String capFirstletter(String s)
	{
		
		if(!isCapLetter(s))
		{
			return s.substring(0, 1).toUpperCase() + s.substring(1);
		}
		
		return s;
	}
}
