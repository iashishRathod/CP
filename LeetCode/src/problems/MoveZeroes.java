package problems;

import java.util.Arrays;

public class MoveZeroes {

	public static void main(String[] args) {
		
		int nums[] = {0,1,0,3,12}; // 1,3,12,0,0
		
		moveZeroes(nums);
		
		for(int i :nums)System.out.println(i);

	}

	private static void moveZeroes(int[] nums) {
		int m = 0;
		for (int i = 0; i < nums.length; i++) if(nums[i] !=0) nums[m++] = nums[i];
		Arrays.fill(nums, m, nums.length, 0);
	}

}
