package homework11.problem1;
import java.util.*;
public class Admin {
	public static HashMap<Key, Student> processStudents(List<Student> students) {
		//implement
		HashMap<Key, Student> stdmap = new HashMap<Key, Student>();
		students.forEach(student -> {
			stdmap.put(new Key(student.getFirstName(), student.getLastName()), student);
		});
		return stdmap;
	}
}
