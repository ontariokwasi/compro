package homework;

import java.util.Arrays;

public class RemoveDups {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String []duplicate = {"horse", "dog", "cat", "horse","dog"};
		String [] temp = new String [duplicate.length];
		int lastindex = 0;
		for(String elem : duplicate) {
			boolean exists = false;
			for(int i = 0; i < temp.length; i++) {
				if(elem.equals(temp[i])) {
					exists = true;
					break; //exit first loop if string is already in unique array
				}
			}
			if(!exists) {
				temp[lastindex] = elem; //push the string into the unique array
				lastindex++;
				//unique = new String [lastindex+1];
				
			}
		}
		//lets loop through again to remove the null and shrink the array size
		String [] unique = new String [lastindex];
		System.arraycopy(temp, 0, unique, 0, lastindex);
//		for(int i = 0; i < temp.length; i++) {
//			if(temp[i] == null)
//				break; //exit the loop at the first null encounter;
//			unique [i] = temp[i];
//		}
		
		//uncomment below to test the output
		System.out.println(Arrays.toString(unique));
		
		/***
		 * INPUT: {"horse", "dog", "cat", "horse","dog"}
		 * 
		 * OUTPUT: [horse, dog, cat]
		 * 
		 * */

	}

}
