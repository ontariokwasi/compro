package lab2.problem4;

import java.util.*;

public class Student {
	String name;
	String id;
	List<TranscriptEntry> grades;
	
	public Transcript getTranscript() {
		return new Transcript(grades, this);
		
	}

	//getter, setter
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}
	
	
	public List<TranscriptEntry> getGrades() {
		return grades;
	}

	public void setGrades(List<TranscriptEntry> grades) {
		this.grades = grades;
	}

	//constructor
	Student(String name, String id){
		this.name = name;
		this.id = id;
		grades = new ArrayList<TranscriptEntry>();
	}
	
	
}
