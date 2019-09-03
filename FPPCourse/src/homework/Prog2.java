package homework;

public class Prog2 {
	
	public static void main(String[] args) {
		//1.27, 3.881, 9.6
		float a = 1.27f;
		float b = 3.881f;
		float c = 9.6f;
		/**
		 * Output to the console the following two values:
			1. the sum of the floats as an integer, obtained by casting 
			the sum to type int
			2. the sum of the floats as an integer, obtained by rounding the sum to 
			the nearest integer, using the Math.round function
		 * ***/
		
		int sumint = (int) (a + b + c);
		int sumintround = Math.round((a + b + c));
		
		System.out.println(sumint);
		System.out.println(sumintround);
	}

}
