package problems;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

public class ThreeSum {

	public static void main(String[] args) {
		
		int nums[] = {-1, 0, 1, 2, -1, -4};

		System.out.println(threeSum(nums));
	}

	private static List<List<Integer>> threeSum(int[] nums) {
		List<List<Integer>> result = new LinkedList<>();
		if(nums.length == 0) return result;
		Arrays.sort(nums);
		for (int i = 0; i < nums.length-2; i++) {
			if (i > 0 && nums[i] == nums[i-1]) continue;
			int sum = 0 - nums[i];
			int low = i+1,high = nums.length-1;
			while(low < high) {
				
				if(nums[low] + nums[high] == sum) {
					result.add(Arrays.asList(nums[i],nums[low],nums[high]));
					while(low < high && nums[low] == nums[low+1]) low++;
					while(low < high && nums[high] == nums[high-1]) high--;
					low++;
					high--;
					
				}else if(nums[low] + nums[high] > sum) 	high--;
				else low++;
				
			}
		}
		
		return result;
	}

}
