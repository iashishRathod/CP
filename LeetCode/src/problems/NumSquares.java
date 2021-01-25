package problems;

import java.util.Arrays;

public class NumSquares {

	public static void main(String[] args) {
		
		int n = 13;
		System.out.print(numSquares(n));
	}

	private static int numSquares(int n) {
		int dp[] = new int[n+1];
		Arrays.fill(dp, -1);
		return f(n,dp);
	}

	private static int f(int n, int[] dp) {
		if(dp[n] != -1) return dp[n];
		if(n==0) return 0;
		int min = Integer.MAX_VALUE;
		for (int i = 1; i*i <=n; i++) {
			int curr = 1 + f(n-i*i, dp);
			min = Math.min(min, curr);
		}
		return dp[n] = min;
	}

}
