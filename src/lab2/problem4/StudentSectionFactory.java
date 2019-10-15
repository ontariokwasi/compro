package lab2.problem4;

import java.util.List;

public class StudentSectionFactory {

	public Section createSection(int secNum, String courseName) {
		return new Section(courseName,secNum);
	}
	
	public Student createStudent(String id, String name) {
		return new Student(name,id);
	}
	
	public void newTranscriptEntry(Student s, Section sect , String grade) {
		TranscriptEntry et = new TranscriptEntry(s, sect, grade);
		//List<TranscriptEntry> grade1 = s.getGrades();
		s.grades.add(et);
		//System.out.println(grade1);
	}
	
}//end_class
