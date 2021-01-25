package problems;

import java.util.Arrays;

public class ThreeSumClosest {

	public static void main(String[] args) {
		
		System.out.println(threeSumClosest(new int[] {-1,2,1,-4} , 1));
		System.out.println(threeSumClosest(new int[] {1,1,-1,-1,3} , -1));


	}

	private static int threeSumClosest(int[] nums, int target) {
		
		int closest = nums[0] + nums[1] + nums[nums.length - 1];
		Arrays.sort(nums);
		for (int i = 0; i < nums.length-2; i++) {
			int low = i+1,high = nums.length-1;
			while(low < high) {
				if(Math.abs(nums[low] + nums[high] + nums[i] - target) < Math.abs(closest - target)) {
					closest = nums[low] + nums[high] + nums[i];
				}
				if(nums[low] + nums[high] + nums[i] > target) high--;
				else low++;
			}
		}
		return closest;
	}

}
