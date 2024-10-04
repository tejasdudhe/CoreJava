package Lab17;

public class Account {

	
	int accountId;
	String accountName;
	double balance;
	
	
	public Account() {
		super();
		 accountId = 1001 ;
		 accountName = "Pravin";
		 balance = 5000.00;
	}
	
	
	
	class Locker
	{
		int locId;

		public Locker() {
			super();
			
			locId=55;
		}
		
		
		@Override
		public String toString() {
	       return "Account ID : "+accountId+"\n"+"Account Name : "+accountName+"\n"+"Account Balance : "+balance+"\nlocker ID : "+locId;
	    }
		
	}
	
	
}
