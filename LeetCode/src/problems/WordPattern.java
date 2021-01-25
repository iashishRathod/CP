package problems;

import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

public class WordPattern {

	public static void main(String[] args) {
		
		System.out.println(wordPattern("abba","dog dog dog dog"));

	}

	private static boolean wordPattern(String pattern, String str) {
		
		String[] words = str.split(" ");
		
		Map<Object, Object> map = new HashMap<>();
		
		if(pattern.length() != words.length) return false;
		
		for (int i = 0; i < words.length; i++) {
			if(!Objects.equals(map.put(words[i], i), map.put(pattern.charAt(i), i))) return false;
		}
		
		return true;
	}

}
