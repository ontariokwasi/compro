package homework2_3.employeeinfo;

import java.time.LocalDate;
import java.util.Date;
import java.util.GregorianCalendar;

import javafx.util.converter.LocalDateStringConverter;

public class Employee {

	private Account savingsAcct;
	private Account checkingAcct;
	private Account retirementAcct;
	private String name;
	private LocalDate hireDate;
	
	public Employee(String name, int yearOfHire, int monthOfHire, int dayOfHire){
		this.name = name;
		LocalDate hireDate = LocalDate.of(yearOfHire, monthOfHire, dayOfHire);
	}

	
	public void createNewChecking(double startAmount) {
		// implement
		checkingAcct = new Account(this,AccountType.CHECKING, startAmount);
		
	}

	public void createNewSavings(double startAmount) {
		// implement
		savingsAcct = new Account(this,AccountType.SAVINGS, startAmount);
	}

	public void createNewRetirement(double startAmount) {
		// implement
		retirementAcct = new Account(this,AccountType.RETIREMENT, startAmount);
		
	}

	public String getFormattedAcctInfo() {
		// implement
		//return savingsAcct.toString() + "\n"+checkingAcct.toString()+"\n"+retirementAcct.toString();
		String formatted = "";
		Account [] allacounts = {savingsAcct, checkingAcct, retirementAcct};
		for(Account acc : allacounts) {
			try {
				if(!acc.toString().equals(null))
					formatted += acc.toString()+"\n";
			}
			catch(Exception e) {
				//do nothing
			}
		}
		
		return formatted;
	}
	public void deposit(String acctType, double amt){
		// implement
		if(acctType.equals(AccountType.SAVINGS.toString())) {
			savingsAcct.makeDeposit(amt);
		}
		else if(acctType.equals(AccountType.CHECKING.toString())) {
			checkingAcct.makeDeposit(amt);
		}
		else if(acctType.equals(AccountType.RETIREMENT.toString())) {
			retirementAcct.makeDeposit(amt);
		}
		else {
			System.out.println("Unknown Account type");
		}
		
	}
	public boolean withdraw(String acctType, double amt){
		// implement
		if(acctType.equals(AccountType.SAVINGS.toString())) {
			return savingsAcct.makeWithdrawal(amt);
		}
		else if(acctType.equals(AccountType.CHECKING.toString())) {
			return checkingAcct.makeWithdrawal(amt);
		}
		else if(acctType.equals(AccountType.RETIREMENT.toString())) {
			return retirementAcct.makeWithdrawal(amt);
		}
		else {
			System.out.println("Unknown Account type");
			return false;
		}
	}


	public String getName() {
		return name;
	}


	public LocalDate getHireDate() {
		return hireDate;
	}
	
	
}
