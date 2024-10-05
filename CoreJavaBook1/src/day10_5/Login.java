package day10_5;

import java.util.Scanner;

public class Login {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		int cnt = 0;
		try {
			while (true) {
				System.out.println("Enter the username:");
				String uname = sc.next();
				System.out.println("Enter the password:");
				String upwd = sc.next();

				if (uname.equals("admin") && upwd.equals("admin123")) {
					System.out.println("Login Successfully...");
					break;
				} else {
					cnt++;

					if (cnt > 2) {
						
						if (!uname.equals("admin")) {
							throw new InvalidUserNameException("Username is invalid after 3 attempts.");
						} 
						
						if (!upwd.equals("admin123")) {
							throw new InvalidPasswordException("Password is invalid after 3 attempts.");
						}
					}
					System.out.println("Username or password denied! Try again... Attempts: " + cnt);
					continue;
				}
			}
		} catch (InvalidUserNameException e) {
			System.out.println(e.getMessage());
			System.out.println("Contact the manager...");
		} catch (InvalidPasswordException e) {
			System.out.println(e.getMessage());
			System.out.println("Contact the manager...");
		}

	}

}
