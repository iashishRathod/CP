package problems;

public class UniquePathsIII {
	
	static int emptyCells = 1,result = 0;

	public static void main(String[] args) {
		
		int[][] grid = {
				{1,0,0,0},
				{0,0,0,0},
				{0,0,0,2}
						 };
		
		System.out.println(uniquePathsIII(grid));

	}

	private static int uniquePathsIII(int[][] grid) {
		int x = 0,y = 0;
		for (int i = 0; i < grid.length; i++) {
			for (int j = 0; j < grid[0].length; j++) {
				if(grid[i][j] == 0) emptyCells++;
				else if(grid[i][j] == 1) {
					x = i;
					y = j;
				}
			}
		}
		paths(x,y,grid);
		return result;
	}

	private static void paths(int i, int j, int[][] grid) {
		
		if(i < 0 || j < 0 || i >= grid.length || j >=  grid[0].length || grid[i][j] < 0) return;
		
		if(grid[i][j] == 2 ) {
			if(emptyCells == 0)result++;
			return;
		}
		grid[i][j] = -2;
		emptyCells--;
		paths(i+1, j,grid);
		paths(i-1, j,grid);
		paths(i, j+1,grid);
		paths(i, j-1,grid);
		grid[i][j] = 0;
		emptyCells++;
	
	}

}
