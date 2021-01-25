package problems;

public class SurroundedRegions {
	
	static boolean visited[][];

	public static void main(String[] args) {
		
		char[][] board = {
							{'O','X','X','O','X'},
							{'X','O','O','X','O'},
							{'X','O','X','O','X'},
							{'O','X','O','O','O'},
							{'X','X','O','X','O'}
							};
		surroundedRegions(board);
	}

	private static void surroundedRegions(char[][] board) {
		
		if(board.length==0) return;
		visited = new boolean[board.length][board[0].length];
		
		for (int i = 0; i < board.length; i++) {
			if(board[i][0] == 'O')	dfs(i,0,board);
			if(board[i][board[0].length-1] == 'O') dfs(i,board[0].length-1,board);
		}
		
		for (int i = 1; i < board[0].length-1; i++) {
			if(board[0][i] == 'O') dfs(0,i,board);
			if(board[board.length-1][i] == 'O') dfs(board.length-1, i,board);
		}
		
		for (int i = 0; i < board.length; i++) {
			for (int j = 0; j < board[0].length; j++) {
				if(board[i][j] == '*') board[i][j] = 'O';
				else if(board[i][j] == 'O') board[i][j] = 'X';
			}
		}
	}

	private static void dfs(int i, int j, char[][] board) {
		
		if(i>=0 && i < board.length && j>=0 && j < board[0].length && !visited[i][j] && board[i][j] == 'O') {
			visited[i][j] = true;
			board[i][j] = '*';
			dfs(i+1, j, board);
			dfs(i-1, j, board);
			dfs(i, j+1, board);
			dfs(i, j-1, board);
		}
	}
}
