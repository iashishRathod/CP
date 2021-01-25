package problems;

public class GameOfLife {

	public static void main(String[] args) {

		System.out.println(gameOfLife(new int [][] {
			{0,1,0},
			{0,0,1},
			{1,1,1},
			{0,0,0}
		}));

	}


	private static int[][] gameOfLife(int[][] board) {

		if(board.length == 0) return board;

		for(int row = 0 ; row < board.length ; row++) {

			for(int col = 0 ; col < board[row].length ; col++) {

				int lives = getCount(row, col , board);

				if(board[row][col] == 0) {
					if (lives == 3) {
						board[row][col] = -1;
					}   
				}
				if(board[row][col] == 1){
					if (lives < 2 || lives > 3)
						board[row][col] = 2;
				}
			}
		}

		for (int i = 0; i < board.length; i++) {
			for (int j = 0; j < board[i].length; j++) {
				if (board[i][j] == 2)
					board[i][j] = 0;

				if (board[i][j] == -1)
					board[i][j] = 1;
			}
		}

		return board;
	}

	private static int getCount(int row, int col, int[][] gol) {
		int total = 0;
		if(row+1 < gol.length && (gol[row+1][col] == 1 || gol[row+1][col] == 2)) {
			total += 1;
		}
		if(row-1 >= 0 && (gol[row-1][col] == 1 || gol[row-1][col] == 2)) {
			total += 1;
		}
		if(col+1 < gol[0].length && (gol[row][col+1] == 1 || gol[row][col+1] == 2)) {
			total += 1;
		}
		if(col-1 >= 0 && (gol[row][col-1] == 1 || gol[row][col-1] == 2)) {
			total += 1;
		}
		//diagonals
		if(row - 1 >= 0 && col - 1 >= 0 && (gol[row-1][col-1] == 1 || gol[row-1][col-1] == 2)) {
			total += 1;
		}
		if(row + 1 < gol.length && col + 1 < gol[0].length && (gol[row+1][col+1] == 1 || gol[row+1][col+1] == 2)) {
			total += 1;
		}
		if(row + 1 < gol.length && col - 1 >= 0 && (gol[row+1][col-1] == 1 || gol[row+1][col-1] == 2)) {
			total += 1;
		}
		if(row - 1 >= 0 && col + 1 < gol[0].length && (gol[row-1][col+1] == 1 || gol[row-1][col+1] == 2)) {
			total += 1;
		}
		return total;
	}
}
