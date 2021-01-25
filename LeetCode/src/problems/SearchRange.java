package problems;

public class SearchRange {

	public static void main(String[] args) {
		
		System.out.println(searchRange(new int[] {5,7,7,8,8,10}, 8 ));
		
	}

	private static int[] searchRange(int[] nums, int target) {
		
		int[] res = new int[]{-1,-1};
		
		if(nums.length == 0 ) return res;
		
		int left = search(nums,0,nums.length ,true,target);
		
	//	if(left == nums.length || nums[left] != target) return res;
		if(left < 0) return res;
		
		res[0] = left; res[1] = search(nums,0,nums.length ,false,target) - 1;
		
		return res;
	}

	private static int search(int[] nums, int start, int end, boolean left, int target) {
		
		while(start < end) {
			
			int mid = (start + end) /2;
			
			if(nums[mid] > target || (left && nums[mid] == target)) {
				end = mid;
			}
			else {
				start = mid + 1;
			}
		}
		
		return start;
	}
}
