package problems;

public class FindLength {

	public static void main(String[] args) {

		System.out.println(findLength(new int[] {1,2,3,2,1},new int[] {3,2,1,4,7}));
	}

	private static int findLength(int[] A, int[] B) {

		int len = 0;

		if(A.length == 0 || B.length == 0) return len;
		
		int[][] dp = new int[A.length + 1][B.length + 1];

		for(int i = 1 ; i <= A.length ; i++) {
			for(int j = 1 ; j <= B.length ; j++) {
				
				if(A[i - 1] == B[j - 1]) {
					
					dp[i][j] = dp[i - 1][j - 1] + 1;
					
					 len = Math.max(len, dp[i][j]);
				}
			}
		}
		
		return len;
	}

}
