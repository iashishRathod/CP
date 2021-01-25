package problems;

import java.util.Arrays;
import java.util.Comparator;

public class FindMinArrowShots {

	public static void main(String[] args) {

		System.out.println(findMinArrowShots(new int[][] {{10,16},{2,8},{1,6},{7,12}}));
		System.out.println(findMinArrowShots(new int[][] {{1,2},{3,4},{5,6},{7,8}}));
		System.out.println(findMinArrowShots(new int[][] {{1,2},{2,3},{3,4},{4,5}}));
		System.out.println(findMinArrowShots(new int[][] {{1,2}}));
		System.out.println(findMinArrowShots(new int[][] {{2,3},{2,3}}));
	}

	private static int findMinArrowShots(int[][] points) {

		if(points.length == 0) return 0;

		Arrays.sort(points, Comparator.comparing(a -> a[0]));

		int count  = 1;
		int x = Integer.MAX_VALUE;

		for (int[] point : points) {

			if(point[0] > x) {
				count++; 
				x = point[1];
			}
			else x = Math.min(x, point[1]);

		}

		return count;
	}

}
