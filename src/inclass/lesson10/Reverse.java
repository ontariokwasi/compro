package inclass.lesson10;
import java.util.*;



public class Reverse {
	//Fix this code using a helper method to capture the wildcard
	public static void reverse(List<?> list) {   
		getItemReversed(list);
	}
	
	public static <T> void getItemReversed(List<T> items){
		List<T> tmp = new ArrayList<T>(items);   
		for (int i = 0; i < items.size(); i++) { 
	      items.set(i, tmp.get(items.size() - i - 1)); 
	   } 
	}
	
	//Test your code with this main method
	public static void main(String[] args) {
		List<Person> persons = Arrays.asList(new Person("Joe"), new Person("Jim"), 
				new Person("Tom"), new Person("Anne"));
		System.out.println("Before reversing: " + persons);
		Reverse.reverse(persons);
		System.out.println("After reversing: " + persons);
		
	}

}
