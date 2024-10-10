package day14_2;

public class TestMain {

	public static void main(String[] args) {
		
		PersonFactory p = Person::new;
		
		System.out.println("Consturctor isn't call yet");
		System.out.println(p.get(30, "Aditya"));
		
	}

}
