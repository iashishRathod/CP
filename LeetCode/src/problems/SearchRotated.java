package problems;

import java.util.Arrays;
import java.util.stream.Collectors;

public class SearchRotated {

	public static void main(String[] args) {
		
		System.out.println(searchRotated(new int[]{4,5,6,7,0,1,2},0));

	}

	private static int searchRotated(int[] nums, int target) {
		if(nums.length == 0) return -1;
		return Arrays.stream(nums).mapToObj(i -> Integer.valueOf(i)).collect(Collectors.toList()).indexOf(target);
	}

}
