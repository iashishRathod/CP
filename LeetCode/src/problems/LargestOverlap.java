package problems;

public class LargestOverlap {

	public static void main(String[] args) {
		
		int[][] a = {
				{1,1,0},
				{0,1,0},
				{0,1,0}
		};
		int[][] b = {
				{0,0,0},
				{0,1,1},
				{0,0,1}
		};
		
		System.out.println(largestOverlap(a,b));

	}

	private static int largestOverlap(int[][] a, int[][] b) {
		return Math.max(overlapCount(a,b), overlapCount(b,a));
	}

	private static int overlapCount(int[][] a, int[][] b) {
		int length = a.length;
		int count = 0;
		for (int x = 0; x < length; x++) {
			for (int y = 0; y < length; y++) {
				int tempCount = 0;
				for (int i = y; i < length; i++) {
					for (int j = x; j < length; j++) {
						if(a[i][j] == 1 && b[i-y][j-x] == 1) tempCount++;
					}
				}
				count = Math.max(tempCount, count);
			}
		}
		return count;
	}

}
