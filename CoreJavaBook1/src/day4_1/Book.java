package day4_1;

import java.util.Scanner;

public class Book {
	int Book_Id;
	String Book_Name;
	String Author;
	float Price;

	public void acceptBook() {
		Scanner sc = new Scanner(System.in);

		System.out.print("\nEnter Book Id : ");
		Book_Id = sc.nextInt();
		
		sc.nextLine();
		System.out.print("\nEnter Book Name : ");
		Book_Name = sc.nextLine();
		
		System.out.print("\nEnter Book Author : ");
		Author = sc.nextLine();

		System.out.print("\nEnter Price : ");
		Price = sc.nextFloat();


	}

	public int update() {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Updating Data for Book Id : "+this.Book_Id);

		System.out.print("Enter Book Name : ");
		this.Book_Name = sc.nextLine();
		System.out.print("Enter Book Author : ");
		this.Author = sc.nextLine();
		System.out.print("Enter Price : ");
		this.Price = sc.nextFloat();
		
		return 1;
	}

	public void display() {

		System.out.print("\nBook Id : " + this.Book_Id);
		System.out.print("\nBook Name : " + this.Book_Name);
		System.out.print("\nBook Author : " + this.Author);
		System.out.print("\nPrice : " + this.Price);
	}
}
