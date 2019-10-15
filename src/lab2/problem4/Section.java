package lab2.problem4;

import java.util.*;

public class Section {
	//fields
	String courseName;
	int sectionNumber;
	List<TranscriptEntry> gradeSheet;

	//constructor
	Section(String courseName,int sectionNumber){
		this.courseName = courseName;
		this.sectionNumber = sectionNumber;
		gradeSheet = new ArrayList<TranscriptEntry>();
	}
}
