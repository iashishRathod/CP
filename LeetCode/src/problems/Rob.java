package problems;

public class Rob {

	public static void main(String[] args) {
		
		int nums[] = {2,7,9,3,1};
		
		System.out.println(rob(nums));

	}

	private static int rob(int[] nums) {
		
		if(nums.length == 0) return 0;
		if(nums.length == 1) return nums[0];
		
		int prev = nums[0],curr = Math.max(prev, nums[1]),temp;
		
		for (int i = 2; i < nums.length; i++) {
			
			temp = curr;
			curr = Math.max(curr, prev + nums[i]);
			prev = temp;
			
		}
		return curr;
	}

}
