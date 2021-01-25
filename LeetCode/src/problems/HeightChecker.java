package problems;

import java.util.Arrays;

public class HeightChecker {

	public static void main(String[] args) {
		
		int[] heights = {1,1,4,2,1,3};
		
		/*
		 *swap 1 - 1,1,3,2,1,4
		 *swap 2 - 1,1,1,2,3,4	
		 */
		
		System.out.print(heightChecker(heights));

	}

	private static int heightChecker(int[] heights) {
		if(heights.length != 0) {
			int[] soretd = Arrays.copyOf(heights, heights.length);
			Arrays.sort(soretd);
			int count = 0;
			for (int i = 0; i < soretd.length; i++) if(soretd[i] != heights[i]) count++;
			return count;
		}
		return 0;
	}

}
