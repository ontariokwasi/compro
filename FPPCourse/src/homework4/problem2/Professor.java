package homework4.problem2;

import java.time.LocalDate;

public class Professor extends DeptEmployee {

	private int numberOfPublications;
	public Professor(String name, LocalDate hiredate, double salary) {
		super(name, hiredate, salary);
	}
	public int getNumberOfPublications() {
		return numberOfPublications;
	}
	public void setNumberOfPublications(int numberOfPublications) {
		this.numberOfPublications = numberOfPublications;
	}
	
}
