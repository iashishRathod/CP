package problems;

public class LongestPalindrome {

	public static void main(String[] args) {
		
		System.out.println(longestPalindrome("cbbd"));
		/*
		 * time - O(n2)
		 * space = O(1)
		 */

	}

	public static String longestPalindrome(String s) {
		
		if(s.length() == 1) return s;
		
		int start = 0 , end = 0 , len  = 0;
		
		for(int index = 0 ; index < s.length() ; index++ ) {
			
			len = Math.max(helper(s,index,index), helper(s,index,index + 1));
			
			if(len > end - start) {
				start = index - (len - 1)/2;
				end  = index + (len)/2;
			}
		}
		
		return s.substring(start, end + 1);
		
		
	}

	private static int helper(String s, int j, int k) {
		
		while(j >= 0 && k < s.length() && s.charAt(j) == s.charAt(k)) {
			j--;
			k++;
		}
		
		return k - j - 1;
	}


}
