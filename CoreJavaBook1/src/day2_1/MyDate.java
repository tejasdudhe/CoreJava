package day2_1;

public class MyDate {
	
	int day,month,year;
	
	public void initDate() {
		day = 1;
		month= 1;
		year = 2001;
	}
	
	public void printDate()
	{
		System.out.println(day+"/"+month+"/"+year);
	}
  
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		MyDate date = new MyDate();
		date.initDate();
		date.printDate();
	}

}