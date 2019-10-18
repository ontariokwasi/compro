package lab8.prob5;

import java.util.Arrays;
import java.util.List;

public class PrintWithForEach {

	public static void main(String[] args) {
		List<String> fruits = Arrays.asList("Apple", "Banana","Orange","Cherries","blums");
		//a. Print using lambda
		fruits.forEach(fruit -> System.out.println(fruit));
		
		//b. Print using Method Reference
		fruits.forEach(System.out::println);

	}

}
