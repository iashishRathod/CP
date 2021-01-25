package contest;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class CountGoodMeals {

	public static void main(String[] args) {
		
		System.out.println(countPairs(new int[] {1,3,5,7,9}));
		System.out.println(optimized(new int[] {1,1,1,3,3,3,7}));

	}
	
	public static int optimized(int[] deliciousness) {
		
		int result = 0;
		
		int MOD=1000000007;
		
		Map<Integer, Integer> map = new HashMap<>();
		
		for(int i=0; i<deliciousness.length; i++){
		
			for(int j=0; j<22; j++){
			
				int key = (int)Math.pow(2, j);
				int value = key - deliciousness[i];
				
				result = (result + map.getOrDefault(value, 0))%MOD;
			}
			
			map.put(deliciousness[i], map.getOrDefault(deliciousness[i], 0)+1);
		}
		
		return result;
	}
	
	
	
	static int count;

	private static int countPairs(int[] deliciousness) {
		count = 0;
		dfs(deliciousness, new ArrayList<>(), 0);
		return count;
	}

	private static void dfs(int[] deliciousness, List<Integer> temp, int index) {
		
		if(temp.size() == 2) {
			count++;
			return;
		}
		
		for(int i = index ; i < deliciousness.length ; i++) {
			int sum;
			if(temp.isEmpty() || ((sum = temp.get(temp.size() - 1) + deliciousness[i]) != 0 && ((sum & (sum - 1)) == 0))) {

				temp.add(deliciousness[i]);
				dfs(deliciousness, temp, i + 1);
				temp.remove(temp.size() - 1);
			}
		}
	}

}
