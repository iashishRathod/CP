package problems;

public class NthUglyNumber {

	public static void main(String[] args) {

		System.out.print(nthUglyNumber(1690));
	}

	private static int nthUglyNumber(int n) {
		int dp[] = new int[n];
		dp[0] = 1;
		int index2=0,index3=0,index5=0;
		for (int i = 1; i < n; i++) {
			int min = Math.min(Math.min(dp[index2]*2, dp[index3]*3),dp[index5]*5);
			dp[i] = min;
			if(dp[index2]*2 == min) index2++;
			if(dp[index3]*3 == min) index3++;
			if(dp[index5]*5 == min) index5++;
		}
		return dp[n-1];
		
		
		/*TreeSet<Long> set = new TreeSet<>();
		
		set.add(1l);
		for(int i = 0;i<n-1;++i) {
			Long num = set.pollFirst();
			set.add(num*2);
			set.add(num*3);
			set.add(num*5);
		}
		return set.pollFirst().intValue();*/
	}
}
