package problems;

import java.util.Arrays;

public class CalculateMinimumHP {
	
	public static void main(String[] args) {

		int[][] dungeon = {
						   {-2,-3,3},
						   {-5,-10,1},
						   {10,30,-5}
						  };
		
		System.out.print(calculateMinimumHP(dungeon));
		
		
	}

	private static int calculateMinimumHP(int[][] dungeon) {
		
		int dp[][] = new int[dungeon.length+1][dungeon[0].length+1];
		for (int i = 0; i < dungeon.length+1; i++) Arrays.fill(dp[i], -1);

		return calculate(0,0,dungeon,dp);
		
	}

	private static int calculate(int i, int j, int[][] dungeon, int[][] dp) {
		
		if(dp[i][j] != -1) return dp[i][j];
		if(i == dungeon.length-1 && j == dungeon[0].length-1) return dungeon[i][j] > 0 ? 1: Math.abs(dungeon[i][j]) +1;
		if(i == dungeon.length || j == dungeon[0].length ) return Integer.MAX_VALUE; 
		
		return dp[i][j] = Math.max(1, Math.min(calculate(i+1, j, dungeon, dp), calculate(i, j+1, dungeon, dp)) - dungeon[i][j]);
			
	}

}
