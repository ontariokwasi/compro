package inclass.lesson8;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.BiFunction;
import java.util.stream.Collectors;
// Program to Filter the values start with "M"
public class ImperativeDeclarativeDemo {
	public static void main(String args[]) {
		List<String> names = Arrays.asList("Joe", "Sandy", "Andy", "John","Bruen");


		// Declarative Style
		List<String> list = new ArrayList();
		List<String> filternames = names.stream() // Convert list into stream
				.map(String :: toUpperCase)
				.filter(name -> name.startsWith("J")) // return the filtered stream
				.collect(Collectors.toList()); // organizes into a list

		System.out.println(filternames);
		// Imperative style to check the print the names starts with "M"
		for (String name : names) {
			if (name.startsWith("J"))
				list.add(name.toUpperCase());
		}
		System.out.println(list);
	}
	private int x = 4;
	void sort(int y) {
		x =+y;
		y+=x;
		int k = 0;
		class Morex implements BiFunction<Integer, Integer, Integer>{

			@Override
			public Integer apply(Integer t, Integer u) {
				
				return t*u;
			}
			
		}
	}

}
