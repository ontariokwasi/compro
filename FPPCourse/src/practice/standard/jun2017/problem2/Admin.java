package practice.standard.jun2017.problem2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Admin {
	public static List<Student> convertArray(Object[] studentArray) {
		List <Student> studentlist = new ArrayList<Student>();
		for(Object student : studentArray)
			studentlist.add((Student) student);
		
		return studentlist;
	}
	
	
	public static double computeAverageGpa(List <Student> studentList) {
		double totalgpa = 0.0;
		for(Student student : studentList)
			totalgpa += student.computeGpa();
		return totalgpa / studentList.size();
	}
}
