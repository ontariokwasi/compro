package homework2.problem2;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//String name, String aNickName, double aSalary, int aYear, int aMonth, int aDay
		Employee employee = new Employee("Gideon Akomeng","Ogidi", 1000.00, 2019, 9, 2);
		
		Account checking = new Account(employee,AccountType.CHECKING, 300);
		Account savings = new Account(employee,AccountType.SAVINGS, 300);
		Account retirement = new Account(employee,AccountType.RETIREMENT, 300);
		
		checking.makeDeposit(200.00);
		savings.makeDeposit(200.00);
		retirement.makeDeposit(200.00);
		
		checking.makeWithdrawal(100.00);
		savings.makeWithdrawal(200.00);
		retirement.makeWithdrawal(300.00);
		
		System.out.println(checking.toString());
		System.out.println(savings.toString());
		System.out.println(retirement.toString());

	}

}
