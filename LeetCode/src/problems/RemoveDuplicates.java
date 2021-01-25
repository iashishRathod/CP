package problems;


public class RemoveDuplicates {

	public static void main(String[] args) {
		
		int[] nums = {1,1,2};
		
		int n = removeDuplicates(nums);
		
		System.out.println(n);
		for (int i : nums) System.out.println(i);
		
	}

	private static int removeDuplicates(int[] nums) {
		
		int length = 1;
		int i = 0;
		int j = 1;
		while(nums.length > j){
			if(nums[i] == nums[j]){
				j++;
			}else{
				nums[i+1] = nums[j];
				i++;
				j++;
				length++;
			}
		}
		return length;
	}

}
