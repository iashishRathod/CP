package problems;

import java.util.Arrays;

public class SmallestDistancePair {

	public static void main(String[] args) {

		System.out.println(smallestDistancePair(new int[] {1,3,1},1));
		System.out.println(smallestDistancePair(new int[] {1,1,3,1},4));
	}

	private static int smallestDistancePair(int[] nums, int k) {

		if(nums.length == 0 || k == 0 ) return 0;

		Arrays.sort(nums);

		/*
		 * 1,1,1,1,3
		 */

		int lo = 0;
		int hi = nums[nums.length - 1] - nums[0];
		while (lo < hi) {
			int mi = (lo + hi) / 2;
			int count = 0, left = 0;
			for (int right = 0; right < nums.length; ++right) {
				while (nums[right] - nums[left] > mi) left++;
				count += right - left;
			}
			//count = number of pairs with distance <= mi
			if (count >= k) hi = mi;
			else lo = mi + 1;
		}
		return lo;
	}

}
