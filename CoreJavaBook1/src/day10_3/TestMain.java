package day10_3;

public class TestMain {

	public static void main(String[] args) {
		
		Student st = new Student();
		
		
		try {
			st.acceptData();			
			st.displayData();
		} catch (NameException | AgeException e) {
			
			e.printStackTrace();
		}

	}

}
