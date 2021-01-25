package problems;

import java.util.HashSet;
import java.util.Set;

public class CountConsistentStrings {

	public static void main(String[] args) {
		
		System.out.println(countConsistentStrings("ab", new String [] {"ad","bd","aaab","baa","badab"}));

	}

	private static int countConsistentStrings(String allowed, String[] words) {
		
		int count = 0;
		
		Set<Character> set = new HashSet<>();
		
		for(char c : allowed.toCharArray()) set.add(c);
		
		for(String s : words) {
			
			boolean found = true;
			
			for(int index = 0 ; index < s.length() ; index++) {
				
				if(!set.contains(s.charAt(index))) {
					found = false;
					break;
				}
				
			}
			
			if(found) count++;
		}
		
		return count ;
	}

}
