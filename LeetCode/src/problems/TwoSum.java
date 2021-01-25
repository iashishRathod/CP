package problems;

import java.util.HashSet;
import java.util.Set;

public class TwoSum {

	public static void main(String[] args) {
		
		int[] nums = {1,5,6,8,9};
				
		int target = 15;
		
		Set<Integer> set = new HashSet<>();
		
		for(int i =0;i<=nums.length-1;i++){
			if(set.contains(target - nums[i])){
				System.out.print(1);
				break;
			}	
			set.add(nums[i]);
		}
	}
}
