package problems;

import java.util.Arrays;

public class SmallestRangeI {

	public static void main(String[] args) {
		
		System.out.println(smallestRange(new int[] {1,3,6}, 3));

	}

	private static int smallestRange(int[] nums, int k) {
		
		if(nums.length == 0 || nums.length == 1) return 0;
		
		Arrays.sort(nums);
		
		/*
		 * 1,3,6
		 * 
		 * 1 -> 
		 * 
		 */
		
		int min = nums[0];
		int max = nums[nums.length - 1];
		
		return Math.max(0, (max - k) - (min + k));
	}

}
