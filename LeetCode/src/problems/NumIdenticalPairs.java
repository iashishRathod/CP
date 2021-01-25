package problems;

import java.util.Arrays;

public class NumIdenticalPairs {

	public static void main(String[] args) {
		System.out.println(numIdenticalPairs(new int [] {1,2,3}));
		System.out.println(numIdenticalPairs(new int [] {1,1,1,1}));
		System.out.println(numIdenticalPairs(new int [] {1,2,3,1,1,3}));
		
	}

	private static int numIdenticalPairs(int[] nums) {
		if(nums.length == 0) return 0;
		int[] val = new int[100];
		for(int i = 0 ; i< nums.length;i++) {
			val[nums[i]]++;
		}
		Arrays.sort(val);
		int j = val.length - 1;
		int pairs = 0;
		while(val[j] > 0) {
			pairs += ((val[j] * (val[j] -1))/2);
			j--;
		}
		return pairs;
	}

}
