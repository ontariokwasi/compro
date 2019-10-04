package lab4.probC;

public class Salaried extends Employee{
	//field
	private double salary;
	
	//constructor
	Salaried(String empId, double salary){
		super(empId);
		this.salary = salary;
	}
	
	//getter, setter
	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}

	@Override
	public double calcGrossPay(int month, int year) {
		return salary;
	}

}
