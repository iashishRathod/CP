package problems;

import java.util.Stack;

public class JumpGameIII {

	public static void main(String[] args) {

		System.out.println(canReach(new int[] {4,2,3,0,3,1,2} , 5));
	}

	private static boolean canReach(int[] nums, int start) {
		
		Stack<Integer> stack = new Stack<>();
		boolean[] visited = new boolean[nums.length];
		
		stack.add(start);
		
		while(!stack.isEmpty()) {
			
			int index = stack.pop();
			
			int left = index - nums[index];
			int right = index + nums[index];
			
			if(left >=0 && left < nums.length && !visited[left]) {
				visited[left] = true;
				if(nums[left] == 0) return true;
				stack.add(nums[left]);
			}
			
			if(right >=0 && right < nums.length && !visited[right]) {
				visited[right] = true;
				if(nums[right] == 0) return true;
				stack.add(nums[right]);
			}
		}
		
		return false;
	}

}
