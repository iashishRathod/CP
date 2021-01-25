package problems;

import java.util.ArrayList;
import java.util.List;

public class CombinationSum3 {

	public static void main(String[] args) {
		
		System.out.println(combinationSum3(3,9));

	}

	private static List<List<Integer>> combinationSum3(int k, int n) {
		List<List<Integer>> result = new ArrayList<>();
		dfs(result, 1, k,n, new ArrayList<>());
		return result;
	}
	
	private static void dfs(List<List<Integer>> result, int index, int k,int target,
			List<Integer> list) {

		if(list.size() == k && target == 0) {
			result.add(new ArrayList<>(list));
			return;
		}
		for (int i = index; i <=9; i++) {
			list.add(i);
			dfs(result, i+1, k, target-i, list);
			list.remove(list.size()-1);
		}
	}
}
