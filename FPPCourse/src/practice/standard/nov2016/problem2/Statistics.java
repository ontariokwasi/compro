package practice.standard.nov2016.problem2;
import java.util.*;
public class Statistics {
	/** 
	 * Polymorphically computes and returns the sum
	 * of all the salaries of all the staff/teachers in the list.
	 */
	public static double computeSumOfSalaries(List<EmployeeData> aList) {
		double totalsalary = 0.0;
		for(EmployeeData emp : aList)
			totalsalary += emp.getSalary();
		return totalsalary;
		
	}
}
