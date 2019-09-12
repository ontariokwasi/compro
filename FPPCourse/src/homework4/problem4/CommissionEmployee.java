package homework4.problem4;

public class CommissionEmployee extends Employee{
	private double grossSales;
	private double commissionRate;
	
	CommissionEmployee(String fname, String lname, String ssn, double grossSales, double commissionRate){
		super(fname, lname, ssn);
		this.grossSales = grossSales;
		this.commissionRate = commissionRate;
	}
	//implement the getPayment method
	public double getPayment() {
		return grossSales * commissionRate;
	}
	
	@Override
	public String toString() {
		return String.format("%s GrossSales: %f Commission: %f", super.toString(), grossSales, commissionRate);
	}
}
