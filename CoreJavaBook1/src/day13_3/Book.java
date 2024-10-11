package day13_3;

public class Book {

	public int bookId;
	public String bookName;
	public String authorName;

	public Book() {
		super();

	}



	public Book(int bookId, String bookName, String authorName) {
		super();
		this.bookId = bookId;
		this.bookName = bookName;
		this.authorName = authorName;
	}

	public int getBookId() {
		return bookId;
	}

	public void setBookId(int bookId) {
		this.bookId = bookId;
	}

	public String getBookName() {
		return bookName;
	}

	public void setBookName(String bookName) {
		this.bookName = bookName;
	}

	public String getAuthorName() {
		return authorName;
	}

	public void setAuthorName(String authorName) {
		this.authorName = authorName;
	
	}

	public void display() {
        System.out.println("Book Id    : " + bookId);
        System.out.println("Book Name  : " + bookName);
        System.out.println("Author Name: " + authorName);
        System.out.println();
    }

	@Override
	public String toString() {
		return "Book : \n bookId=" + bookId + "\n bookName=" + bookName + "\n authorName=" + authorName;
	}

}
