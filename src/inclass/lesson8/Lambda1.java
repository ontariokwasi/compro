package inclass.lesson8;

import java.util.Random;
import java.util.function.BiFunction;
import java.util.function.DoubleFunction;

public class Lambda1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BiFunction<Integer, Double, Double> exp = (x, y) -> 2*x + y;
		System.out.println(exp.apply(3, 4.5));
		DoubleFunction<Double> exp1 = (f) -> (f-32)*5/9;
		System.out.println(exp1.apply(60));
		
		RandomIface<Integer> rand = () -> new Random().nextInt(5); //lambda way
		RandomIface<Integer> r = new Random()::nextInt; //method reference
		System.out.println(r.apply());
		System.out.println(rand.apply());

	}

}
