package Lab24;

import java.util.List;

public class SearchUtil {
	
	public Employee searchEmpInfo(List<Employee> employees, int empNo) throws EmployeeRecordNotFoundException {
		
        for (Employee employee : employees) {
            if (employee.getEmpNo() == empNo) {
                return employee;
            }
        }
        throw new EmployeeRecordNotFoundException("Employee Record Not Found with empNo: " + empNo);
    }
}
