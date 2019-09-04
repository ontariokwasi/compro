package homework;

import java.util.Scanner;

public class Prog4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Type a string: ");
		Scanner sc = new Scanner(System.in) ;
		String input = sc.nextLine();
		sc.close();
		String [] inputArr = input.split("");
		for(int i = inputArr.length-1; i >= 0; i-- ) {
			System.out.print(inputArr[i]);
		}
		//System.out.println(Arrays.toString(inputArr));

	}

}
