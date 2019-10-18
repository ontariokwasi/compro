package lab8.prob6;

import java.util.Arrays;
import java.util.function.Consumer;

public class ArraySort {

	public static void main(String[] args) {
		String[] names = {"Alexis", "Tim", "Kyleen", "KRISTY"};
		Consumer<String[]> list = Arrays::sort;
		list.accept(names);
		System.out.println(Arrays.toString(names));
		

	}

}
