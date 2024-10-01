package day7_1;

public class Rectangle extends MyShape {
	
	float len;
	float bdt;
	
	public Rectangle() {
		len=bdt=0;
	}

	public Rectangle(float len, float bdt) {
		this.len = len;
		this.bdt = bdt;
	}
	
	
	@Override
	public void area()
	{
		float area;
		area = len*bdt;
		System.out.println("Area of rectangle : "+area);
	}
	
	
	
	
}
