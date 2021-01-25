package problems;

public class JumpGame {

	public static void main(String[] args) {
		
		System.out.println(canJump(new int[] {2,3,1,1,4}));
		System.out.println(canJump(new int[] {3,2,1,0,4}));

	}

	private static boolean canJump(int[] nums) {
		
		int pos = 0 , des = 0;
		
		for(int i = 0 ; i + 1 < nums.length; i++ ) {
			
			des = Math.max(des, i + nums[i]);
			
			if(pos == i) {
				pos = des;
			}
		}
		
		return pos < nums.length - 1 ? false : true;
	}

}
