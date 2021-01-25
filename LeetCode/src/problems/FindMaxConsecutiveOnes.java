package problems;

public class FindMaxConsecutiveOnes {

	public static void main(String[] args) {
		
		int[] nums = {1,1,0,1,1,1,1,0,1,1,1};
		System.out.print(findMaxConsecutiveOnes(nums));

	}

	private static int findMaxConsecutiveOnes(int[] nums) {
		
		int maxCount = 0,curr=0;
		for (int i = 0; i < nums.length; i++) {
			if(nums[i]==1) {
				curr++;
				maxCount = Math.max(maxCount, curr);
			}
			else {
				
				curr = 0;
			}
		}
		
		return maxCount;
	}

}
