package problems;

public class LongestIncreasingPath {

	public static void main(String[] args) {
		
		System.out.println(longestIncreasingPath(new int[][] {
			{9,9,4},
			{6,6,8},
			{2,1,1}
		}));

	}
	
	private static int longestIncreasingPath(int[][] matrix) {

		if(matrix.length == 0 ) return 0;

		int gMax = 0;
		Integer[][] max = new Integer[matrix.length][matrix[0].length];
		for(int row = 0 ; row < matrix.length ; row++) {

			for(int col = 0 ; col < matrix[row].length ; col++) {
				dfs(matrix , row , col , max);
				gMax = Math.max(gMax, max[row][col]);
			}
		}

		return gMax;
	}

	private static int dfs(int[][] matrix, int row, int col, Integer[][] max) {
		
		if(max[row][col] != null) return max[row][col];

		int maxv = 0;
		int target = matrix[row][col];

		if(row - 1 >= 0 && target < matrix[row -1][col]) {
			dfs(matrix, row - 1, col, max);
			maxv = Math.max(max[row - 1][col], maxv);
		}
		if(row + 1 < matrix.length && target < matrix[row + 1][col]) {
			dfs(matrix, row + 1, col, max);
			maxv = Math.max(max[row + 1][col], maxv);
		}
		if(col - 1 >= 0 && target < matrix[row][col - 1]) {
			dfs(matrix, row, col - 1, max);
			maxv = Math.max(max[row][col - 1], maxv);
		}
		if(col + 1 < matrix[0].length && target < matrix[row][col + 1]) {
			dfs(matrix, row , col + 1, max);
			maxv = Math.max(max[row][col + 1], maxv);
		}
		
		max[row][col] = maxv + 1;
		
		return max[row][col];

	}

}
