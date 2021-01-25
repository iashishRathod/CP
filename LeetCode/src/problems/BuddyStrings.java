package problems;

import java.util.HashSet;
import java.util.Set;

public class BuddyStrings {

	public static void main(String[] args) {
		
		System.out.println(buddyStrings("ab","ba"));

	}

	private static boolean buddyStrings(String a, String b) {
		
		if(a.length() != b.length()) return false;
		
		if(a.equals(b)) {
			Set<Character> set = new HashSet<>();
			for (Character c : a.toCharArray()) {
				if(!set.add(c)) return true;
			}
			return false;
		}
		else {
			
			int first = -1,second = -1;
			for (int i = 0; i < a.length() ; i++) {
				if(a.charAt(i) != b.charAt(i)) {
					if(first == -1) first = i;
					else if(second == -1) second = i;
					else return false;
				}
			}
			
			return second != -1 && a.charAt(first) == b.charAt(second) && b.charAt(first) == a.charAt(second);
			
		}
	}

}
