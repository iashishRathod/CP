package problems;

import java.util.HashMap;
import java.util.Map;

public class FourSum2 {

	public static void main(String[] args) {
		
		System.out.println(fourSum2(new int[] { 1, 2},new int[] {-2,-1},new int[] {-1, 2},new int[] {0, 2}));

	}

	private static int fourSum2(int[] A, int[] B, int[] C, int[] D) {
		int count = 0;
		
		if(A.length == 0) return count;
		
		Map<Integer,Integer> map = new HashMap<>();
		
		for(int a : A) {
			for(int b : B) {
				int sum = a + b;
				map.put(sum, map.getOrDefault(sum, 0) + 1);
			}
		}
		
		for (int c : C) {
			for(int d : D) {
				int sum = c + d;
				if(map.containsKey(-sum)) {
					count += map.get(-sum);
				}
			}
		}
		
		return count ;
		
	}

}
