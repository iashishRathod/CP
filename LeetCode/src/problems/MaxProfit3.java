package problems;

public class MaxProfit3 {

	public static void main(String[] args) {

		System.out.println(maxProfit(new int[] {3,3,5,0,0,3,1,4}));
		System.out.println(maxProfit(new int[] {1,2,3,4,5}));
		System.out.println(maxProfit(new int[] {7,6,4,3,1}));
		System.out.println(maxProfit(new int[] {1}));
		System.out.println(maxProfit(new int[] {1,4,2}));
		System.out.println(maxProfit(new int[] {3,2,6,5,0,3}));
	}

	private static int maxProfit(int[] prices) {int leftMin = Integer.MAX_VALUE;
	int[] leftProfit = new int[prices.length];
	int currProfit = 0;
	for (int i = 0; i < prices.length; i++) {
		leftMin = Math.min(leftMin, prices[i]);
		currProfit = Math.max(currProfit, prices[i] - leftMin);
		leftProfit[i] = currProfit;
	}

	int rightMax = Integer.MIN_VALUE;
	currProfit = 0;
	int[] rightProfit = new int[prices.length];
	for (int i = prices.length - 1; i >= 0; i--) {
		rightMax = Math.max(rightMax, prices[i]);
		currProfit = Math.max(currProfit, rightMax - prices[i]);
		rightProfit[i] = currProfit;
	}

	int maxProfit = 0;
	for (int i = 0; i < prices.length; i++) {
		int currTotalMax = leftProfit[i] + rightProfit[i];
		maxProfit = Math.max(maxProfit, currTotalMax);
	}

	return maxProfit;
	}
}

