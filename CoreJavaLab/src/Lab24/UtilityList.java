package Lab24;

import java.util.List;

public class UtilityList {

	public UtilityList() {
		super();
	}

	
	public void printList(List<Employee> employees) {
        for (Employee employee : employees) {
            System.out.println(employee);
        }
    }
}
