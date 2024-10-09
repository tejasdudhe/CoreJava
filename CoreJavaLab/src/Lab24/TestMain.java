package Lab24;


import java.util.*;
public class TestMain {


	    public static void main(String[] args) {
	        Set<String> skills1 = new HashSet<>(Arrays.asList("Java", "SQL"));
	        Set<String> skills2 = new HashSet<>(Arrays.asList("Python", "Machine Learning"));

	        Employee e1 = new Employee(101, "Akash", 70000, skills1);
	        Employee e2 = new Employee(102, "Bharat", 50000, skills2);

	        List<Employee> employeeList = new ArrayList<>();
	        employeeList.add(e1);
	        employeeList.add(e2);

	        // Print List
	        UtilityList utilList = new UtilityList();
	        utilList.printList(employeeList);

	        // Show Report
	        Map<String, Double> empSalaryMap = new HashMap<>();
	        empSalaryMap.put(e1.getEmpName(), e1.getSalary());
	        empSalaryMap.put(e2.getEmpName(), e2.getSalary());
	        UtilityReport utilReport = new UtilityReport();
	        utilReport.showReport(empSalaryMap);

	        // Sort by Salary
	        SortUtil sortUtil = new SortUtil();
	        sortUtil.sortBySalary(employeeList);
	        utilList.printList(employeeList);

	        // Search Employee Info
	        SearchUtil searchUtil = new SearchUtil();
	        try {
	            Employee foundEmployee = searchUtil.searchEmpInfo(employeeList, 101);
	            System.out.println("Found: " + foundEmployee);
	        } catch (EmployeeRecordNotFoundException e) {
	            System.err.println(e.getMessage());
	        }
	    }
	}
