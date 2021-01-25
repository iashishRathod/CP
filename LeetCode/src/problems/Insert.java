package problems;

import java.util.ArrayList;
import java.util.List;

public class Insert {

	public static void main(String[] args) {
		
		int[][] intervals = {{1,2},{3,5},{6,7},{8,10},{12,16}};
		int[] newInterval = {4,8};
		
		insert(intervals,newInterval);
	}

	private static int[][] insert(int[][] intervals, int[] newInterval) {
		
		List<int[]> result = new ArrayList<>();
		int index = 0;
		
		while(index < intervals.length && intervals[index][1] < newInterval[0]) result.add(intervals[index++]);
		
		int start = (index < intervals.length) ? Math.min(newInterval[0] ,intervals[index][0]) : newInterval[0];
        int end = newInterval[1];
		while(index < intervals.length && intervals[index][0] <= newInterval[1]) {
			end = Math.max(intervals[index++][1], end) ;
		}
		
		int[] interval = new int[2];
		interval[0] = start;
		interval[1] = end;
		
		result.add(interval);
		
		while(index < intervals.length) result.add(intervals[index++]);
		
		return result.toArray(new int[result.size()][2]);
	}

}
