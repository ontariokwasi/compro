package homework;

public class Prog7 {
	public static void main(String[] args) {
		
		int count = 0;
		for(String elem : args) {
			System.out.printf("The length of %s is %d \n", elem, elem.length());
			if(elem.startsWith("A"))
				count++;
		}
		System.out.println(count + " input strings starts with 'A' ");
	}
}
