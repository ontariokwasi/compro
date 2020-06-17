package streams;

import java.util.ArrayList;
import java.util.List;

public class Generics_1 {

	public static void main(String[] args) {
		List<String> myList = new ArrayList<>();
		myList.add("Hello");
//		myList.add(1.1);
//		myList.add(new int[] {1,3});
		String s = myList.get(0);
		s.length();

		// subtyping not covariant
		Number n = 1.8;
		Integer i = 3;
		n = i;
		List<Number> nums = new ArrayList<Number>();
		
		List<Integer> ints = new ArrayList<Integer>();
		ints.add(1);
		ints.add(2);
		//nums = ints; // covariant number 1
		nums.add(10.4f);
		nums.add(3.9);
		
		Number[] numArray = new Number[1];
		Integer[] intArray = new Integer[1];
		numArray = intArray;
		
		//generic method
		System.out.println(make("hello"));
		System.out.println(make(2));
		System.out.println(make(2L));
	}
	
	static <T> T make(T t) {
		
		return t;
	}

	interface GenericInterface<T> {
		T apply();
	}

	class GenericClass<Y, U, R> implements GenericInterface<R> {

		@Override
		public R apply() {
			U u = null;
			return null;
		}

	}
	interface testI{
		default void method() {
			System.out.println("hello Iface");
		}
	}
	interface test2I{
		default void method() {
			System.out.println("hello Iface");
		}
	}
	class Testclass implements test2I, testI{

		@Override
		public void method() {
			// TODO Auto-generated method stub
			test2I.super.method();
			testI.super.method();
			
		}
		
	}
	
}
