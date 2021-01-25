package problems;

public class MaxSubArray {

	public static void main(String[] args) {
		
		int[] nums = {1,2,3,-2,5};
		
		System.out.print(maxSubArray(nums));  
		/*
		 * Kadan's Algo
		 * Time Complexity - O(n)
		 * Space Complexity - 0(1)  
		 */
	}

	private static int maxSubArray(int[] nums) {

		int maxCurrent,globalMax;
		maxCurrent = globalMax = nums[0];

		for(int i = 1;i<nums.length;i++){
			maxCurrent = Math.max(nums[i], maxCurrent + nums[i]);
			globalMax = Math.max(maxCurrent, globalMax);
		}
		
		return globalMax;
	}

}
