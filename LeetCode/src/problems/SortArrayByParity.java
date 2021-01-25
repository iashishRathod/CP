package problems;

import java.util.ArrayList;
import java.util.List;

public class SortArrayByParity {

	public static void main(String[] args) {
		
		int[] arr = {3,1,2,4};

		sortArrayByParity(arr);
	}

	private static int[] sortArrayByParity(int[] arr) {
		if(arr.length == 0) return arr;
		int m=0;
		List<Integer> nums = new ArrayList<>();
		for (int i : arr) {
			if(i%2==0) arr[m++] = i;
			else nums.add(i);
		}
		int i=0;
		while(m < arr.length) {
			arr[m++] = nums.get(i);
			i++;
		}
		return arr;
	}

}
