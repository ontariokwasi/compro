package lab9.prob6;

import java.util.Arrays;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class Union {

	public static void main(String[] args) {
		List<Set<String>> sets = Arrays.asList(
				new TreeSet<String>(Arrays.asList("1","2","3")),
				new TreeSet<String>(Arrays.asList("A","B","C")),
				new TreeSet<String>(Arrays.asList("D","E","F")));
		System.out.println(union(sets));
	}
	
	 public static Set<String> union(List<Set<String>> sets){
		 Set<String> union = sets.stream().reduce((a,b) -> {a.addAll(b); return a;}).get();
		 return union;	
	 }
}
