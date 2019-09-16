package Lesson8;

import java.util.Comparator;

public class NameComparator implements Comparator<Shopping> {

	@Override
	public int compare(Shopping o1, Shopping o2) {
		// TODO Auto-generated method stub
		return o1.getIname().compareTo(o2.getIname());
	}

	
}
