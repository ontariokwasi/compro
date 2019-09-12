package homework4.problem2;

import java.time.LocalDate;

public class DeptEmployee {
	private double salary;
	private String name;
	private LocalDate hiredate;
	
	DeptEmployee(String name, LocalDate hiredate, double salary){
		this.name = name;
		this.hiredate = hiredate;
		this.salary = salary;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public LocalDate getHiredate() {
		return hiredate;
	}

	public void setHiredate(LocalDate hiredate) {
		this.hiredate = hiredate;
	}
	
	public double computeSalary() {
		return this.salary;
	}

}
