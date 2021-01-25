package problems;

public class ROB2 {
	
	static int result;

	public static void main(String[] args) {

		System.out.println(rob(new int [] {1,2,3,1,7}));
	}

	private static int rob(int[] nums) {
		if(nums.length == 1) return nums[0];
		return Math.max(rob(nums,0,nums.length-2), rob(nums,1,nums.length-1));
	}
	
	private static int rob(int[] nums,int start,int end) {
		int prev = 0, curr = 0,temp;
		for (int i = start; i <= end; i++) {
			temp = curr;
			curr = Math.max(prev + nums[i], curr);
			prev = temp;
			
		}
		return curr;
		
	}
}
