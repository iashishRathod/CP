package problems;

import java.util.ArrayList;
import java.util.List;

public class FindAnagrams {

	public static void main(String[] args) {
		
		String s = "abab",p="ab";
		List<Integer> result = findAnagrams(s,p);
		
		for (Integer i : result)
			System.out.println(i);
	}

	private static List<Integer> findAnagrams(String s, String p) {
		
		List<Integer> result = new ArrayList<>();
		
		if(s.length() == 0) return result;
		
		int[] char_counts = new int[26];
		
		for(char chara :p.toCharArray())
			char_counts[chara - 'a']++;
		
		int left = 0,right = 0,count = p.length();
		
		while(right < s.length()){
			
			if(char_counts[s.charAt(right++) - 'a']-- >=1) count--;
			
			if(count == 0) result.add(left);
			
			if(right - left == p.length() && char_counts[s.charAt(left++) - 'a']++ >=0) count++;
		}
		
		return result;
	}
}
