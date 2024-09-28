package day6_Saturday;

import java.util.Scanner;

public class Book {
	String bookName;
	int bookPrice;
	String authorName;

	public Book() {

	}

	public Book(String bookName, int bookPrice, String authorName) {
		this.bookName = bookName;
		this.bookPrice = bookPrice;
		this.authorName = authorName;
	}

	public String getBookName() {
		return bookName;
	}

	public void setBookName(String bookName) {
		this.bookName = bookName;
	}

	public int getBookPrice() {
		return bookPrice;
	}

	public void setBookPrice(int bookPrice) {
		this.bookPrice = bookPrice;
	}

	public String getAuthorName() {
		return authorName;
	}

	public void setAuthorName(String authorName) {
		this.authorName = authorName;
	}

	public void setter() {
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter the Book Name : ");
		String bookName = sc.nextLine();

		System.out.println("Enter the Price of Boook : ");
		int Price = sc.nextInt();

		sc.nextLine();
		System.out.println("Enter the Author Name : ");
		String authorName = sc.nextLine();

		this.setBookName(bookName);
		this.setBookPrice(Price);
		this.setAuthorName(authorName);
	}

	public void display() {
		// TODO Auto-generated method stub
		System.out.println("\n.....................................");
		System.out.println("Book Name : "+this.getBookName());
		 System.out.println("Price : "+this.getBookPrice());
		 System.out.println("Author Name : "+this.getAuthorName());
		 System.out.println("\n.....................................");
	}

}
