package day2_1;

public class AccountMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Account acc = new Account();
		acc.setAccNo(1010);
		acc.setBalance(10000);
		acc.setOwnerName("Anuj");
		
		System.out.println("Account Number : "+acc.getAccNo());
		System.out.println("Onwer Name : "+acc.getOwnerName());
		System.out.println("Account Number : "+acc.getBalance());
	}

}

class Account{
	
	int accNo;
	String ownerName;
	double balance;
	
	public int getAccNo() {
		return accNo;
	}
	public void setAccNo(int aNo) {
		accNo = aNo;
	}
	public String getOwnerName() {
		return ownerName;
	}
	public void setOwnerName(String ownName) {
		ownerName = ownName;
	}
	public double getBalance() {
		return balance;
	}
	public void setBalance(double bal) {
		balance = bal;
	}
	
	
}
