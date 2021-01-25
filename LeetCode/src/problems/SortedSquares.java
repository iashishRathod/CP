package problems;

import java.util.Arrays;

public class SortedSquares {

	public static void main(String[] args) {
		
		int a[] = {-4,-1,0,3,10};
		sortedSquares(a);

	}

	private static void sortedSquares(int[] a) {
		
		for (int i = 0; i < a.length; i++) a[i] *= a[i]; 
		Arrays.sort(a);
		
	}

}
