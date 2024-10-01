package day7_1;

public class Circle extends MyShape {
	float r;

	public Circle() {
		r = 0;
	}

	public Circle(float r) {
		this.r = r;
	}

	@Override
	public void area() {
		float area;
		area = PI * r * r;
		System.out.println("Area of Circle:" + area);
	}
}
