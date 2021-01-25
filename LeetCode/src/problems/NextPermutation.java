package problems;

public class NextPermutation {

	public static void main(String[] args) {
		
		nextPermutation(new int[] {1,3,2});
		nextPermutation(new int[] {1,5,1});
	}

	public static void nextPermutation(int[] nums) {
		
		if(nums.length <= 1) return;
		
		int k = nums.length - 2;
		int i = nums.length - 1;
		
		while(k >= 0 && nums[k] >= nums[k+1]) k--;
		
		if(k >= 0) {
			while(i > k && nums[i] <= nums[k]) i--;
			int tmp = nums[k];
			nums[k] = nums[i];
			nums[i] = tmp;
		}
		
		/*
		 * 1,3,2
		 * 1 3,2
		 * 2 3,1
		 * 
		 */
		
		int l = k + 1,r = nums.length -1;
		
		while(l < r) {
			int tmp = nums[l];
			nums[l] = nums[r];
			nums[r] = tmp;
			l++;r--;
		}
	}

}
