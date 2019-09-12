package homework4.problem4;

public class SalariedEmployee extends Employee {
	private double weeklySalary;
	
	SalariedEmployee(String fname, String lname, String ssn, double weeklySalary){
		super(fname, lname, ssn);
		this.weeklySalary = weeklySalary;
	}
	
	//implement the getPayment method
	public double getPayment() {
		return weeklySalary;
	}
	
	@Override
	public String toString() {
		return String.format("%s WeeklySalary: %f", super.toString(), weeklySalary);
	}
}
