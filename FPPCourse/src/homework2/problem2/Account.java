package homework2.problem2;

class Account {
	//public final static AccountType CHECKING = AccountType.CHECKING;
	//public final static AccountType SAVINGS = AccountType.SAVINGS;
	//public final static AccountType RETIREMENT = AccountType.RETIREMENT;
	private final static double DEFAULT_BALANCE = 0.0;
	private double balance;
	private AccountType acctType;
	private Employee employee;

	Account(Employee emp, AccountType acctType, double balance) {
		employee = emp;
		this.acctType = acctType;
		this.balance = balance;
		//System.out.println(AccountType.CHECKING);
	}

	Account(Employee emp, AccountType acctType) {
		this(emp, acctType, DEFAULT_BALANCE);
	}

	public String toString() {
		return "type = " + acctType + ", balance = " + balance;
	}

	public void makeDeposit(double deposit) {
		// implement
		this.balance += deposit;
	}

	public boolean makeWithdrawal(double amount) {
		// implement
		if(amount < balance) {
			makeDeposit(-amount);
			return true;
			}
		return false;
	}

	public double getBalance() {
		return balance;
	}

	public AccountType getAcctType() {
		return acctType;
	}
	
}
