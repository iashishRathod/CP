package problems;

import java.util.Arrays;

public class MaxScore {

	public static void main(String[] args) {
		
		System.out.println(maxScore(new int [] {1,2,3,4,5,6,1},3));
		System.out.println(optimized(new int [] {1,2,3,4,5,6,1},3)); // O(n)

	}
	
	private static int optimized(int[] cardPoints, int k) {
		
		int length;
		
		if((length = cardPoints.length) == 0 || k == 0) return 0;
		
		if(length == k) {
			int sum = 0;
			for(int i = 0 ; i < length ; i++) sum += cardPoints[i];
			return sum;
		}
		
		int sum[] = new int[length + 1];
		int max = 0;
		
		for(int i = 0; i < length ; i++) sum[i + 1] = sum[i] + cardPoints[i];
		
		int total = sum[length];
		
		for(int i = 0 ; i <= k ; i++) {
			
			max = Math.max(max, total + sum[i] - sum[length - k + i]);
		}
		return max;
	}

	static int dp[][] ;

	private static int maxScore(int[] cardPoints, int k) {
		
		int length;
		
		if((length = cardPoints.length) == 0 || k == 0) return 0;
		
		if(length == k) {
			int sum = 0;
			for(int i = 0 ; i < length ; i++) sum += cardPoints[i];
			return sum;
		}
		
		dp = new int[length][length];
		
		for (int[] i : dp) {
			Arrays.fill(i , -1);
		}
		
		return helper(cardPoints,0,length-1,k);
	}

	private static int helper(int[] cardPoints, int start, int end, int k) {
		
		if( k == 0 || start > end ) return 0;
		
		if(dp[start][end] != -1) return dp[start][end];
		
		int first = cardPoints[start] + helper(cardPoints,start+1, end, k-1);
        int second = cardPoints[end] + helper(cardPoints,start, end-1, k-1);
        
        dp[start][end] =  Math.max(first, second);
		
		return dp[start][end];
		
	}

}
