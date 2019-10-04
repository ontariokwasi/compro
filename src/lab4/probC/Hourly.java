package lab4.probC;

public class Hourly extends Employee{
	//fields
	private double hourlyWage;
	private double hoursPerWeek;
	
	//constructor
	Hourly(String empId, double hourlyWage, double hoursPerWeek){
		super(empId);
		this.hourlyWage = hourlyWage;
		this.hoursPerWeek = hoursPerWeek;
	}

	//getter, setter
	public void setHourlyWage(double hourlyWage) {
		this.hourlyWage = hourlyWage;
	}

	public void setHoursPerWeek(double hoursPerWeek) {
		this.hoursPerWeek = hoursPerWeek;
	}

	public double getHourlyWage() {
		return hourlyWage;
	}

	public double getHoursPerWeek() {
		return hoursPerWeek;
	}
	
	//functions
	@Override
	public double calcGrossPay(int month, int year) {
		return hourlyWage*hoursPerWeek*4;
	}
	

}//end_class
