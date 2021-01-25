package problems;

public class SingleNonDuplicate {

	public static void main(String[] args) {

		int nums[] = {1,2,2,3,3};
		//	1,1,2,3,3,4,4,8,8

		int start = 0,end = nums.length-1;

		while (start < end) {

			int mid = start + (end -start)/2;

			if(nums[mid] == nums[mid^1])
				start = mid + 1;
			else 
				end = mid;
		}
		
		System.out.println(nums[end]);
	}
}
