package myStack;

public class TestStack {

	public static void main(String[] args) {
		
		Stack st = new Stack(5);
		st.push(5);
		st.push(6);
		st.push(4);
		st.push(3);
		st.push(1);
		
		
		try {
			System.out.println(st.pop());
			System.out.println(st.pop());
			System.out.println(st.pop());
			System.out.println(st.pop());
			System.out.println(st.pop());
			System.out.println(st.pop());
		} catch (Exception e) {
			
			e.printStackTrace();
		}
		
		
		
	}

}
