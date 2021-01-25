package problems;

public class LongestPalindromicSubsequence {

	public static void main(String[] args) {
		
		System.out.println(longestPalindromicSubsequence("abcde"));

	}

	private static int longestPalindromicSubsequence(String text1) {

		if(text1.length() == 0 ) return 0;
		
		String text2 = new StringBuilder(text1).reverse().toString();
		
		int[][] dp = new int[text1.length() + 1][text2.length() + 1];
		
		for(int row = 1 ; row < dp.length ; row++) {
			
			for(int col = 1 ; col < dp[0].length ; col++) {
				
				if(text1.charAt(row - 1) == text2.charAt(col - 1)) {
					dp[row][col] = dp[row - 1][col - 1] + 1; 
				}
				else {
					
					dp[row][col] = Math.max(dp[row][col - 1], dp[row - 1][col]);
				}
			}
		}
		
		return dp[text1.length()][text2.length()];
	
	}

}
