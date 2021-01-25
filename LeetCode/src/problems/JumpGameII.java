package problems;

public class JumpGameII {

	public static void main(String[] args) {
		
		System.out.println(jump(new int[] {2,3,1,1,4}));
		System.out.println(jump(new int[] {2,3,0,1,4}));

	}

	private static int jump(int[] nums) {
		
		int pos = 0 ,dest = 0,count = 0;
		
		for(int i = 0 ; i + 1 < nums.length ; i++) {
			
			dest = Math.max(dest, i + nums[i]);
			
			if(pos == i) {
				pos = dest;
				count++;
			}
			
		}
		return count;
	}

}
