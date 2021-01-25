package problems;

import java.util.Arrays;
import java.util.List;

public class WordBreak {

	public static void main(String[] args) {
		
		System.out.println(wordBreak("leetcode",new String[] {"leet", "code"}));

	}

	private static boolean wordBreak(String s, String[] wordDict ) {
		
		 List<String> list = Arrays.asList(wordDict);
		boolean dp[] = new boolean[s.length() +1];
		dp[0] = true;
		
		for (int len = 1; len <= s.length(); len++) {
			
			for (int i = 0; i < len; i++) {
				
				if(dp[i] && list.contains(s.substring(i, len))) {
					dp[len] = true;
					break;
				}
			}
		}
		return dp[s.length()];
	}

}
