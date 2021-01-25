package problems;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class LargestDivisibleSubset {

	public static void main(String[] args) {
		
		int[] nums = {1, 16, 7, 8, 4};
		
		largestDivisibleSubset(nums);

	}

	private static List<Integer> largestDivisibleSubset(int[] nums) {
	    int[] length = new int[nums.length]; 
	    int[] prevDivisor = new int[nums.length]; 
	    
	    Arrays.sort(nums);
	    
	    int max = 0;
	    int index = -1;
	    for (int i = 0; i < nums.length; i++){
	    	length[i] = 1;
	    	prevDivisor[i] = -1;
	        for (int j = i - 1; j >= 0; j--){
	            if (nums[i] % nums[j] == 0 && length[j] + 1 > length[i]){
	            	length[i] = length[j] + 1;
	            	prevDivisor[i] = j;
	            }
	        }
	        if (length[i] > max){
	            max = length[i];
	            index = i;
	        }
	    }
	    List<Integer> res = new ArrayList<Integer>();
	    while (index != -1){
	        res.add(nums[index]);
	        index = prevDivisor[index];
	    }
	    return res;
	}

}
