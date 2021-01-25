package problems;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class FindDiagonalOrder1 {

	public static void main(String[] args) {

		/*	System.out.println(findDiagonalOrder(new int [][] {
			{1,2,3},
			{4,5,6},
			{7,8,9}
		}));*/

		System.out.println(findDiagonalOrder(new int [][] {
			{2,5,8},
			{4,0,-1}
		}));
	}

	private static int[] findDiagonalOrder(int[][] matrix) {

		if(matrix.length == 0) return new int[1];

		Map<Integer,List<Integer>> map = new HashMap<>();

		int maxKey = 0 , count = 0;;

		for(int row = matrix.length - 1 ; row >= 0 ; row--) {

			for(int col = 0 ; col < matrix[row].length ; col++) {

				int key = col + row;

				map.putIfAbsent(key, new ArrayList<>());
				map.get(key).add(matrix[row][col]);

				maxKey = Math.max(maxKey, key);
				count++;
			}
		}

		int ans[] = new int[count];
		int tmp = 0;
		for(int i = 0 ; i <= maxKey ; i++) {

			List<Integer> valueList = map.get(i);

			if(valueList == null) continue;

			if((i + 1) % 2 ==0) Collections.reverse(valueList);

			for(int v : valueList) ans[tmp++] = v;
		}

		return ans;
	}

}
