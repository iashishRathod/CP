package problems;

public class ThirdMax {

	public static void main(String[] args) {
		
		int nums[] = {2, 3, 1,2,4};

		System.out.println(thirdMax(nums));
	}

	private static int thirdMax(int[] nums) {
		
		Integer max1 = null,max2 = null,max3 = null;
		for (Integer i : nums) {
			if(i.equals(max1) || i.equals(max2) || i.equals(max3)) continue;
			if(max1 == null || max1 < i) {
				
				max3 = max2;
				max2 = max1;
				max1 = i;
			}
			else if(max2 == null || max2 < i) {
				max3 = max2;
				max2 = i;
			}
			else if(max3 == null || i >max3) max3 = i;
		}

		return max3 == null ? max1 : max3;
	}

}
