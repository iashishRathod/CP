package problems;


public class Change {

	public static void main(String[] args) {
		
		int amount = 5;
		int[] coins = {1,2,5};
		
		System.out.print(change(amount,coins));

	}

	private static int change(int amount, int[] coins) {
		
		int dp[] = new int[amount+1];
		dp[0] =1;
		
		for (int i : coins) {
			for (int j = i; j <=amount; ++j) {
				dp[j] += dp[j-i]; 
			}
			
		}
		return dp[amount];
	}

}
