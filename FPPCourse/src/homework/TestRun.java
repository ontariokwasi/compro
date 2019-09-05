package homework;

import java.util.Arrays;
import java.util.Scanner;
import java.util.StringJoiner;

public class TestRun {
	public static void main(String[] args) { int count=0;
	for(int i=0; i<args.length;i++) {
	System.out.println("The length of '"+args[i]+"' is:"+args[i].length());
	if(args[i].charAt(0)=='A') {
		count++;
	}
	}
	System.out.println("The number of elements of args starting with 'A'="+count);
	}
	}