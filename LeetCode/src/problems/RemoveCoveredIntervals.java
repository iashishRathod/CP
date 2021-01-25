package problems;

import java.util.Arrays;

public class RemoveCoveredIntervals {

	public static void main(String[] args) {
		
		int[][] intervals = {
				{1,4},{2,3}
		};
		
		System.out.println(removeCoveredIntervals(intervals)); //(nlog(n))

	}

	private static int removeCoveredIntervals(int[][] intervals) {
		Arrays.sort(intervals, (a,b) -> a[0] - b[0]);
		int result = 0;
		int[] curr = {-1,-1};
		
		for (int[] interval : intervals) {
			
			if(interval[0] > curr[0] && interval[1] > curr[1]) {
				result++;
				curr[0] = interval[0];
			}
			curr[1] = Math.max(interval[1], curr[1]);
		}
		
		return result;
	}

}
