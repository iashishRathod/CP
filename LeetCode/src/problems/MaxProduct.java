package problems;

import java.util.Arrays;

public class MaxProduct {

	public static void main(String[] args) {
		
		int nums[] = {3,7};
		System.out.print(maxProduct(nums));
		System.out.print(optimized(nums));
	}

	private static int optimized(int[] nums) {
		
		int max1,max2;
		
		if(nums[0] > nums[1]) {
			max1 = nums[0];
			max2 = nums[1];
		}else {
			max1 = nums[1];
			max2 = nums[0];
		}
		
		for (int i = 2; i < nums.length; i++) {
			
			if(max1 < nums[i]) {
				max2 = max1;
				max1 = nums[i];
			}else if(max2 < nums[i]) max2 = nums[i];
		}
		
		return (max2-1)*(max1-1) ;
	}

	private static int maxProduct(int[] nums) {
		Arrays.sort(nums);
		return (nums[nums.length-1] -1) * (nums[nums.length-2]-1);
	}

}
