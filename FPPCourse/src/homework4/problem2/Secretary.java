package homework4.problem2;

import java.time.LocalDate;

public class Secretary extends DeptEmployee{
	private double overtimeHours;
	
	public Secretary(String name, LocalDate hiredate, double salary) {
		super(name, hiredate, salary);
	}

	public double getOvertimeHours() {
		return overtimeHours;
	}

	public void setOvertimeHours(double overtimeHours) {
		this.overtimeHours = overtimeHours;
	}

	@Override
	public double computeSalary() {
		
		return super.computeSalary() + 12 * overtimeHours;
	}
	
}
