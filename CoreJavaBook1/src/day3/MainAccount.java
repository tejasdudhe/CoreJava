package day3;

public class MainAccount {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("Rate : "+Account.getInterest());
	}

}


class Account{
	
	static float rate;
	
	static {
		rate = 18f;
	}
	
	public static float getInterest() {
		return rate;
	}
	
	
}