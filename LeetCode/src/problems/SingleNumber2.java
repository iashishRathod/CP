package problems;

import java.util.Arrays;

public class SingleNumber2 {

	public static void main(String[] args) {
		
		int nums[] = {0,1,0,1,0,1,99}; //2,2,2,3
		
		System.out.print(singleNumber2(nums));
	}

	private static int singleNumber2(int[] nums) {
		int ones = 0, twos = 0; 
        int common_bit_mask; 
          
        for(int i=0; i<nums.length; i++ ) 
        { 
            twos = twos | (ones & nums[i]); 
  
            ones = ones ^ nums[i]; 
  
            common_bit_mask = ~(ones & twos); 
                          
            ones &= common_bit_mask; 
                          
            twos &= common_bit_mask; 
        } 
        return ones; 
	}
	
	int myCode(int[] nums){
		if(nums.length==1) return nums[0];
		Arrays.sort(nums);
		int count = 1,suspect = nums[0];
		for (int i = 1; i < nums.length; i++) {
			if(suspect != nums[i]) {
				if(i==0 || i == nums.length-1)return nums[i]; 
				else if(count == 1) return suspect;
				else {
					suspect = nums[i];
					count = 1;
				}
			}
			else count++;
		}
		return 0;
	}

}
