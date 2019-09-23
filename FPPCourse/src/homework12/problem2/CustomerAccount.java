package homework12.problem2;

public class CustomerAccount {

	private String Cus_name;
	private String Acc_No;
	private double Balance;
	
	public CustomerAccount(String cus_name, String acc_No, double balance) throws MyException {
		if(balance < 100) throw new MyException("Balance must not be less than $100");
		Cus_name = cus_name;
		Acc_No = acc_No;
		Balance = balance;
		System.out.println("Account created successfully!");
	}

	public void deposit(double amount) throws MyException{
		if(amount <= 0) throw new MyException("Invalid deposit amount");
		else {
			Balance += amount;
			System.out.println("Deposit of $"+amount+" successful!");
		}
		
	}
	
	public void Withdraw(double amount) throws MyException{
		if(amount <= 0)throw new MyException("Withdrawal amount should be greater than $0");
		else if(amount+100 > Balance) throw new MyException("Insufficient Balance");
		else {
			Balance -= amount;
			System.out.println("Withdrawal of $"+amount+" successful!");
		}
	}
	
	//Test program
	public static void main(String [] args) throws MyException {
		try {
		//1. Test exception from constructor // change balance from 200 to any value less than 100, say 60;
		CustomerAccount ca = new CustomerAccount("Gideon Akomeng", "123456", 200);
		
		//2. Test deposit exception // change amount to 0 or less;
		ca.deposit(20);
		
		//3. Test withdrawal exception // change amount to anything greater than balance or balance-100 say 200; 
		ca.Withdraw(10);
		}catch(MyException ex) {
			System.out.println("ERROR: "+ex.getMessage());
		}
	}

}
