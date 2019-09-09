package homework;

import java.util.Arrays;
import java.util.Scanner;
import java.util.StringJoiner;

import javax.swing.JOptionPane;

public class TestRun {
	public static String[] RemoveDups(String[] str) {
		int dup = 0;
		for (int i = 0; i < str.length; i++)
			for (int j = i + 1; j < str.length; j++) {
				if (str[i] == str[j]) {
					dup++;
					System.out.println(dup + " strlen:" + str.length + " Ivalue:" + i);
				}
			}

		String[] result = new String[str.length - dup + 1];
		System.out.println(result.length);
		int count = 0, index = 0;
		for (int i = 0; i < str.length; i++) {
			count = 0;
			for (int j = 0; j < result.length; j++) {
				if (str[i].equals(result[j])) {
					count++;
				}
			}
			if (count == 0) {
				result[index] = str[i];
				index++;
			}
		}
		return result;
	}

	public static void main(String[] args) {
		String[] str = {"cat","cat","single"}; int dup =0;
		for(int i=0; i<str.length;i++){
		for(int j=i+1; j<str.length;j++){ if(str[i]==str[j]) {
		} }
		dup++;
		break; }
		String[] noDup = new String[str.length-dup]; int k=0;
		for(int i=0; i<str.length;i++){
		dup=0;
		for(int j=i+1; j<str.length;j++){
			if(str[i]==str[j]) dup++;
		} if(dup==0) {
		noDup[k]=str[i];
		k++; }
		} System.out.println(Arrays.toString(noDup));
		
		double a = 0.7, b =3.2, c = 0.9, e = a;
		System.out.println(a+0.1==c-0.1);
		String gh = new String("Ghana");
		String ghs = new String("Ghana");
		System.out.println((float)b/0);
		System.out.println(gh.indexOf("ha"));
		System.out.println(gh.equals(ghs));
		//String input = JOptionPane.showInputDialog("Typeyour name");
		
		
	}
}