package lab9.prob5;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Section {
	public static Stream<String> streamSection(Stream<String> stream, int m, int n) {
		//The assumption is: 0 <= m <= n so no cheking//
		Stream<String> section = stream.skip(m).limit(n-m+1);
		return section;
	}

	public static void main(String[] args) {
		// Make three calls for the streamSection() method with different inputs
		// use nextStream() method to supply the Stream input as a first argument in
		// streamSection() method
		List<String> list1 = streamSection(nextStream(), 0, 8).collect(Collectors.toList());
		List<String> list2 = streamSection(nextStream(), 3, 6).collect(Collectors.toList());
		List<String> list3 = streamSection(nextStream(), 4, 8).collect(Collectors.toList());
		//
		System.out.println(list1+"\n"+list2+"\n"+list3);
	}

//support method for the main method -- for testing
	private static Stream<String> nextStream() {
		return Arrays.asList("aaa", "bbb", "ccc", "ddd", "eee", "fff", "ggg", "hhh", "iii").stream();
	}
}