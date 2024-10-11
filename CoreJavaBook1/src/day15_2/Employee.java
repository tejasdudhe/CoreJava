package day15_2;

import java.io.Serializable;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

public class Employee implements Comparable<Employee>,Serializable{
	
	int empId;
	String eName;
	String loc;
	
	Set<String> skillSet =null;
	Map<String, Integer> pCards = null;
	List <String> quali = null;
	
	
	
	public Employee() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Employee(int empId, String eName, String loc, Set<String> skillSet, Map<String, Integer> pCards,
			List<String> quali) {
		super();
		this.empId = empId;
		this.eName = eName;
		this.loc = loc;
		this.skillSet = skillSet;
		this.pCards = pCards;
		this.quali = quali;
	}

	

	public int getEmpId() {
		return empId;
	}

	public void setEmpId(int empId) {
		this.empId = empId;
	}

	public String geteName() {
		return eName;
	}

	public void seteName(String eName) {
		this.eName = eName;
	}

	public String getLoc() {
		return loc;
	}

	public void setLoc(String loc) {
		this.loc = loc;
	}

	public Set<String> getSkillSet() {
		return skillSet;
	}

	public void setSkillSet(Set<String> skillSet) {
		this.skillSet = skillSet;
	}

	public Map<String, Integer> getpCards() {
		return pCards;
	}

	public void setpCards(Map<String, Integer> pCards) {
		this.pCards = pCards;
	}

	public List<String> getQuali() {
		return quali;
	}

	public void setQuali(List<String> quali) {
		this.quali = quali;
	}

	public void display() {
		
		System.out.println("---------------------------\n");
		System.out.println("\nEmployee Id : "+this.empId);
		System.out.println("Employee Name : "+this.eName);
		System.out.println("Employee Location : "+this.loc);
		System.out.println("Employee SkillSet : "+this.skillSet);
		System.out.println("Employee Personal cards : "+this.pCards);
		System.out.println("Employee Qualification : "+this.quali);
		System.out.println("\n--------------------------");

	}
	
	public void addData()
	{
		Scanner sc = new Scanner(System.in);
		
		System.out.print("\nEnter Employee Id : ");
		this.empId = sc.nextInt();
		
		sc.nextLine();
		System.out.print("\nEnter Employee Name : ");
		this.eName = sc.nextLine();
		
		System.out.println("\nEnter Employee Location : ");
		this.eName = sc.nextLine();
		
		
	}
	
	
	@Override
	public int compareTo(Employee o) {
		
		if(this.empId>o.empId)
			return 1;
		else if(this.empId<o.empId)
			return -1;
		return 0;
	}

	
	
	
	
	
	
}
