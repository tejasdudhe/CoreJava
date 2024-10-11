package day15_1;
import java.io.*;
public class ConsoleDemo 
{
	public static void main(String[] args) 
	{

		try {
			
			
			System.out.print("Enter the user name:");
			String data = System.console().readLine();
			System.out.print("Enter the password:");
			char [] passwordData =System.console().readPassword();
			String password = new String(passwordData);
			System.out.println("User Details:");
			System.out.println(data);
			System.out.println(password);
		} catch (Exception e) {
			
			e.printStackTrace();
		}
	}

}
