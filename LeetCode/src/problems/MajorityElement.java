package problems;

import java.util.Arrays;

public class MajorityElement {

	public static void main(String[] args) {

		int input[] = {3,1, 3, 3, 2};
		Arrays.sort(input);
		System.out.print(input[input.length/2]);
	}
}
