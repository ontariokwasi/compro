package lab9.prob3;

import java.util.Arrays;
import java.util.List;

public class CountWords {

	public static void main(String[] args) {
		List<String> list = Arrays.asList("dan","come","Joy","dunc","chat","cust");
		System.out.println(countWords(list, 'c', 'd', 4));

	}

	public static int countWords(List<String> words, char c, char d, int len) {
		return (int) words.stream()
				.filter(w ->w.contains(c+"") && !w.contains(d+"") && w.length() == len)
				.count();
	}
}
