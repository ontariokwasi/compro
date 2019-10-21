package lab9.prob4;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class PrintSquares {

	public static void main(String[] args) {
		printSquares(4);

	}
	
	public static void printSquares(int num) {
		List<Integer> squares = Stream.iterate(1, x -> (x+1)).limit(num).map(x -> x*x).collect(Collectors.toList());
		System.out.println(squares);
	}

}
