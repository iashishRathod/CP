package problems;

import java.util.Stack;

public class Find132pattern {

	public static void main(String[] args) {

		System.out.println(find132pattern(new int[] {1,2,3,4}));
	}

	private static boolean find132pattern(int[] nums) {
		
		if(nums.length < 3) return false;
		
		int min[] = new int[nums.length];
		
		min[0] = nums[0];
		
		for (int i = 1; i < min.length; i++) min[i] = Math.min(nums[i], min[i-1]);
		
		Stack<Integer> stack = new Stack<>();
		
		for (int j = nums.length -1 ; j >= 0; j--) {
			
			if(nums[j] > min [j]) {
				
				while(!stack.isEmpty() && stack.peek() <= min[j]) stack.pop();
				
				if(!stack.isEmpty() && stack.peek() < nums[j]) return true;
				
				stack.push(nums[j]);
			}
		}
		
		
		return false;
	}

}
