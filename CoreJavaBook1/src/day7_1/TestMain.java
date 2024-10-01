package day7_1;

public class TestMain {
	public static void main(String[] args) {
		
		MyShape sh = new Rectangle(5,4);
		sh.area();
		
		sh = new Circle(4);
		sh.area();
	}
}
