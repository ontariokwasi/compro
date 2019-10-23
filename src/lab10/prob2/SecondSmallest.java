package lab10.prob2;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class SecondSmallest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Integer> list1 = Arrays.asList(3,2,4,5,10,1);
		System.out.println(secondSmallest(list1));

	}
	
	public static <T extends Comparable<? super T>> T secondSmallest(List<T> inputList){
		Collections.sort(inputList, T::compareTo);
		return inputList.get(1);
	}
}
