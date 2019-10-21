package lab8.prob6;

import java.text.Collator;
import java.util.Arrays;
import java.util.function.BiConsumer;
import java.util.function.Consumer;

public class ArraySort {

	public static void main(String[] args) {
		String[] names = { "Alexis", "Tim", "Kyleen", "KRISTY" };
		// Does not ignore case(Case Sensitive)
		// Consumer<String[]> list = Arrays::sort;
		// list.accept(names);
		// System.out.println(Arrays.toString(names));

		// Ignores case (Case insensitive)
		BiConsumer<String[], Collator> ls = Arrays::sort;
		ls.accept(names, Collator.getInstance());
		System.out.println(Arrays.toString(names));

	}

}
