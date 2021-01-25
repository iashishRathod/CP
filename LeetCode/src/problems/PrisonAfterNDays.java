package problems;

public class PrisonAfterNDays {

	public static void main(String[] args) {
		
		int[] cells = {0,1,0,1,1,0,0,1};
		
		cells = prisonAfterNDays(cells,7);
		
		for (int i : cells) System.out.println(i);
	}

	private static int[] prisonAfterNDays(int[] cells, int N) {
		for(N = (N - 1) % 14 + 1; N > 0; --N) {
			int dp[] = new int[cells.length];
			int index = 1;
			while(index < cells.length-1) {
				dp[index] = cells[index-1] == cells[index+1] ? 1 :0;
				index++;
			}
			
			cells = dp;
		}
			
		return cells;
	}
}
