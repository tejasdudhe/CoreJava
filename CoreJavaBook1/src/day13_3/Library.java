package day13_3;

import java.util.ArrayList;

public class Library {
    ArrayList<Book> lib = new ArrayList<Book>();

    public Library() {
    }

    public Library(ArrayList<Book> lib) {
        this.lib = lib;
    }

    public void addBook(Book bobj) {
        lib.add(bobj);
    }

    public boolean isEmpty() {
        return lib.isEmpty();
    }

    public ArrayList<Book> viewAllBooks() {
        return lib;
    }

    public ArrayList<Book> viewAllBooksByAuthor(String author) {
        ArrayList<Book> booksByAuthor = new ArrayList<>();
        for (Book book : lib) {
            if (book.getAuthorName().equalsIgnoreCase(author)) {
                booksByAuthor.add(book);
            }
        }
        return booksByAuthor;
    }

    public int countBooks(String bookName) {
        int count = 0;
        for (Book book : lib) {
            if (book.getBookName().equalsIgnoreCase(bookName)) {
                count++;
            }
        }
        return count;
    }
}
