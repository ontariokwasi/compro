package homework12.problem1;

import java.util.InputMismatchException;
import java.util.Scanner;

public class APIException {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter mark in the range of 0 to 100 : ");
		try {
			int mark = sc.nextInt();
			if (mark < 0 || mark > 100)
				throw new InputMismatchException();
			System.out.println("Recorded successfully!");
		} catch (InputMismatchException ex) {
			System.out.println("Invalid Input, enter number in the range of 0 to 100");
		} finally {
			 sc.close();
		}
	}

}
