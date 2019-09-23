package homework11.problem2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;

public class EmployeeAdmin {
	
	/**
		Returns a list of Employees whose social security number is on the input list socSecNums
		and whose salary is > 80000. The list must be ordered by social security number,
		from lowest to highest. To sort, you must use a Collections sorting method
		and you must define your own Comparator to be used to compare Employees by ssn. 
	*/
	public static List<Employee> prepareReport(HashMap<String, Employee> table, List<String> socSecNums) {
		//IMPLEMENT
		List<Employee> report = new ArrayList<Employee>();
		socSecNums.forEach(socnum ->{
			try {
				if(table.get(socnum).getSalary() > 80000) {
					report.add(table.get(socnum));
				}
			}
			catch(NullPointerException e) {
				//do nothing
			}
		});
		Collections.sort(report, (e1,e2) ->{
			Employee emp1 = (Employee)e1;
			Employee emp2 = (Employee)e2;
			if(emp1.getSsn().compareTo(emp2.getSsn()) > 0) return 1;
			else 
				return -1;
		});
		return report;
		
	}
	
}
