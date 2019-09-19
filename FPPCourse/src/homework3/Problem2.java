package homework3;

public class Problem2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(minChar("TEACHER"));
	}
	static char minChar(String word) {
		if(word.length() < 1) return (Character) ' ';
		return minchar(word, word.charAt(0));
			
	}
	private static char minchar(String s, char x) {
		if(s.length() < 1) return (Character) null;
		if(s.length() == 1) {
			if(s.charAt(0) < x) return s.charAt(0);
			else return x;
		}
		if(s.charAt(0) < x) x = s.charAt(0);
		
		return minchar(s.substring(1), x);
	}
	
	/** Another solution with replace*/
	/*
	 * static String minChar(String word) {
		if(word.length() <= 0)
			return "";
		else if(word.length() == 1)
			return word;
		String firstchar = word.substring(0,1);
		String nextchar = word.substring(1,2);
		int compare = firstchar.compareTo(nextchar);
		if(compare < 0)
			//remove all occurrences of nextchar;
			word = word.replace(nextchar, "");
		else if(compare > 0)
				//remove all occurrences of firstchar
				word = word.replace(firstchar, "");
		else
			//replace first occurrence of the character since they are the same
			word = word.replaceFirst(firstchar, "");
		return minChar(word);
			
	}
	 * */

}
