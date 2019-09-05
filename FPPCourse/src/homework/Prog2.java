package homework;

public class Prog2 {
	
	public static void main(String[] args) {
		//1.27, 3.881, 9.6
		float a = 1.27f;
		float b = 3.881f;
		float c = 9.6f;
		int sumint = (int) (a + b + c);
		int sumintround =(int) Math.round((a + b + c));
		
		System.out.println(sumint);
		System.out.println(sumintround);
		/**
		 * Output: 
		 * 14
		 * 15
		 * */
	}

}
