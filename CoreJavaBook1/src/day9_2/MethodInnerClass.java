package day9_2;

public class MethodInnerClass {

	int n;
	static int cnt = 10;

	public MethodInnerClass() {
		n = 10;
	}

	static public void displayCnt() {
		System.out.println("Value OF Count : " + cnt);
	}

	public void m1() {

		final int z = 100;

		class Inner 
		{
			int a;

			Inner() {
				a = 20;
			}

			public void display()
			{
				System.out.println("Value of a : "+a);
				System.out.println("Value of z : "+z);
				System.out.println("Value of n : "+n);
			}
		}
		
		Inner ob = new Inner();
		ob.display();
	}

}
