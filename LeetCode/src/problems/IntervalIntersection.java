package problems;

import java.util.ArrayList;
import java.util.List;

public class IntervalIntersection {

	public static void main(String[] args) {

		int[][] A = {
				{0,2},
				{5,10},
				{13,23},
				{24,25}
				};
		
		int[][] B = {
				{1,5},
				{8,12},
				{15,24},
				{25,26}
				};

		int[][] result = intervalIntersection(A,B);


		for (int i = 0; i < result.length; i++) {
			for (int j = 0; j < result.length; j++)
				System.out.println(result[i][j]);
		}
	}

	private static int[][] intervalIntersection(int[][] A, int[][] B) {
		
		List<Integer> result = new ArrayList<>();
		
		for (int i = 0; i < B.length; i++) {
			for (int j = 0; j < B.length; j++){
				
				
				
				
			}
		}
		return (int[][]) result.toArray();
	}
}
