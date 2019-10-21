package lab9.prob7b;

import java.util.List;
import java.util.stream.Collectors;

public class LambdaLibrary {
	public static TriFunction<List<Employee>, Double, Character, String> EMPLOYEE_NAMES_BY = (list, minSalary, minChar) -> list.stream()
			.filter(e -> e.getSalary() > minSalary && e.getLastName().charAt(0) > minChar)
			.map(e -> e.getFirstName()+" "+e.getLastName())
			.sorted()
			.collect(Collectors.joining(", "));
}
