package myStack;

public class TestStack {

	public static void main(String[] args) {

		GenStack st = new GenStack(5);
		try {
			st.push("Akash");
			st.push("Pravin");
			st.push("Pranav");
			st.push("ritesh");
			st.push("navin");

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
