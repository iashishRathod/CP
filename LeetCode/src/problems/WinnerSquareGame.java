package problems;

public class WinnerSquareGame {

	public static void main(String[] args) {

		System.out.println(winnerSquareGame(17));

	}

	public static boolean winnerSquareGame(int n) {
		boolean[] dp = new boolean[n + 1];
		for (int i = 0; i <= n; i++) {
			if (dp[i]) {
				continue;
			}
			for (int k = 1; i + k * k <= n; k++) {
				dp[i + k * k] = true;
			}
		}
		return dp[n];
	}

}
