package problems;

public class ContainsNearbyAlmostDuplicate {

	public static void main(String[] args) {
		
		int[] nums = {2147483646,2147483647};
		int k = 3, t = 3;

		System.out.println(containsNearbyAlmostDuplicate(nums,k,t));
		System.out.println(Math.abs(-48) - Math.abs(47));
	}

	private static boolean containsNearbyAlmostDuplicate(int[] nums, int k, int t) {
		int length = nums.length;
		if(length > 1999) return false;
		int counter;
		for (int i = 0; i < length; i++) {
			counter = 1;
			while(i + counter < nums.length && counter <= k) {
				if(Math.abs((long) nums[i] - nums[i + counter]) <= t) return true;
				counter++;
			}
		}
		return false;
	}
}
