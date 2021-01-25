package problems;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class FourSum {

	public static void main(String[] args) {
		
		System.out.println(fourSum(new int[] {1,0,-1,0,-2,2} , 0).toString());

	}

	private static List<List<Integer>> fourSum(int[] nums, int target) {

		List<List<Integer>> result = new ArrayList<>();

		if(nums.length == 0 ) return result;

		Arrays.sort(nums);

		for (int i = 0; i < nums.length - 2; i++) {

			for(int j = i + 1; j < nums.length - 1 ; j++) {

				int sum = nums[i] + nums[j];
				int low = j + 1,high = nums.length-1;

				while(low < high) {

					if(nums[low] + nums[high] + sum == target) {
						result.add(Arrays.asList(nums[i],nums[j],nums[low],nums[high]));
						while(low < high && nums[low] == nums[low+1]) low++;
						while(low < high && nums[high] == nums[high-1]) high--;
						low++;
						high--;

					}
					else if(nums[low] + nums[high] + sum > target) 	high--;
					else low++;
				}
				while(j <  nums.length - 1 && nums[j] == nums[j + 1]) j++;
			}
			while(i < nums.length - 2 && nums[i] == nums[i + 1]) i++;
		}

		return result;
	}

}
