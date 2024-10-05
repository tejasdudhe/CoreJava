package day11_3;

public class Student {
	
	private int stdId;
	private String name;
	private int[] marks;
	private float average;
	private char grade;
	
	public Student() {
		super();
	}
	
	public Student(int stdId,String name,int[] marks)
	{
		this.stdId = stdId;
		this.name = name;
		this.marks = marks;
	}

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

	public int[] getMarks() {
		return marks;
	}

	public void setMarks(int[] marks) {
		this.marks = marks;
	}
	
	public void calculateAverage()
	{
		int sum=0;
		for (int mark : marks) {
			sum+=mark;
		}
		
		average = sum/marks.length;
	}
	
	public void findGrade() {
		
		if(average > 80 && average <=100)
		{
			grade = 'O';
		}
		else if(average > 70 && average <=80)
		{
			grade = 'A';
		}else if(average >= 50 && average <=70)
		{
			grade = 'B';
		}else if(average < 50)
		{
			grade = 'F';
		}
		
	}
	
	
	
}
