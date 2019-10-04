package lab4.probC;

public abstract class Employee {
	//field
	private String empId;
	
	//constructor
	Employee(String empId){
		this.empId = empId;
	}
	
	//function
	public void print(int month, int year) {
		System.out.println("Employee Id:" + empId);
		Paycheck pc = calcCompensation(month, year);
		pc.print();
		
	}
	
	public Paycheck calcCompensation(int month, int year) {
		double grossPay = this.calcGrossPay(month,year);
		return new Paycheck(grossPay);
	}
	
	public abstract double calcGrossPay(int month, int year);

}
