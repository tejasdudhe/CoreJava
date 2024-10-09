package day13_3;

import java.util.ArrayList;

public class Library {
	ArrayList<Book> lib = new ArrayList<Book>();

	public Library() {

	}

	public Library(ArrayList<Book> lib) {

		this.lib = lib;
	}

	public void addBook(Book bobj)
	{
		lib.add(bobj);
	}
	
	public boolean isEmpty()
	{
		if(lib.isEmpty())
		{
			return true;
		}
		
		return false;
	}
	
	public ArrayList<Book> viewAllBooks()
	{
		if()
		return lib;
	}
	
	public ArrayList<Book> viewAllBooksByAuthor(String author)
	{
		return lib;
	}

}
