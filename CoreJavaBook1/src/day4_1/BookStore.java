
/*
 * Program 28 : Create a class Book containing Book_Id,Book_name, author and Price
   as a member fields and write properties and necessary member methods for the
   following 
   a. To Accept Book Information.
   b. Update book Information by Book_Id.  
   b. Display All book details.
   c. Display book details of a given author.
   d. Display book details of Book_Id.
   */

package day4_1;

import java.util.Scanner;

public class BookStore {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int op;
		int currBook = 0;
		Scanner sc = new Scanner(System.in);
		Book[] book = new Book[100];

		do {
			System.out.println("\n>>>>>>>>>>>>>|| Book Store ||<<<<<<<<<<<<<<<");
			System.out.println("Welcome To ABC Book Store ");
			System.out.println();
			System.out.print("\n Enter 1 to do New Entry on Book Store.");
			System.out.print("\n Enter 2 to Update Book Information.");
			System.out.print("\n Enter 3 to Display All Books in Book Store");
			System.out.print("\n Enter 4 to Display Books of Author.");
			System.out.print("\n Enter 5 to Display Books by Id.");
			System.out.print("\n Enter 6 to Exit \n");

			System.out.print("Enter your choice : ");
			op = sc.nextInt();

			switch (op) {

			case 1:
				book[currBook] = new Book();
				book[currBook++].acceptBook();

				if (book[currBook - 1] == null) {
					System.out.println("Entry is Unsuccessful......");
				} else {
					System.out.println(" The Book Entry is Successfull......");
				}
				break;

			case 2:
				int id;
				System.out.println("\n Enter Book Id : ");
				id = sc.nextInt();
				int flag = 0;
				for (int i = 0; i < currBook; i++) {
					if (book[i].Book_Id == id) {
						flag = book[i].update();
					}

					if (flag == 1) {
						System.out.println("Data is Updated...");
						break;
					}
				}

				if (flag == 0) {
					System.out.println("Invalid Book Id");
				}

				break;
			case 3:
				for (int i = 0; i < currBook; i++) {
					book[i].display();
					System.out.println("\n--------------------------------------------------");
				}
				break;

			case 4:
				String auth;
				sc.nextLine();
				System.out.println("Enter Author Name : ");
				auth = sc.nextLine();

				int f = 0;
				for (int i = 0; i < currBook; i++) {
					if (auth.equalsIgnoreCase(book[i].Author)) {
						book[i].display();
						System.out.println("\n--------------------------------------------------");
						f = 1;
					}
				}

				if (f == 0) {
					System.out.println("Invalid Author Name");
				}

				break;

			case 5:
				int bid;
				System.out.println("\n Enter Book Id : ");
				bid = sc.nextInt();
				int fl = 0;
				for (int i = 0; i < currBook; i++) {
					if (book[i].Book_Id == bid) {
						book[i].display();
						System.out.println("\n--------------------------------------------------");
						fl=1;
						break;
					}
				}

				if (fl == 0) {
					System.out.println("Invalid Book Id");
				}

				break;
			case 6:
				   System.out.println("Exiting..............");
				break;

			default:
				break;
			}

		} while (op != 6);
	}

}