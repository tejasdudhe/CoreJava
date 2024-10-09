package Lab24;

import java.util.List;
import java.util.Collections;

public class SortUtil  {
	
	
	public void sort(List<Employee> Employees)
	{
		Collections.sort(Employees);
	}
	
	public void sortBySalary(List<Employee> Employees)
	{
		Collections.sort(Employees,new CompareBySalary());
	}
	
	
	
}
