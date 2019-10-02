package lab2.problem2.prob2A.Test;

import lab2.problem2.prob2A.Student;

public class Main {
	public static void main(String [] args) {
		Student student = new Student("Gideon");
		student.getGradeReport().setGrade("A");
		
		System.out.println(student.getGradeReport());
		
	}
}
