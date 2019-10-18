package lab8.prob4;

import java.util.function.Supplier;

public class MathRefernce {

	public static void main(String[] args) {
		// i. using method reference
		Supplier<Double> rand = Math::random;
		System.out.println(rand.get());

		// ii. Using lambda
		Supplier<Double> rand1 = () -> Math.random();
		System.out.println(rand1.get());

	}

}
