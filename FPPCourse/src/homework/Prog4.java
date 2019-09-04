package homework;

import java.util.Scanner;

public class Prog4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Type a string: ");
		Scanner sc = new Scanner(System.in) ;
		String input = sc.nextLine();
		sc.close();
		for(int i = input.length()-1; i >= 0; i-- ) {
			System.out.print(input.charAt(i));
		}
		
		
		//System.out.println(Arrays.toString(inputArr));
		
		/***
		 * Input: Hello world
		 * Output: dlrow olleH
		 * */
	}

}
