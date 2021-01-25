package problems;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class CombinationSum {

	public static void main(String[] args) {
		
		int[] candidates = {2,3,5};
		int target = 8;
		
		combinationSum(candidates,target);
		
	}

	private static List<List<Integer>> combinationSum(int[] candidates, int target) {
		Arrays.sort(candidates);
		List<List<Integer>> result = new ArrayList<>();
		dfs(result,0,candidates,target,new ArrayList<Integer>());
		return result;
	}

	private static void dfs(List<List<Integer>> result, int index, int[] candidates, int target,
			List<Integer> list) {
		
		if(target > 0) {
			for (int i = index; i < candidates.length && target >= candidates[i]; i++) {
				list.add(candidates[i]);
				dfs(result, i, candidates, target-candidates[i], list);
				list.remove(list.size()-1);
			}
		}else if(target == 0) {
			result.add(new ArrayList<>(list));
		}
	}
}
