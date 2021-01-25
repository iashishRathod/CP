package problems;

import java.util.Arrays;

public class MaxProfit4 {

	public static void main(String[] args) {
		
		System.out.println(maxProfit(2,new int[] { 3,2,6,5,0,3}));
		
		/*
		 * 
		 * if case 1 executed than : Time = O(n) and Space = O(1)
		 * else Time = O(k*n) and Space = O(k)
		 */

	}

	private static int maxProfit(int k, int[] prices) {
		
		int length = prices.length;
		
		if(length <= 1 || k <= 0) return 0;
		
		// Case 1
		
		if(k >= length/2) {
			int profit = 0;
			for (int i = 0; i < prices.length-1; i++) {
				if(prices[i] < prices[i+1]) profit += prices[i+1] - prices[i];
				
			}
			return profit;
		}
		
		// Case 2
		
		int buy[] = new int[k];
		int sell[] = new int[k];
		
		Arrays.fill(buy, Integer.MIN_VALUE);

		for (int i = 0 ; i < length; i++) {
			for (int j = 0; j < k; j++) {
				buy[j] = Math.max(buy[j],j == 0 ? -prices[i] : sell[j-1] - prices[i]);
				sell[j] = Math.max(sell[j], buy[j] + prices[i]);
			}
		}
		
		
		return sell[k-1];
	}

}
