package day13_1;

public class AverageCalci <T extends Number> {
	
	T[] arr;

	public AverageCalci() {
		
	}

	public AverageCalci(T[] arr) {
		super();
		this.arr = arr;
	}
	
	public double average() {
		double sum =0.0;
		
		for (int i =0 ; i< arr.length ;i++) 
		{
			sum = sum + arr[i].doubleValue();
		}
		return sum/arr.length;
	}
	
	public boolean isSameAvg(AverageCalci<?> ob)
	{
		if(this.average() == ob.average())
		{
			return true;
		}
		else
			return false;
	}
	
}
