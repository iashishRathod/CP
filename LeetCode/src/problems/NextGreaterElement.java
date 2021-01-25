package problems;

public class NextGreaterElement {

	public static void main(String[] args) {
		
		System.out.println(nextGreaterElement(12));
		System.out.println(nextGreaterElement(21));
		System.out.println(nextGreaterElement(123));
		System.out.println(nextGreaterElement(1999999999));
		
	}

	private static int nextGreaterElement(int n) {
		
		if(n < 10) return -1;
		
		char[] nums = String.valueOf(n).toCharArray();
		
		int k = nums.length - 2;
		int i = nums.length - 1;
		
		while(k >= 0 && nums[k] >= nums[k+1]) k--;
		
		if(k >= 0) {
			while(i > k && nums[i] <= nums[k]) i--;
			char tmp = nums[k];
			nums[k] = nums[i];
			nums[i] = tmp;
		}
		
		int l = k + 1,r = nums.length -1;
		
		while(l < r) {
			char tmp = nums[l];
			nums[l] = nums[r];
			nums[r] = tmp;
			l++;r--;
		}
		
		int num ;
		return n < (num = (int) Long.parseLong(new String(nums))) ? num : -1;
	}

}
