package problems;

import java.util.HashMap;
import java.util.Map;

public class MaxCoins {

	public static void main(String[] args) {
		
		System.out.println(maxCoins(new int[] {3,1,5,8}));
		System.out.println(optimized(new int[] {3,1,5,8}));

	}

	private static int optimized(int[] nums) {
		
		int len = nums.length;
		if(len == 0) return 0;
		
		int dp[][] = new int[len][len];
		
		for(int n = 0 ;n < len ; n++) {
			
			for(int i = 0 ; i + n < len ; i++) {
				
				int j = i + n;
				
				for(int k = i ; k <= j ; k++) {
					
					int leftNum = i == 0 ? 1 : nums[i - 1];
					int rightNum = j == len - 1 ? 1 : nums[j + 1];
					int left = k == i ? 0 : dp[i][k-1];
					int right = k == j ? 0 : dp[k+1][j];
					
					dp[i][j] = Math.max(dp[i][j], leftNum * nums[k] * rightNum + left + right);
				}
			}
		}
		
		return dp[0][len-1];
	}

	private static int maxCoins(int[] nums) {
		int len = nums.length;
		if(len == 0 ) return 0;
		int[] temp = new int[len+2];
		temp[0] = temp[temp.length - 1] = 1;
		for(int i = 0 ; i < len ; i++) { temp[i + 1] = nums[i]; }
		return getCoins(temp,0,temp.length - 1);
	}
	
	static Map<String,Integer> map = new HashMap<>();	

	private static int getCoins(int[] nums, int l, int r) {
		
		String key = l + "|" + r;
		
		if(!map.containsKey(key)) {
			int maxCoins = 0;
			for(int i = l + 1 ; i < r; i++) {
				int score = nums[i]*nums[l]*nums[r];
				maxCoins = Math.max(maxCoins, score + getCoins(nums, l, i) + getCoins(nums, i, r));
			}
			
			map.put(key, maxCoins);
		}
		
		return map.get(key);
	}

}
