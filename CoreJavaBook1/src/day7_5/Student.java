package day7_5;

public class Student {

	protected int studId;
	protected String name;
	protected int depId;
	protected int phoneNo;

	public Student() {

	}

	public Student(int studId, String name, int depId,int phoneNo) {

		this.studId = studId;
		this.name = name;
		this.depId = depId;
		this.phoneNo = phoneNo;
	}

	public int getStudId() {
		return studId;
	}

	public void setStudId(int studId) {
		this.studId = studId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getDepId() {
		return depId;
	}

	public void setDepId(int depId) {
		this.depId = depId;
	}

	public int getPhoneNo() {
		return phoneNo;
	}

	public void setPhoneNo(int phoneNo) {
		this.phoneNo = phoneNo;
	}
	
	
	

}
