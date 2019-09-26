package practice.standard.jan2017.problem2.solution;

import java.util.List;

public class AccountManager {
	public static double computeAccountBalanceSum(List<Employee> emps) {
		double sum = 0.0;
		for(Employee emp : emps)
			for(Account account : emp.getAccounts())
				sum += account.getBalance();
		return sum;
	}
}
