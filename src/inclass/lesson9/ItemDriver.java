package inclass.lesson9;

import java.util.function.BiFunction;

public class ItemDriver {

	public static void main(String[] args) {
		//imperative way
		
		
		//lambda way
		BiFunction<String, Double, Item> ob1 = (x,y) -> new Item(x, y);
		System.out.println(ob1.apply("Food", 20.1));
		
		//Method reference
		BiFunction<String, Double, Item> ob2 = Item::new;
		System.out.println(ob2.apply("Food", 20.1));

	}

}
