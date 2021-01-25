package problems;

public class CountSquares {
	
	static boolean visited[][];

	public static void main(String[] args) {

		int[][] matrix = {
				{0,1,1,1},
				{1,1,1,1},
				{0,1,1,1}
		};

		visited = new boolean[matrix.length][matrix[0].length];
		System.out.print(countSquars(matrix));

	/*	4-1
		3-2
		2-6
		1-12*/ 

	}

	private static int countSquars(int[][] matrix) {

		int result = 0;
		
		countSquareHelper(0,0,matrix,result);
		return result;
	}

	private static void countSquareHelper(int i, int j, int[][] matrix,int result) {
		
		if(i < 0 || i >= matrix.length || j < 0 || j >= matrix[i].length || visited[i][j])
			return;
		
		visited[i][j] = true;
		if(1 == matrix[i][j])
			result++;
			
		countSquareHelper(i+1, j, matrix, result);
		countSquareHelper(i-1, j, matrix, result);
		countSquareHelper(i, j+1, matrix, result);
		countSquareHelper(i, j-1, matrix, result);
		
	}
}
