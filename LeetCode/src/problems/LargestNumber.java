package problems;

import java.util.Arrays;

public class LargestNumber {

	public static void main(String[] args) {
		
		System.out.println(largestNumber(new int[]{3,30,34,5,9}));

	}

	private static String largestNumber(int[] nums) {
		
		/*String[] array = new String[nums.length];
		
		for (int i = 0; i < array.length; i++) {
			array[i] = String.valueOf(nums[i]);
		}
		
		Arrays.sort(array, new Comparator<String>() {

			@Override
			public int compare(String a, String b) {
				String v1 = a + b;
				String v2 = b + a;
				return v2.compareTo(v1);
			}
		});
		
		if(array[0].equals("0")) return "0";
		
		String res = "";
		
		for (String string : array) {
			res +=string;
		}*/
		
		String res = Arrays.stream(nums).mapToObj(String::valueOf).sorted((a,b) -> (b+a).compareTo(a+b)).reduce((a,b)-> a+b).get();
		return res.startsWith("0") ? "0" : res;
	}

}
