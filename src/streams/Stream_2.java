package streams;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.function.BiFunction;
import java.util.function.Function;
import java.util.stream.Collectors;

public class Stream_2 {
	static final BiFunction<List<Employee>, Double, List<Employee>> MORE_THAN = (emplist, target) -> emplist.stream().filter(e->e.getSalary() > target).collect(Collectors.toList());

	public static void main(String[] args) {
		List<Employee> emps = new ArrayList<>();
		Employee emp1 = new Employee("Yodit", "Wonder", 140000.00);
		Employee emp2 = new Employee("Reggie", "Something", 200000.00);
		Employee emp3 = new Employee("Yodit", "Auber", 100000.00);
		emps.add(emp1);
		emps.add(emp2);
		emps.add(emp3);
		System.out.println(emps);
		System.out.println(sortedEmps(emps));
		System.out.println(computeTotalSalary(emps));
		System.out.println(moreThan100k(emps));
		System.out.println(MORE_THAN.apply(emps, 10000.0));
		System.out.println(earnsmoreThanAndFirstBeginsWith(emps, 100000, 'Y'));
		System.out.println(firstEmpearnsMorethanAndBegins(emps, 10000, 'Y'));

	}

	static class Employee {
		private String firstname;
		private String lastname;
		private double salary;

		public Employee(String firstname, String lastname, double salary) {
			this.firstname = firstname;
			this.lastname = lastname;
			this.salary = salary;
		}

		public String getFirstname() {
			return firstname;
		}

		public void setFirstname(String firstname) {
			this.firstname = firstname;
		}

		public String getLastname() {
			return lastname;
		}

		public void setLastname(String lastname) {
			this.lastname = lastname;
		}

		public double getSalary() {
			return salary;
		}

		public void setSalary(double salary) {
			this.salary = salary;
		}

		@Override
		public String toString() {
			return "Employee [firstname=" + firstname + ", lastname=" + lastname + ", salary=" + salary + "]";
		}

	}

	public static List<Employee> sortedEmps(List<Employee> employees) {
		// use the stream API to sort the list of employees first
		// by Firstname and then by LastName and then by salary
		List<Employee> sortedEmp = employees.stream().sorted(Comparator.comparing(Employee::getFirstname)
				.thenComparing(e -> e.getLastname()).thenComparing(Employee::getSalary)).collect(Collectors.toList());
		return sortedEmp;
	}

	public static double computeTotalSalary(List<Employee> emplist) {
		// use the Stream api to compute the total salary of all the employees

		double totalSalaries = emplist.stream().map(Employee::getSalary).reduce(0.0, (x, y) -> x + y);
//								.collect(Collectors.summingDouble(x->x));
		return totalSalaries;
	}

	public static List<Employee> moreThan100k(List<Employee> emplist) {
		// use the stream API to produce all the employees that earn more than 100k;
		List<Employee> m100k = emplist.stream().filter(e -> e.getSalary() > 100000).collect(Collectors.toList());
		return m100k;
	}

	public static int earnBetween150And250k(List<Employee> emplist) {
		// count of employees earning between ...
		int btwn = (int) emplist.stream().filter(y -> y.getSalary() >= 150000).filter(y -> y.getSalary() <= 250000)
				.count();
		return btwn;
	}

	public static boolean earnsmoreThanAndFirstBeginsWith(List<Employee> emplist, double target, char fnbegins) {
		// Is there an employee who earns more than {target amout} and first name begins
		// with {fnbegins}
		Optional<Employee> opt = emplist.stream().filter(e -> e.getSalary() > target)
				.filter(e -> e.getFirstname().startsWith(fnbegins + "")).findAny();

		return opt.isPresent();
	}

	public static Employee firstEmpearnsMorethanAndBegins(List<Employee> emplist, double target, char begins) {
		// find the first employee whose salary is more than target and firstname begins
		// with begins;
		Employee e1 = emplist.stream().filter(e -> e.getSalary() > target)
				.filter(e -> e.getFirstname().startsWith(begins + "")).findFirst()
				.orElse(new Employee("default", "Deafult", 0.00));
		return e1;
	}
}
