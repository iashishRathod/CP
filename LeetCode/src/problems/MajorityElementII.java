package problems;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MajorityElementII {

	public static void main(String[] args) {
		
		System.out.println(majorityElementII(new int[] {1,1,1,3,3,2,2,2}).toString());

	}

	private static List<Integer> majorityElementII(int[] nums) {
		
		List<Integer> list = new ArrayList<>();
		int length = nums.length;
		
		if(length != 0) {
			Arrays.sort(nums);
			int count = length/3 +1; 
			int curr = 1; 
			
			for (int i = 1; i < length; i++) {
				
				if(nums[i] == nums[i-1]) curr++;
				else {
					if(curr >= count) list.add(nums[i-1]);
					curr = 1;
				}
			}
			
			if(curr >= count) list.add(nums[nums.length-1]);
		}
		
		return list;
	}

}
