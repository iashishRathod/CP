package problems;

import java.util.Arrays;


public class TwoCitySchedCost {

	public static void main(String[] args) {

		int[][] costs = {{10,20},{30,200},{400,50},{30,20}};

		System.out.print(twoCitySchedCost(costs));

	}

	private static int twoCitySchedCost(int[][] costs) {
		
		int minCost = 0,index = 0;
		int refund[] = new int[costs.length];
		
		for (int[] cost : costs) {
			refund[index++] = cost[1] - cost[0];
			minCost += cost[0];
		}
		
		Arrays.sort(refund);
		
		for (int i = 0; i < refund.length/2; i++)
			minCost += refund[i];
		
		return minCost;
		
	}
}

