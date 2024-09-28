package Lab1;

public class MyDate {
	private int day;
	private int month;
	private int year;

	public MyDate(int day, int month, int year) {
		this.day = day;
		this.month = month;
		this.year = year;
	}

	public void initDate() {
		System.out.println("Date: " + day + "/" + month + "/" + year);
	}

	public static void main(String[] args) {
		MyDate myDate = new MyDate(15, 9, 2024);
		myDate.initDate();
	}
}


