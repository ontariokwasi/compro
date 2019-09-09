package homework3;

public class Problem4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(ispalindrome("tikkit"));
		/**
		 * prints true if the given string is a palindrome
		 * else false
		 * */

	}
	private static boolean ispalindrome(String checkstring, int first, int last) {
		if(first >= last)
			return true;
		else if(checkstring.length() < 1)
			return false;
		if(checkstring.charAt(first) != checkstring.charAt(last))
			return false;
		return ispalindrome(checkstring, ++first, --last);
	}

	static boolean ispalindrome(String checkstring) {
		return ispalindrome(checkstring, 0, checkstring.length()-1);
	}
}
