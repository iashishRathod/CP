package problems;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;

public class FindCheapestPrice {

	static int length;

	public static void main(String[] args) {

		int n = 7, src=0, dst=4, K=3;

		int[][] flights = {{0,1,60},{1,2,20},{2,3,30},{0,4,80},{1,4,10},{2,4,15},{3,4,25}};

		int chepeastPrice = findCheapestPrice(n, flights, src, dst, K);

		System.out.print(chepeastPrice);

		bellmanFordSolution(n, flights, src, dst, K);

	}

	private static int findCheapestPrice(int n, int[][] flights, int src, int dst, int K) {
		int min = Integer.MAX_VALUE;
		int[][] graph = new int[n][n];
		int[] minPrices = new int[n];
		for (int[] flight : flights) {
			int start = flight[0];
			int end = flight[1];
			graph[start][end] = flight[2];
		}
		Queue<Integer> q = new LinkedList<>();
		Queue<Integer> prices = new LinkedList<>();
		q.add(src);
		prices.add(0);
		while (!q.isEmpty() && K >= 0) {
			K--;
			int size = q.size();
			for (int i = 0; i < size; i++) {
				int start = q.poll();
				int priceTillNow = prices.poll();
				for (int j = 0; j < n; j++) {
					int price = graph[start][j];
					if (price > 0) {    //there is a flight
						int curPrice = priceTillNow + price;
					int oldPrice = minPrices[j];
					//If there is a cheaper flight with lesser stops do not add it to q
					if (oldPrice == 0 || oldPrice > curPrice) {//pruning
						minPrices[j] = curPrice;
						q.add(j);
						prices.add(curPrice);
						if (j == dst && min > curPrice) {
							min = curPrice;
						}
					}
					}
				}
			}
		}
		return min == Integer.MAX_VALUE ? -1 : min;
	}
	
	private static int bellmanFordSolution(int n, int[][] flights, int src, int dst, int K) {
		long[][] dp = new long[K+2][n];
        for (long[] d : dp) Arrays.fill(d, Integer.MAX_VALUE);
        dp[0][src] = 0;
       
        for (int i = 1; i < K+2; i++) {
            dp[i][src] = 0;
            for (int[] f : flights) dp[i][f[1]] = Math.min(dp[i][f[1]], dp[i-1][f[0]] + f[2]);
        }
        return dp[K+1][dst] == Integer.MAX_VALUE ? -1 : (int)dp[K+1][dst]; 		
	}
}
