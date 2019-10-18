package lab8.prob4;

import java.util.function.Supplier;

public class PrintRandomFromInner {
	
	class RandomSupplier implements Supplier<Double>{

		@Override
		public Double get() {
			
			return Math.random();
		}
		
	}

	public static void main(String[] args) {
		System.out.println(new PrintRandomFromInner().new RandomSupplier().get());

	}

}
