package inclass.lesson9;

import java.util.stream.IntStream;
import java.util.stream.Stream;

public class Stream9_1 {

	public static void main(String[] args) {
		Stream.iterate(1, x -> x+1)
		.filter(x->x%2==1)
		.limit(8)
		.skip(4)
		.forEach(System.out::println);

	}

}
