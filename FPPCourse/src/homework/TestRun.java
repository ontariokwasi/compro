package homework;

import java.util.Arrays;
import java.util.Scanner;
import java.util.StringJoiner;

import javax.swing.JOptionPane;

public class TestRun {
	public static void MergeTwoStrings(String str1, String str2) {
		// base case
		if (str1.length() == 1 && str2.length() == 1) {
			if (str1.compareTo(str2) < 0) {
				System.out.println(str1.substring(0) + str2.substring(0));
				return;
			} else {
				System.out.println(str2.substring(0) + str1.substring(0));
				return;
			}
		} // end_if
			// general case
		char[] arr1 = str1.toCharArray();
		char[] arr2 = str2.toCharArray();
		if (arr1[0] < arr2[0]) {
			System.out.print(String.valueOf(arr1[0]));
			MergeTwoStrings(str1.substring(1), str2);
		} else {
			System.out.print(String.valueOf(arr2[0]));
			MergeTwoStrings(str1, str2.substring(1));
		} // end_if
	}

	public static char minchar(String s, char x) {
		if (s.length() < 1)
			return (Character) null;
		if (s.length() == 1) {
			if (s.charAt(0) < x)
				return s.charAt(0);
			else
				return x;
		}
		if (s.charAt(0) < x)
			x = s.charAt(0);

		return minchar(s.substring(1), x);
	}

	public static void main(String[] args) {
		int[] test = { 1, 3, 4, 5, 7, 8 };
		// MergeTwoStrings("ace","abc");
		// System.out.println(minchar("gideon", 'g'));
		System.out.println(recursiveBinarySearch(test, 9));
		System.out.println(minCharacter("rtyuasf"));
		// System.out.println(merge(null, "ac"));
		// System.out.println(minChar("james", 0, 4));
		// System.out.println("check:" + "".charAt(0));
		System.out.println();
	}

	public static int binarySearch(int[] a, int first_pos, int last_pos, int key) {
		System.out.println("running...");
		if (last_pos >= first_pos) {
			int mid_pos = (first_pos + last_pos) / 2;
			// base case
			if (a[mid_pos] == key) {
				return mid_pos;
			}
			// general case
			if (a[mid_pos] > key)
				return binarySearch(a, first_pos, mid_pos - 1, key);
			else
				return binarySearch(a, mid_pos + 1, last_pos, key);
		} // end_if
		return -1;
	}

	public static String merge(String a, String b) {
		if (a == null || a.equals("")) {
			return a == null ? a : b;
		} else if (b == null || b.equals("")) {
			return a;
		} else if (a.charAt(0) < b.charAt(0)) {
			return a.charAt(0) + merge(a.substring(1), b);
		} else {
			return b.charAt(0) + merge(a, b.substring(1));
		}
	}

	public static char minChar(String str, int lowerIndex, int upperIndex) {
		char min;
		if (lowerIndex == upperIndex) {
			return str.charAt(lowerIndex);
		} else {
			min = minChar(str, lowerIndex + 1, upperIndex);
			if (str.charAt(lowerIndex) <= min) {
				return str.charAt(lowerIndex);
			}
		}
		return min;
	}

	private static int binSearch(int arr[], int lower, int upper, int target) {
		if (upper >= lower) {
			int mid = (lower + upper) / 2;
			if (arr[mid] == target)
				return mid;
			if (arr[mid] > target)
				return binSearch(arr, lower, mid - 1, target);
			else
				return binSearch(arr, mid + 1, upper, target);
		}
		return -1;
	}

	public static int binSearch(int arr[], int target) {
		int L = 0, U = arr.length - 1;
		if (arr[0] == target)
			return 0;
		if (arr[U] == target)
			return U;
		return binSearch(arr, L, U, target);
	}

	public static char minCharacter(String s) {
		char c = s.charAt(0);
		if (s == "" || s.length() == 0) {
			System.out.println("Empty Character ");
			System.exit(0);
		}
		if (s.length() == 1)
			return c;
		else {

			if (c < minCharacter(s.substring(1)))
				return c;
			else
				return minCharacter(s.substring(1));

		}

	}
	public static int recursiveBinarySearch(int[] Array , int key) {
		int low = 0;
		int high = Array.length - 1;
		return recursiveBinarySearch(Array, key , low, high);
	}
	
	public static int recursiveBinarySearch(int[] list, int key, int low, int high) {
		if (low > high)
			return low - 1;
		
		int mid = (low + high) / 2;
		if (key < list[mid])
			return recursiveBinarySearch(list , key , low , mid - 1);
		else if (key == list[mid])
			return mid;
		else
			return recursiveBinarySearch(list, key, mid + 1, high);
		
	}

}