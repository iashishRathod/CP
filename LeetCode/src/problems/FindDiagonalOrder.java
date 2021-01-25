package problems;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class FindDiagonalOrder {

	public static void main(String[] args) {
		
		List<List<Integer>> list = new ArrayList<>();
		
		list.add(Arrays.asList(1,2,3,4,5));
		list.add(Arrays.asList(6,7));
		list.add(Arrays.asList(8));
		list.add(Arrays.asList(9,10,11));
		list.add(Arrays.asList(12,13,14,15,16));
		
		System.out.println(findDiagonalOrder(list));

	}

	private static int[] findDiagonalOrder(List<List<Integer>> nums) {
		
		Map<Integer,List<Integer>> map = new HashMap<>();
		
		int maxKey = 0 , count = 0;;
		
		for(int row = nums.size() - 1 ; row >= 0 ; row--) {
			
			for(int col = 0 ; col < nums.get(row).size() ; col++) {
				
				int key = col + row;
				
				map.putIfAbsent(key, new ArrayList<>());
				map.get(key).add(nums.get(row).get(col));
				
				maxKey = Math.max(maxKey, key);
				count++;
			}
		}
		
		int ans[] = new int[count];
		int tmp = 0;
		for(int i = 0 ; i <= maxKey ; i++) {
			
			List<Integer> valueList = map.get(i);
			
			if(valueList == null) continue;
			
			for(int v : valueList) ans[tmp++] = v;
		}
		
		return ans;
	}

}
