package homework;

public class Prog1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int x = RandomNumbers.getRandomInt(1, 9); //gen random number x
		int y = RandomNumbers.getRandomInt(3, 14);// gen random number y
		System.out.println(Math.pow(Math.PI, x));
		System.out.println(Math.pow(y,Math.PI));
		
		/**
		 * Outputs are random, sample below:
		 * 29809.0993334462
		 * 156.99254530886589
		 **/
		System.out.println(greetings.Hello);
	}
	enum greetings{
		Hello, Hi, Howdy
	}

}
