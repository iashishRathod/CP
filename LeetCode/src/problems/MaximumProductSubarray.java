package problems;

public class MaximumProductSubarray {

	public static void main(String[] args) {

		int nums[] = {-2,3,-4};

		System.out.println(maxProduct(nums));

	}

	private static int maxProduct(int[] nums) {
		if(nums.length == 0) return 0;
		int i= 1;
		int max,min,res;
		max = min = res = nums[0];
		while(i < nums.length) {
			
			if(nums[i] < 0) {
				int temp = max;
				max = min;
				min = temp;
			}
			
			max = Math.max(nums[i],nums[i]*max);
			min = Math.min(nums[i],nums[i]*min);
			
			res = Math.max(max, res);
			i++;
		}
		return res;
	}

}
