package homework4.problem4;

public abstract class Employee {
	private String firstName;
	private String lastName;
	private String socialSecurityNumber;
	
	Employee(String fname, String lname, String ssn){
		this.firstName = fname;
		this.lastName = lname;
		this.socialSecurityNumber = ssn;
	}
	
	public abstract double getPayment();
	
	@Override
	public String toString() {
		return String.format("Name: %s %s SSN: %s", firstName, lastName, socialSecurityNumber);
	}

}
