package problems;

import java.util.Arrays;

public class FindPairs {

	public static void main(String[] args) {
		
	/*	System.out.println(findPairs(new int[] {3,1,4,1,5},2));
		System.out.println(findPairs(new int[] {1,2,3,4,5},1));
		System.out.println(findPairs(new int[] {1,3,1,5,4},0));
		System.out.println(findPairs(new int[] {1,2,4,4,3,3,0,9,2,3},3));
		System.out.println(findPairs(new int[] {-1,-2,-3},1));*/
		System.out.println(findPairs(new int[] {-1,1},0));
		/*System.out.println(findPairs(new int[] {6,7,3,6,4,6,3,5,6,9},4));*/

	}

	private static int findPairs(int[] nums, int k) {
		if(nums.length == 1) return 0;
		Arrays.sort(nums); //1,1,3,4,5
		int start = 0, end = 1;
		int count = 0;
		while(end < nums.length && start < nums.length) {
			if(start == end || nums[start] + k  > nums[end]) end++;
			else if(nums[start] + k < nums[end]) start++;
			else {
				start++;
				count++;
				while (start < nums.length && nums[start] == nums[start - 1]) start++;
				end = Math.max(end + 1, start + 1);
			}
		}
		
		return count;
	}

}
