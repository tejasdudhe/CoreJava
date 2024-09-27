package day3_task;

import java.util.Scanner;

public class Account {

	int accNumber;
	String custName;
	double balance;
	String city;

	static int genId;

	static {
		genId = 1001;
	}

	public Account() {
	}

	public Account(String custName, double balance, String city) {
		this.accNumber = genId++;
		this.custName = custName;
		this.balance = balance;
		this.city = city;
	}

	public void withDrawMoney(double amt) {
		if (amt > balance) {
			System.out.println("Insufficient Balance!");
		} else {
			this.balance -= amt;
			System.out.println("Withdrawal successful. Remaining balance: " + balance);
		}
	}

	public void depositMoney(double amt) {
		if (amt>0) {
			this.balance += amt;
			System.out.println("Deposit Successful. New balance: " + balance);
		}
		else {
			System.out.println("Inavlid Amount");
		}
	}

	public void transferMoney(Account accTo, double amt) {

		if (amt >= this.balance) {
			System.out.println("Insufficient balance for transfer.");
		} else {
			this.balance -= amt;
			accTo.balance += amt;
			System.out.println("Transfer successful.");
		}

	}

	public  void display() {
		System.out.println("Account Number : " + this.accNumber);
		System.out.println("Name : " + this.custName);
		System.out.println("Account Balance : " + this.balance);
		System.out.println("City : " + this.city + "\n");
		System.out.println("----------------------------");
	}

	public static void display(Account[] accounts, String city) {
		for (Account account : accounts) {
			if (account != null && account.city.equalsIgnoreCase(city)) {
				account.display();
			}
		}
	}

	public void display(Account[] accounts, int accNumber) {
		for (Account account : accounts) {
			if (account != null && account.accNumber == accNumber) {
				account.display();
				return;
			}
		}
		System.out.println("Account not found with account number: " + accNumber);
	}

}
