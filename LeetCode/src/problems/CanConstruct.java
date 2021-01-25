package problems;

import java.util.HashMap;
import java.util.Map;

public class CanConstruct {

	public static void main(String[] args) {
		
		String ransomNote = "aa", magazine = "ab";
		
		Map<Character, Integer> map = new HashMap<>();
		
		for (char mag : magazine.toCharArray()) {
			
			Integer count = map.get(mag);
			
			if(count ==null)
				count =1;
			else
				count++;
			
			map.put(mag,count);
			
		}
		
		for (char ran : ransomNote.toCharArray()) {
			
			if(!map.containsKey(ran))
				System.out.println("False");
			
			else
				map.put(ran, map.get(ran)-1);
			
		}
		System.out.println("True");
		
		optimized(ransomNote,magazine);
		
	}

	private static void optimized(String ransomNote, String magazine) {

		int[] map = new int[128];
		for (char c : ransomNote.toCharArray()) {
			int index = magazine.indexOf(c, map[c]);
			if (index == -1) {
				System.out.println("False");
			}
			map[c] = index + 1;
		}
		System.out.println("True");

	}
}
