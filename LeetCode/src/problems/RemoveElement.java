package problems;



public class RemoveElement {

	public static void main(String[] args) {
		
		int nums[] = {0,1,2,2,3,0,4,2}; // 5,0,1,3,0,4
		int val = 2;
		System.out.println(removeElement(nums,val));
		
		for (int i : nums)System.out.println(i);
	}	

	private static int removeElement(int[] nums, int val) {
		
		if(nums.length == 0) return 0;
		int length = 0;
		for (int i = 0; i < nums.length; i++) if(nums[i] != val) nums[length++] = nums[i];
		return length;
	}
}
