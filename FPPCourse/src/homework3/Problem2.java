package homework3;

public class Problem2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(minChar("TEACHER"));
	}
	static String minChar(String word) {
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

}
