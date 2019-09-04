package homework;

public class Prog5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String outstring="", topstring="", downstring="", line = "";
		  for (int i=0; i< 8; i++) {
			  
			  topstring += String.format("%4d\t\t",RandomNumbers.getRandomInt(1, 9));
			  downstring += String.format("+%3d\t\t", RandomNumbers.getRandomInt(1, 99));
			  line += "_____\t\t";
			  
			  if(i == 3 || i == 7) {
				outstring += topstring+"\n"+downstring+"\n"+line+"\n\n\n";
				  topstring = ""; 
				  downstring = "";
				  line = "";
			  }
			  
			  }
		  System.out.println(outstring);	 		
	}

}
