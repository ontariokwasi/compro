package lab3.prob1;

public class PersonWithJob {
	
	private double salary;
	private Person person;
	
	public double getSalary() {
		return salary;
	}
	PersonWithJob(String n, double s) {
		salary = s;
		person = new Person(n);
	}
	PersonWithJob(String n) {
		salary = 0.0;
		person = new Person(n);
	}
	
	@Override
	public boolean equals(Object aPerson) {
		if(aPerson == null) return false; 
		if(!(aPerson instanceof PersonWithJob)) return false;
		PersonWithJob p = (PersonWithJob)aPerson;
		boolean isEqual = this.person.getName().equals(p.person.getName()) &&
				this.getSalary()==p.getSalary(); // with no salary comaprison, the two persons should be equal
		return isEqual;
	}
	public static void main(String[] args) {
		PersonWithJob p1 = new PersonWithJob("Joe", 30000);
		PersonWithJob p2 = new PersonWithJob("Joe");//default salary is 0.0;
		//As PersonsWithJobs, p1 should be equal to p2
		System.out.println("p1.equals(p2)? " + p1.equals(p2)); 
		System.out.println("p2.equals(p1)? " + p2.equals(p1));
	}


}
