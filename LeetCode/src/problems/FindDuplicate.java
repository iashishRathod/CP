package problems;

import java.util.Arrays;

public class FindDuplicate {

	public static void main(String[] args) {
		
		int nums[] = {1,3,4,2,2};
		System.out.print(findDuplicate(nums));
	}

	private static int findDuplicate(int[] nums) {
        Arrays.sort(nums);
		for (int i=0;i+1<nums.length;i++) if(nums[i] == nums[i+1]) return nums[i];
		return 0;
	}
}
