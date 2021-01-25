package problems;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class FindRepeatedDnaSequences {

	public static void main(String[] args) {
		
		System.out.println(findRepeatedDnaSequences("AAAAACCCCCAAAAACCCCCCAAAAAGGGTTT"));
	}

	private static List<String> findRepeatedDnaSequences(String s) {
		Set<String> seen = new HashSet<>() , repeted = new HashSet<>();
		for (int i = 0; i + 9 < s.length(); i++) {
			if(!seen.add(s.substring(i,i+10))) repeted.add(s.substring(i,i+10));
		}
		return new ArrayList<>(repeted);
	}

}
