package lab25;
import java.util.Set;

import java.util.HashSet;

public class Employee implements Comparable<Employee> {
	private int empNo;
    private String empName;
    private double salary;
    private Set<String> skillsets;
    
    
	
    public Employee() {
		super();
	
	}

	public Employee(int empNo, String empName, double salary, Set<String> skillsets) {
        this.empNo = empNo;
        this.empName = empName;
        this.salary = salary;
        this.skillsets = skillsets;
    }

    public int getEmpNo() {
        return empNo;
    }

    public String getEmpName() {
        return empName;
    }

    public double getSalary() {
        return salary;
    }

    public Set<String> getSkillsets() {
        return skillsets;
    }

    @Override
    public String toString() {
        return "Employee No: " + empNo + ", Name: " + empName + ", Salary: " + salary + ", Skillsets: " + skillsets;
    }

	@Override
	public int compareTo(Employee o) {
		// TODO Auto-generated method stub
		if(this.empNo > o.empNo)
			return 1;
		else if(this.empNo < o.empNo)
			return -1;
		
		return 0;
	}
    
    

	
}
