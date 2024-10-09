package day13_2;

import java.util.Comparator;

class StdNameComparator implements Comparator<Student>
{

	@Override
	public int compare(Student o1, Student o2) {
		
		return o1.getName().compareTo(o2.getName());
	}
	
}
public class Student implements Comparable<Student>{

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

		@Override
		public int compareTo(Student o) {
			
			if(this.stdId > o.stdId)
				return 1;
			else if(this.stdId < o.stdId)
				return -1;
			
			return 0;
		}
		
		
		
		
		
}
