package streams;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.BiPredicate;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.stream.IntStream;

public class Test {

	public static void main(String[] args) {
		List<String> testlist = new ArrayList<>(Arrays.asList("Hello", "Hi","Welcome"));
		//
		testlist.forEach(System.out::println);
		
		//MyInterface mi = new IfaceImpl();
		
		MyInterface anyname = ()->System.out.println("I'm saying Hi");
		method1(anyname);
		MyPredicate<Integer> mp = t -> true;
		Predicate<String> pred = t -> t.length() > 4;
		Function<String, Integer> t1 = String::length;
//		Predicate<String> pred1 =   String::length > 4;
		System.out.println(pred.test("Hi")); //false
		BiPredicate<String, String> bip = String::equals;
		System.out.println(bip.test("Hi", "hi")); 
		TriPredicate<Integer, Integer, Integer> trip = (t, u, v) -> (t > u) && (u > v);
		System.out.println(trip.test(3,2,1)); 
		TriFunction<Integer, Integer, Integer, Integer> trif = (t,u,v)->
													IntStream.of(t,u,v).max().getAsInt();
			
	}
	
	interface MyInterface{
		boolean equals(Object obj); // equals is an object method
		void sayHi();
	}
//	static class IfaceImpl implements MyInterface{
//		public  void sayHi() {
//			System.out.println("I am saying hi");
//		}
//	}
	
	static void method1(MyInterface myiface) {
		myiface.sayHi();
	}
	
	interface MyPredicate<T>{
		boolean test(T t);
	}
	interface MyBiPredicate<T, U>{
		boolean test(T t, U u);
	}
	interface TriPredicate<T, U, V>{
		boolean test(T t, U u, V v);
	}
	interface TriFunction<T, U, V, R>{
		R apply(T t, U u, V v);
	}
}
