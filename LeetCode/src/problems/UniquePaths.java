package problems;

import java.util.Arrays;

public class UniquePaths {

	public static void main(String[] args) {
		
		int m = 7,n=3;
		
		System.out.print(uniquePaths(m,n));

	}

	private static int uniquePaths(int m, int n) {
		int dp[][] = new int[m+1][n+1];
		for (int i = 0; i < m +1; i++) Arrays.fill(dp[i], -1);
		return paths(0,0,m,n,dp);
	}

	private static int paths(int i, int j, int m, int n, int[][] dp) {
		if(i == (m-1) && j == (n-1))return 1;
		if(i == m || j ==n)return 0;
		if(dp[i][j]!=-1) return dp[i][j];
		return dp[i][j] = paths(i+1, j, m, n, dp) + paths(i, j+1, m, n, dp);
	}

}
