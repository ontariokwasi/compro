package lab9.prob2;

import java.util.IntSummaryStatistics;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class MyIntStream {
	
	public static void main(String[] args) {
		Stream<Integer> myIntStream = Stream.of(3,4,2,5,10,12,16,1);
		IntSummaryStatistics summary = myIntStream.collect(Collectors.summarizingInt(e -> (int)e));
		int min = summary.getMin();
		int max = summary.getMax();
		System.out.println("Min: "+min+"\nMax: "+max);
	}
}
