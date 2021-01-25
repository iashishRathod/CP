package problems;

public class MaxProfit {

	public static void main(String[] args) {

		int prices[] = {1,2,3,4,5};
		System.out.print(maxProfit(prices));
	}

	private static int maxProfit(int[] prices) {
		int max  = 0,min = Integer.MAX_VALUE;
		for (int i = 0; i < prices.length; i++) {
			if(prices[i] < min) min = prices[i];
			else  max = Math.max(max, prices[i]- min);
		}
		return max;
	}

}
