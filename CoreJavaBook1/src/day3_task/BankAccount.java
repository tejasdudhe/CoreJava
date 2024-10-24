
/*Program 27:  Write a Java Program to create a class bank Account having member fields
 account number,customer name,balance,city and member methods are
 default constructor,parameterized constructor,create account,withdraw amount
 ,deposit amount,transfer amount from one account to another,display all
 account details,display account details by city name,display account
 details by account number.*/

package day3_task;

import java.util.Scanner;

public class BankAccount {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		Account[] Acc = new Account[50];

		int op;
		int currNewAcc = 0;

		do {
			System.out.println("\n>>>>>>>>>>>>>|| BANK ||<<<<<<<<<<<<<<<");
			System.out.println("Welcome To ABC BANK");
			System.out.println();

			System.out.println("Enter 1 to Create Account.");
			System.out.println("Enter 2 to WithDraw Money.");
			System.out.println("Enter 3 to Deposit Money.");
			System.out.println("Enter 4 to Transfer Money.");
			System.out.println("Enter 5 to Display All Account details.");
			System.out.println("Enter 6 to Display Display Account by City.");
			System.out.println("Enter 7 to Display Account by Account Number.");
			System.out.println("8. Exit\n");

			System.out.print("Enter your choice : ");
			op = sc.nextInt();

			switch (op) {

			case 1:

				String name;
				double bal;
				String city;

				System.out.print("Enter Your Name : ");
				name = sc.nextLine();
				sc.nextLine();
				System.out.print("Enter Your starting Balance : ");
				bal = sc.nextDouble();
				System.out.print("Enter Your City : ");
				city = sc.next();

				Acc[currNewAcc++] = new Account(name, bal, city);
				System.out.println("\nAccount Created Successfully!");
				break;

			case 2:

				System.out.print("\nEnter Account Number: ");
				int wdAccNum = sc.nextInt();
				Account withdrawAcc = setCurrAccount(Acc, wdAccNum);

				if (withdrawAcc != null) {
					System.out.print("Enter Amount to Withdraw: ");
					double wdAmt = sc.nextDouble();
					withdrawAcc.withDrawMoney(wdAmt);
				} else {
					System.out.println("\nAccount not found!");
				}

				break;
			case 3:

				System.out.print("\nEnter Account Number: ");
				int depAccNum = sc.nextInt();
				Account depositAcc = setCurrAccount(Acc, depAccNum);

				if (depositAcc != null) {
					System.out.print("Enter Amount to Deposit: ");
					double depositAmt = sc.nextDouble();
					depositAcc.depositMoney(depositAmt);
				} else {
					System.out.println("\nAccount not found!");
				}

				break;
			case 4:

				System.out.print("Enter Sender's Account Number: ");
				int senderAccNum = sc.nextInt();
				System.out.print("Enter Receiver's Account Number: ");
				int receiverAccNum = sc.nextInt();

				Account senderAcc = setCurrAccount(Acc, senderAccNum);
				Account receiverAcc = setCurrAccount(Acc, receiverAccNum);

				if (senderAcc != null && receiverAcc != null) {
					System.out.print("Enter Amount to Transfer: ");
					double transferAmt = sc.nextDouble();
					senderAcc.transferMoney(receiverAcc, transferAmt);
				} else {
					System.out.println("Sender or Receiver Account not found!");
				}
				break;

			case 5:

				if (currNewAcc > 0) {
					for (int i = 0; i < currNewAcc; i++) {
						if (Acc[i] != null) {
							Acc[i].display();
						}
					}
				} else {
					System.out.println("There is Not a Single Account Exist.");
				}

				break;

			case 6:
				System.out.print("Enter City Name: ");
				sc.nextLine();
				String searchCity = sc.nextLine();
				Account.display(Acc, searchCity);
				break;

			case 7:
				System.out.print("Enter Account Number: ");
				int searchAccNum = sc.nextInt();

				Account currAccount = setCurrAccount(Acc, searchAccNum);

				if (currAccount != null) {
					currAccount.display();
				} else {
					System.out.println("Pls Enter Valid Account Numbeer");
				}

				break;

			case 8:
				System.out.println("\n Thank you for Visit : Exiting...");
				break;

			default:
				System.out.println("Invalid Choice!");
			}

		} while (op != 8);
		sc.close();

	}

	public static Account setCurrAccount(Account[] Acc, int accNumber) {
		for (Account account : Acc) {
			if (account != null && account.accNumber == accNumber) {
				return account;
			}
		}
		return null;
	}
}
