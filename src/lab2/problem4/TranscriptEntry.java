package lab2.problem4;

class TranscriptEntry {
	Student student;
	Section section;
	String grade;
	
	//constructor
	TranscriptEntry(Student s, Section sect, String grade){
		this.section = sect;
		this.student = s;
		this.grade = grade;
	}
	
	public String toString() {
		return "Student: " + student.name + "\n"
				+ "Course name: " + section.courseName + "\n"
				+ "Section number: " + section.sectionNumber + "\n"
				+ "Grade: " + grade + "\n";
	}
}
