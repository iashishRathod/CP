package problems;

import java.util.Arrays;
import java.util.Comparator;
import java.util.LinkedList;
import java.util.List;

public class ReconstructQueue {

	public static void main(String[] args) {
		
		int[][] people = {{7,0},{4,4},{7,1},{5,0},{6,1},{5,2}};
		
		 for (int[] is : reconstructQueue(people)) System.out.println(is[0]+" "+is[1]);

	}

	private static int[][] reconstructQueue(int[][] people) {


		//4,5,5,6,7,7
		//0,0,1,1,2,4

		//0 - 7,5
		//1 - 6,7
		//2 - 5
		//4 - 4

		//[5,0], [7,0], [5,2], [6,1], [4,4], [7,1]

		//
		Arrays.sort(people, new Comparator<int[]>() {
			@Override
			public int compare(int[] p1, int[] p2) {
				return p2[0] == p1[0] ? p1[1] - p2[1] : p2[0]-p1[0];
			}
		});

		List<int[]> resultList = new LinkedList<>();
		
		//[[7, 0], [7, 1], [6, 1], [5, 0], [5, 2], [4, 4]]
		
		for (int[] result : people){
			resultList.add(result[1], result);
		}
		
		return resultList.toArray(new int[people.length][2]);
		
	}

}
