
/*
 * 2. A company wants to give a facility of user name and password to its some
employees to access some critical information.
To generate a password.
a. Minimum 8 characters
b. Must contain at least one uppercase, one lowercase and one
special character
c. Only special characters @, *, # are allowed
If the password does not meet the above criteria, an error message esageneeds needs to
be displayed.
J
 * 
 * */

package day11_2;

import java.util.Scanner;

public class TestMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the username:");
		String uname = sc.nextLine();

		System.out.println("Enter the password:");
		String upwd = sc.nextLine();

		try {

			isPassValid(upwd);
			System.out.println("Login Successful");

		} catch (InvalidPasswordException e) {

			System.out.println(e.getMessage());

		}
	}

	public static void isPassValid(String pwd) throws InvalidPasswordException {
		if (!pwd.matches("^(?=.*[A-Z])(?=.*[a-z])(?=.*[@*#])(?=.*[0-9])[A-Za-z0-9@*#]{8,}$")) {
			throw new InvalidPasswordException("\n Password must be at least 8 characters long, "
					+ "\n contain at least one uppercase letter, \n one lowercase letter, \n one special character (@, *, or #), and one digit.");
		}
	}

}
