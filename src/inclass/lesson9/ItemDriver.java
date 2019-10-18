package inclass.lesson9;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.BiFunction;
import java.util.function.BinaryOperator;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class ItemDriver {

	public static void main(String[] args) {
		//imperative way
		
		
		//lambda way
		BiFunction<String, Double, Item> ob1 = (x,y) -> new Item(x, y);
		System.out.println(ob1.apply("Food", 20.1));
		
		//Method reference
		BiFunction<String, Double, Item> ob2 = Item::new;
		Item item1 = ob2.apply("Watch", 10.1);
		Item item2 = ob2.apply("Laptop", 1000.99);
		Item item3 = ob2.apply("phone", 100.99);
		
		Stream.of(item1, item2, item3)
		.filter(new Item("Watch", 4.0)::equals)
		.map(Item::getAmount)
		.forEach(System.out::println);
		
		
		//Return names that starts with J
		//Predicate<String> isEqual = new String("Watch")::equals;
		List <String> list = Stream.of("Andy", "Joe", "Jane", "Gideon", "John","Prince")
				.filter(name ->name.startsWith("J"))
				.collect(Collectors.toList());
		
		List<Double> totalPrice = Stream.of(item1, item2, item3)
				.map(Item :: getAmount)
				.collect(Collectors.toList());
		System.out.println(totalPrice);
		System.out.println(creatitem().getAmount());
		
		Function<Integer, Integer> x = (a) -> a*a;
		System.out.println(x.apply(3));
		
		//
		BiFunction<Double, Double, List<Double>> li = (a,b) -> new ArrayList(Arrays.asList(a+b, a*b));
	}
	static Item creatitem() {
		return new Item("name",1.0);
	}

}
