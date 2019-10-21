package inclass.lesson9;

import java.util.function.Function;
import java.util.function.Predicate;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class Stream9_1 {

	public static void main(String[] args) {
		Stream.iterate(1, x -> x+1)
		.filter(x->x%2==1)
		.limit(8)
		.skip(4)
		.forEach(System.out::println);
		
		Predicate<String>se = x -> x.startsWith("J");
		long c = Stream.of("Sam","Jane", "John","James")
		.filter(new Stream9_1()::startswith)
		.count();
		
		System.out.println(c);
		
		//Function<Integer, Integer> f = n -> n++;
		Stream.iterate(1, n -> n+1).limit(5).forEach(System.out::println);
	}
	
	public  boolean startswith(String word){
		Predicate<String> p = x -> x.startsWith("J");
		return p.test(word);
	}

}
