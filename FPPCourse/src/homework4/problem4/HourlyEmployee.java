package homework4.problem4;

public class HourlyEmployee extends Employee {
	private double wage;
	private double hours;
	
	HourlyEmployee(String fname, String lname, String ssn, double wage, double hours){
		super(fname, lname, ssn);
		this.wage = wage;
		this.hours = hours;
	}
	
	//implement the getPayment method
	public double getPayment() {
		return wage * hours;
	}
	@Override
	public String toString() {
		return String.format("%s Wage: %f Hours: %f", super.toString(), wage, hours);
	}
}
