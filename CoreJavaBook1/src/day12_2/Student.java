package day12_2;

public class Student {

		private int stdId;
		private String name;
		private int marks;

		public Student() {
			
		}

//		public Student(int stdId, String name, int marks) {
//			this.stdId = stdId;
//			this.name = name;
//			this.marks = marks;
//		}

		public int getStdId() {
			return stdId;
		}

		public void setStdId(int stdId) {
			this.stdId = stdId;
		}

		public String getName() {
			return name;
		}

		public void setName(String name) {
			this.name = name;
		}

		public int getMarks() {
			return marks;
		}

		public void setMarks(int marks) {
			this.marks = marks;
		}

		@Override
		public String toString() {
			return "Student [stdId=" + stdId + ", name=" + name + ", marks=" + marks + "]";
		}
		
		
		
		
		
}
