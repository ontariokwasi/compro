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
		
		/**
		 * INPUT: Gideon Akomeng Asante Danso Francis Duncan Amos
		 *  
		 * OUTPUT: 
		 * 	The length of Gideon is 6 
			The length of Akomeng is 7 
			The length of Asante is 6 
			The length of Danso is 5 
			The length of Francis is 7 
			The length of Duncan is 6 
			The length of Amos is 4 
			3 input strings starts with 'A' 

		 * */
	}
}
