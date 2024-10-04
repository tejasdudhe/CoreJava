package Lab8.pack2;

public class Batch {
	
	int bId;
	String batchName;
	
	public Batch() {
		super();
		bId = 123;
		batchName = "july 2020";
	}

	public Batch(int bId, String batchName) {
		super();
		this.bId = bId;
		this.batchName = batchName;
	}
	
	public void display() {
		System.out.println("Batch Id : "+bId);
		System.out.println("Batch Name : "+bId);
	}
	
	
}
