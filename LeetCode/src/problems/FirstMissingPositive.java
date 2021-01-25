package problems;

import java.util.Arrays;

public class FirstMissingPositive {

	public static void main(String[] args) {
		
		int[] nums = {-1,1,2,3};
		
		System.out.println(firstMissingPositive(nums));
	}

	private static int firstMissingPositive(int[] nums) {
		
		if(nums.length == 0) return 1;
		
		Arrays.sort(nums); // {0,1,2}
		
		int prev = 0;
		
		for (int i = 0; i < nums.length; i++) {
			
			if(nums[i] <= 0) continue;
			
			if((nums[i] - prev) > 1) return prev+1;
			else prev = nums[i];
		}
		
		return nums[nums.length-1]  < 0 ? 1 : nums[nums.length-1] +1;
	}

}
