package problems;

public class IncreasingTriplet {

	public static void main(String[] args) {
		
		System.out.println(increasingTriplet(new int[] {1,2,3,4,5}));
		System.out.println(increasingTriplet(new int[] {5,4,3,2,1}));
		System.out.println(increasingTriplet(new int[] {2,1,5,0,4,6}));
		System.out.println(increasingTriplet(new int[] {5,1,5,5,2,5,4}));
	}

	private static boolean increasingTriplet(int[] nums) {
		
		if(nums.length == 0) return false;
		
		int first = Integer.MAX_VALUE;
		int secound = Integer.MAX_VALUE;

		for(int i = 0 ; i < nums.length ; i++) {
			
			if(first >= nums[i]) {
				first = nums[i];
			}
			else if(secound >= nums[i]) {
				secound = nums[i];
			}
			else return true;
		}
		
		return false;
	}

}
