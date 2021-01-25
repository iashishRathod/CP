package problems;

public class FindMaxAverage {

	public static void main(String[] args) {

		System.out.println(findMaxAverage(new int[] {-1},1));
	}

	private static double findMaxAverage(int[] nums, int k) {
		
		if(nums.length == 0 || k == 0) return 0d;
		
		int start = 0,end = 0;
		int sum = 0;
		double maxAvg = Integer.MIN_VALUE;
		while(end < nums.length) {
			
			sum += nums[end++];
			
			if(end - start == k) {
				start++;
				end = start;
				double avg = (double) sum / k;
				maxAvg = Math.max(maxAvg, avg);
				sum = 0;
			}
		}
		
		
		return maxAvg;
	}

}
