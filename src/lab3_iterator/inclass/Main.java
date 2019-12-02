package lab3_iterator.inclass;

import java.util.function.Predicate;

public class Main {

	public static void main(String[] args) {
		MyVector mv = new MyVector();
		for(int i = 1; i <= 10; i++)
			mv.add(i);
		System.out.println(mv.doAll(new SumFunctor()));
		System.out.println(mv.doAll(new AverageFunctor()));
		
		//
		Predicate<Integer> pred = p -> p > 2;
		
		System.out.println(mv.extSelSum(pred));
		System.out.println(mv.extSelAverage(pred));
		//
		System.out.println(mv.doAll(new SumFunctor(), p -> p > 2)); //pass in predicate direct
		System.out.println(mv.doAll(new AverageFunctor(), pred)); // pass in stored pred
		

	}

}
