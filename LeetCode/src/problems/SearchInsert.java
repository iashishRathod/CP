package problems;

public class SearchInsert {

	public static void main(String[] args) {
		
		int[] nums = {1,2,3,4,5,10};
		int target = 2;
		
		 System.out.print(searchInsert(nums,target));

	}

	private static int searchInsert(int[] nums, int target) {
		int start = 0;
		while(start < nums.length){
			if(nums[start] == target) return start;
			else if (nums[start] < target) start++;
			else return start;
		}
		return start;
	}
}
