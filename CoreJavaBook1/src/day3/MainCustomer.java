package day3;

public class MainCustomer {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Customer c1 = new Customer();
		Customer c2 = new Customer();
		Customer c3 = new Customer();
		System.out.println("count: "+Customer.count);
		

	}

}

class Customer{
	
	int custId;
	String cName;
	
	static int count;
	
	static{
		count =0;
		System.out.println("count: "+count);
	}
	
	public Customer()
	{
		count++;
	}
	
}

