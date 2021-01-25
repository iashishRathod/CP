package problems;

import java.util.Arrays;

public class UniquePathsWithObstacles {

	public static void main(String[] args) {
		int[][] obstacleGrid = {
				{0,0,0},
				{0,1,0},
				{0,0,0}
		};
		System.out.println(uniquePathsWithObstacles(obstacleGrid));

	}

	private static int uniquePathsWithObstacles(int[][] obstacleGrid) {
		int m = obstacleGrid.length,n= obstacleGrid[0].length;
		int dp[][] = new int[m+1][n+1];
		for (int i = 0; i < m +1; i++) Arrays.fill(dp[i], -1);
		return paths(0,0,m,n,dp,obstacleGrid);
	}

	private static int paths(int i, int j, int m, int n, int[][] dp, int[][] obstacleGrid) {
		if(i == (m-1) && j == (n-1)) {
			if(obstacleGrid[i][j] == 0) return 1;
			else return 0;
		}
		if(i == m || j == n || obstacleGrid[i][j] == 1)return 0;
		if(dp[i][j]!=-1) return dp[i][j];
		return dp[i][j] = paths(i+1, j, m, n, dp,obstacleGrid) + paths(i, j+1, m, n, dp,obstacleGrid);
	}

}
