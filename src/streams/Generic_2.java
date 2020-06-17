package streams;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class Generic_2 {

	static class Node<T> {
		private Node<T> next;
		private Node<T> prev;
		private T value;

		public Node(T value) {

			this.value = value;
		}

		public Node<T> getNext() {
			return next;
		}

		public void setNext(Node<T> next) {
			this.next = next;
		}

		public Node<T> getPrev() {
			return prev;
		}

		public void setPrev(Node<T> prev) {
			this.prev = prev;
		}

		public T getValue() {
			return value;
		}

		public void setValue(T value) {
			this.value = value;
		}

	}

	static <T extends Comparable<T>> T largest(T[] arr) {
		
		return Stream.of(arr).max(T::compareTo).orElse(null);

	}

	static <T extends Comparable<? super T>> T largest(List<T> list) {
		return list.stream().max((a, b) -> a.compareTo(b)).orElse(null);

	}

	public static void main(String[] args) {
		Node<Integer> n = new Node<>(2);
		Node<String> s = new Node<>("String");
		Integer[] ints = { 2, 3, 1, 5 };
		Double[] doubles = { 2.0, 3.1, 1.1, 5.1 };
		Sub sub1 = new Sub<String>();
		Sub sub2 = new Sub<String>();
		Sub[] subs = { sub1, sub2 };
		List<Sub> sublist = new ArrayList<>(Arrays.asList(subs));
		System.out.println(largest(ints));
		System.out.println(largest(doubles));
		System.out.println(largest(subs));
		List<LocalDate> dates = new ArrayList<>(Arrays.asList(LocalDate.now(), LocalDate.now().minusDays(1)));
		// System.out.println(largest(dates)); // fix the method to work for this

		// Extends wildcard <? extends ...> Bounded
		List<? extends Number> nums1 = new ArrayList<Number>();
		List<Integer> ints1 = new ArrayList<Integer>();
		nums1 = ints1;
		nums1.get(0);
		// nums1.addAll(ints1); // cannot do addAll or add

		// Super wildcards <? super ...> Bounded
		List<Number> nums2 = new ArrayList<Number>();
		List<? super Integer> ints2 = new ArrayList<Integer>();
		ints2 = nums2;
		ints2 = ints1;
		nums1 = ints1;
		ints2.add(1);
		ints2.get(0); // get is possible but will return Object types
		// you can't add because it is bounded to Integer and super types of Integer
//		ints2.add(1.1); 
//		ints2.add("String"); 
		

		// see difference
		// you can add anything because it is of raw type just like an Object type
		List ints3 = new ArrayList();
		ints3.add(1);
		ints3.add(1.1);
		ints3.add("String"); 

	}

	static class SuperSuper<T> implements Comparable<T> {

		@Override
		public int compareTo(T o) {
			// TODO Auto-generated method stub
			return 0;
		}

	}

	static class Super<T> extends SuperSuper<T> {

	}

	static class Sub<T> extends SuperSuper<T> {

	}

}
