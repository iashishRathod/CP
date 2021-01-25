package problems;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class CloseStrings {
	
	public static void main(String[] args) {
		
		System.out.println(closeStrings("abbbzcf","babzzcz"));
	}

	private static boolean closeStrings(String word1, String word2) {
        
        if(word1.length() != word2.length()) return false;
        
        Set<Character> set1 = new HashSet<>();
        Set<Character> set2 = new HashSet<>();
        
        int[] char1 = new int[26];
        int[] char2 = new int[26];
        
        int i ;
        for(i = 0 ; i < word1.length(); i++){
        	set1.add(word1.charAt(i));
        	char1[word1.charAt(i) - 'a']++;
        }
        
        for(i = 0 ; i < word2.length(); i++){
        	set2.add(word2.charAt(i));
        	char2[word2.charAt(i) - 'a']++;
        }
        
        
        Arrays.sort(char1); Arrays.sort(char2);
        
        
        return set1.equals(set2) && Arrays.equals(char1, char2);
    }

}
