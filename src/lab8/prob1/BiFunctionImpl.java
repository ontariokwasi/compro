package lab8.prob1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.BiFunction;

public class BiFunctionImpl {
	/*
	 * (x,y) -> { List<Double> list = new ArrayList<>(); list.add(Math.pow(x,y));
	 * list.add(x * y); return list; };
	 **/
	public static void main(String[] args) {
		BiFunction<Double, Double, List<Double>> list = (x,
				y) -> new ArrayList<Double>(Arrays.asList(Math.pow(x, y), x * y));
				System.out.println(list.apply(2.0, 3.0));
	}
}
