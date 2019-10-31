package lab2.prob4;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Prob4 {

	public static List<Set> powerSet(List X) {
		List<Set> P = new ArrayList();
		Set S = new HashSet();
		P.add(S);
		while (!X.isEmpty()) {
			Object f = X.remove(0);
			List<Set> tempP = new ArrayList<Set>();
			tempP.addAll(P);
			for (Set x : tempP) {
				Set T = new HashSet();
				T.addAll(x);
				T.add(f);
				P.add(T);
			}
		}
		return P;
	}

	public static void main(String[] args) {
		List<Integer> testInts = new ArrayList<Integer>(Arrays.asList(1, 2, 3, 4, 5));
		System.out.println(powerSet(testInts));
	}
}
