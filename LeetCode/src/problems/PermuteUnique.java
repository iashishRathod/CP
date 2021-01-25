package problems;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class PermuteUnique {

	public static void main(String[] args) {
		System.out.println(permuteUnique(new int[] {1,1,2}).toString());
	}

	private static List<List<Integer>> permuteUnique(int[] nums) {
		List<List<Integer>> result = new ArrayList<>();
		if(nums.length == 0) return result ;
			if(nums.length == 1) {
			result.add(Arrays.asList(nums[0]));
			return result;
		}
		boolean visited[] = new boolean[nums.length];
		dfs(nums,result,visited,new ArrayList<>());
		return new ArrayList<>(result);
	}

	private static void dfs(int[] nums, List<List<Integer>> result, boolean[] visited, List<Integer> tmp) {
		
		if(nums.length == tmp.size()) {
			result.add(new ArrayList<>(tmp));
			return;
		}
		
		for(int i = 0 ; i < nums.length ; i++ ) {
			if(visited[i] || (i > 0 && nums[i] == nums[i-1] && !visited[i - 1])) continue;
			tmp.add(nums[i]);
			visited[i] = true;
			dfs(nums, result, visited, tmp);
			tmp.remove(tmp.size() - 1);
			visited[i] = false;
		}
	}

}
