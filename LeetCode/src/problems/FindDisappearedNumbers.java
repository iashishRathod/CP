package problems;

import java.util.ArrayList;
import java.util.List;

public class FindDisappearedNumbers {

	public static void main(String[] args) {
		
		int[] nums = {5,4,6,7,9,3,10,9,5,6};

		List<Integer> result = findDisappearedNumbers(nums);
		for (Integer i : result) {
			System.out.print(i);
		}
	}

	private static List<Integer> findDisappearedNumbers(int[] nums) {
		List<Integer> result = new ArrayList<>();
		if( nums.length == 0) return result;
		
		for (int i = 0; i < nums.length; i++) {
			int val = Math.abs(nums[i])-1;
			if(nums[val] > 0) {
				nums[val] = -nums[val];
			}
		}
		
		for (int i = 0; i < nums.length; i++) {
			if(nums[i] > 0) result.add(i+1);
		}
		return result;
	}

}
