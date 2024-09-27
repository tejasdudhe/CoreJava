package day2_1;

public class MainMath {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MathClass m1 = new MathClass();
		m1.add();
		
		m1.add(20,30);
		m1.add(30.6,10.5,11);

	}
}

	class MathClass{
		
		
		public void add()
		{
			System.out.println("add1: "+(20+6));
		}
		
		public void add(int x,int y)
		{
			System.out.println("add2: "+(x+y));
		}
		
		public void add(double x,double y,int z)
		{
			System.out.println("add3: "+(x+y+z));
		}
	}

