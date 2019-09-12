package homework4.problem4;

public class BasePlusCommissionEmployee extends CommissionEmployee{
	private double baseSalary;
	
	BasePlusCommissionEmployee(String fname, String lname, String ssn, double grossSales, double commissionRate, double baseSalary) {
		super(fname, lname, ssn, grossSales, commissionRate);
		this.baseSalary = baseSalary;
	}
	
	//implement the getPayment method
	public double getPayment() {
		return baseSalary + super.getPayment();
	}
	
	@Override
	public String toString() {
		return String.format("%s BaseSalary: %f", super.toString(), baseSalary);
	}
}
