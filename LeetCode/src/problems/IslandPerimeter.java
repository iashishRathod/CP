package problems;

public class IslandPerimeter {
	
	public static void main(String[] args) {
		
		int[][] grid = { 
				{0,1,0,0},
				{1,1,1,0},
				{0,1,0,0},
				{1,1,0,0}
				
		};
		
		System.out.print(islandPerimeter(grid));
	}

	private static int islandPerimeter(int[][] grid) {
		
		int result = 0;
		
		if(grid != null && grid.length != 0) {
			
			for (int i = 0; i < grid.length; i++) {
				for (int j = 0; j < grid[i].length; j++) {
					
					if(grid[i][j] == 1) {
						result += 4;
						
						if(i > 0 && grid[i-1][j] == 1) result -= 2;
						if(j > 0 && grid[i][j-1] == 1) result -= 2;
					}
				}
			}
			
		}
		return result;
	}


}
