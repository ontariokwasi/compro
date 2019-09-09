/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author HP
 */
public class MergeStrings {
	StringBuilder ret = new StringBuilder();
	String merge(String s, String t) {	
		if(s.isEmpty() && t.isEmpty()) return ret.toString();
		if(s.isEmpty()) {
			ret.append(t);
			return ret.toString();
		}
		if(t.isEmpty()) {
			ret.append(s);
			return ret.toString();
		}
		if(s.charAt(0) <= t.charAt(0)) {
			ret.append(s.charAt(0));
                           System.out.print(s.substring(1));
			
			return merge(s.substring(1), t);
		} else {
			ret.append(t.charAt(0));
                        System.out.print(t.substring(1));
			return merge(s, t.substring(1));
		}
		
	}
	public static void main(String[] args) {
		MergeStrings ms = new MergeStrings();
		System.out.println(ms.merge("a", "bd"));
	}
}

