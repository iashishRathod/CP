package problems;

public class CherryPickup2 {

	public static void main(String[] args) {

		System.out.println(cherryPickup(new int[][] {
			{3,1,1},
			{2,5,1},
			{1,5,5},
			{2,1,1}
		}));
	}

	private static int cherryPickup(int[][] grid) {
		
		int n = grid.length;
		int m = grid[0].length;
		
		Integer[][][] dp = new Integer[n][m][m];
		
		return helper(grid, n, m, 0, 0, m-1, dp);
	}

	private static int helper(int[][] grid, int n, int m, int r, int col1, int col2, Integer[][][] dp) {
		
		if(r < 0 || r >= n || col1 < 0 || col1 >= m || col2 < 0 || col2 >= m) return 0;
		
		if(dp[r][col1][col2] != null) return dp[r][col1][col2];
		
		int max = 0;
		
		for(int i = -1 ; i < 2 ; i++) {
			for(int j = -1 ; j < 2 ; j++) {
				max = Math.max(max, helper(grid, n, m, r + 1, col1 + i, col2 + j, dp));
			}
		}
		
		dp[r][col1][col2] = (col1 == col2 ? grid[r][col1] : grid[r][col1] + grid[r][col2]) + max;
		
		return dp[r][col1][col2];
	}

}
