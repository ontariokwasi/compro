package inclass.lesson10;

public class CountStringOccurrences {
	public static <T> int countOccurrences(T[] arr, T target) {
		int count = 0;
		if (target == null) {
			for (T item : arr) {
				if (item == null) {
					count++;
				}
			}
		} else {
			for (T item : arr) {
				if (target.equals(item)) {
					count++;
				}
			}
		}
		return count;
	}
	
	public static void main(String [] args) {
		Integer[] ints = new Integer[6];
		ints[0] = 4;
		System.out.println(countOccurrences(ints, null));
	}
}
