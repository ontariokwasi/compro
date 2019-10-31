package lab2.prob2;

import java.util.Arrays;

public class Prob2C {
	public static int[] merge(int[] arr1, int[] arr2) {
		int lenAB = arr1.length + arr2.length;
		int indexA = 0; int indexB = 0;
		int[] c = new int[lenAB];
		for(int i = 0; i < lenAB; i++) {
			if(indexA < arr1.length && indexB < arr2.length) {
				if(arr1[indexA] < arr2[indexB]) {
					c[i] = arr1[indexA];
					indexA++;
				}
				else {
					c[i] = arr2[indexB];
					indexB++;
				}
			}
			else {
				if(indexA >= arr1.length) {
					c[i] = arr2[indexB];
					indexB++;
				}
				else {
					c[i] = arr1[indexA];
					indexA++;
				}
			}
		}
		return c;
	}

	public static void main(String[] args) {
		//[1, 4, 5, 8, 17], [2, 4, 8, 11, 13, 21, 23, 25]
		int [] A = {1, 4, 5, 8, 17};
		int [] B = {2, 4, 8, 11, 13, 21, 23, 25};
		System.out.println(Arrays.toString(merge(A, B)));
	}
}
