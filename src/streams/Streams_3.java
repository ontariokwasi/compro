package streams;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.IntSummaryStatistics;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class Streams_3 {

	public static void main(String[] args) {
		List<String> strlist = new ArrayList<>(Arrays.asList("Reggie", "is", "trying", "best"));
		// Use reduce from the streams API give an output that looks like this-> Reggie
		// is trying best

		// with reduce
		String combined = strlist.parallelStream().reduce(" ", (x, y) -> x + y);
		System.out.println(combined);
		List<Integer> ints = new ArrayList<Integer>(Arrays.asList(2, 1, 4, 3));
		int sum = ints.stream().reduce((x, y) -> x - y).orElse(0);
		System.out.println(sum);

		// with joining
		String joining = strlist.parallelStream().collect(Collectors.joining("->"));
		System.out.println(joining);

		// collecting to Map ##Note that Map is an interface
//		Map<Integer, String> map = strlist.stream().collect(Collectors.toMap(String::length, Function.identity()));
		// in -> obj.print(in) == obj::print
		// in -> in.print(); == Integer::print
		IntSummaryStatistics summary = strlist.stream().collect(Collectors.summarizingInt(String::length));
		System.out.println("Min=>"+summary.getMin());
		System.out.println("Max=>"+summary.getMax());
		System.out.println("Average=>"+summary.getAverage());
		System.out.println("Sum=>"+summary.getSum());
		System.out.println("Count=>"+summary.getCount());
		
		int[] arr = {1,2,3};
		System.out.println(Stream.of(arr).collect(Collectors.toList()));
		System.out.println(Arrays.toString(IntStream.of(arr).toArray()));
		///
		Stream<String> s = strlist.stream();
		System.out.println(s.count());
		s.map(s1->s1.toUpperCase()).forEach(System.out::println);
	}

}
