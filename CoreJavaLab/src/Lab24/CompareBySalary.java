package Lab24;

import java.util.Comparator;

public class CompareBySalary implements Comparator<Employee> {
	
	@Override
	public int compare(Employee o1, Employee o2) {
		
		double sal1 = o1.getSalary();
		double sal2 = o2.getSalary();
		
		if(sal1 > sal2)
		{
			return 1;
		}
		else if(sal1 <sal2)
		{
			return -1;
		}
		
		return 0;
	}
}
