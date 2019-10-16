package inclass.lesson9;

import java.util.function.BiFunction;
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
		.filter(item -> item.getName().equals("Watch"))
		.forEach(System.out::println);

	}

}
