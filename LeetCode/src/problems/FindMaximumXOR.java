package problems;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class FindMaximumXOR {

	public static void main(String[] args) {

		System.out.println(findMaximumXOR(new int[] {3,10,5,25,2,8}));
		System.out.println(optimized(new int[] {3,10,5,25,2,8}));
	}

	private static int findMaximumXOR(int[] nums) {

		int max = 0;
		int mask = 0;

		for (int i = 31; i >=0; i--) {
			Set<Integer> set = new HashSet<>();
			mask = mask | (1 << i); 

			for (Integer num  : nums) {
				set.add(num & mask);
			}

			int tmp = max | (1 << i);

			for(int prefix : set){
				if(set.contains(tmp ^ prefix)) {
					max = tmp;
					break;
				}
			}
		}

		return max;
	}
	
	private static int optimized(int[] nums) {
		Arrays.sort(nums);
		int or = 0;
		for (int n : nums) {
			or |= n;
		}
		int max = 0;
		int i = 0, j = nums.length - 1;
		while (i < j) {
			max = Math.max(max, nums[i] ^ nums[j]);
			if ((nums[i] ^ or) > nums[j]) i++;
			else j--;
		}
		return max;
	}

}
