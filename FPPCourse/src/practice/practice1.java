package practice;

import java.text.MessageFormat;
import java.util.StringJoiner;

import com.sun.corba.se.impl.protocol.giopmsgheaders.Message;

public class practice1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/**
		 * Reference type strings practice
		 * Note: == used for comparing primitives, Reference/objects uses .equal
		 * .equal checks from pool memory but == checks from heap memory
		 * 
		 * ***/
		//substring
		String name = "Robert";
		System.out.println(name.substring(0,3));
		System.out.println(name.substring(0,name.length()));
		System.out.println(name.substring(0,1));
		System.out.println(name.substring(0,0)); 
		
		//IndexOf
		System.out.println(name.indexOf("t"));
		System.out.println(name.indexOf("bert"));
		
		//StringJoiner
		StringJoiner sj = new StringJoiner(":", "[", "]");
		sj.add("George").add("Sally").add("Fred");
		String desiredString = sj.toString();
		System.out.println(desiredString);
		
		//CompareTo
		System.out.println(desiredString.compareTo("[George:Sally:Fred]"));
		
		
		//string fromat
		System.out.printf("You owe me $%f \n", 195.50f);
		System.out.printf("You owe me $%.2f \n", 195.50f);
		System.out.printf("You owe me $%7.2f \n", 195.50f);
		
		String friend = "Bob";
		int age = 30;
		System.out.printf("Happy birthday %s. I can\'t believe you\'re %d.\n",friend,age);
		
		//message format
		String []myArr = {"Kwame","Good"};
		String fmat = "{0} is very {1}";
		System.out.println(MessageFormat.format(fmat, myArr));
		
		//split
		String ab = "Hello,strings can be fun. They have many uses.";
		String [] abs = ab.split(",| ");
		StringJoiner sjs = new StringJoiner(",","[","]");
		for(String item : abs)
			System.out.println(sjs.add(item));
		
	}

}
