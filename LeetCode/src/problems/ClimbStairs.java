package problems;

public class ClimbStairs {

	static int dp[];
	public static void main(String[] args) {
		
		System.out.println(climbStairs(45));

	}

	private static int climbStairs(int n) {
		dp = new int[n+1];
		return helper(n);
	}

	private static int helper(int n) {
		if(n == 0 || n==1) return 1;
		if(dp[n] != 0) return dp[n];
		dp[n] = helper(n-1) + helper(n-2);
		return dp[n];
	}

}
