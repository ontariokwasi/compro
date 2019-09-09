package homework3;

import java.util.Arrays;

public class Problem3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int testarr [] ={1,2,3,4,5};
		System.out.println(search(testarr,5));

	}

	private static int binsearch(int []domain, int findnumber, int start, int end) {
		Arrays.parallelSort(domain); //just to ensure the input array is always sorted
		int mid = (start+end)/2;
		if(domain[mid] == findnumber)
			return mid; //found a match at mid;
		if(start >= end)
			return -1; //no match found
		
		if(domain[mid] > findnumber)
			end = mid -1;
		else if(domain[mid] < findnumber)
			start = mid +1;
		
		return binsearch(domain, findnumber, start, end);
	}
	static int search(int []domain, int searchnumber) {
		return binsearch(domain, searchnumber, 0, domain.length-1);
	}
}
