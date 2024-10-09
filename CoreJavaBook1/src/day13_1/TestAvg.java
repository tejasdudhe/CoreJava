package day13_1;

public class TestAvg {

	public static void main(String[] args) {

		Integer iArr[] = { 10, 20, 30, 40, 50 };
		AverageCalci<Integer> iob = new AverageCalci<>(iArr);
		System.out.println("Integer Avg : " + iob.average());

		Double dArr[] = { 10.5, 2.8, 36.5, 40.0, 50.8 };
		AverageCalci<Double> dob = new AverageCalci<>(dArr);
		System.out.println("Integer Avg : " + dob.average());
		
		if(iob.isSameAvg(dob))
		{
			System.out.println("Same Average");
		}
		else
		{
			System.out.println(" Not a Same Average");
		}
	}

}
