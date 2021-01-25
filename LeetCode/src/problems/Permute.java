package problems;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Permute {

	public static void main(String[] args) {
		
		System.out.println(permute(new int[] {1,2,3}).toString());

	}

	private static List<List<Integer>> permute(int[] nums) {
		List<List<Integer>> result = new ArrayList<>();
		if(nums.length == 0) return result ;
		if(nums.length == 1) {
			result.add(Arrays.asList(nums[0]));
			return result;
		}
		boolean visited[] = new boolean[nums.length];
		dfs(nums,result,visited,new ArrayList<>());
		
		return result;
	}

	private static void dfs(int[] nums, List<List<Integer>> result, boolean[] visited, List<Integer> tmp) {
		
		if(tmp.size() == nums.length) {
			result.add(new ArrayList<>(tmp));
			return;
		}
		
		for(int i = 0 ; i < nums.length ; i++) {
			if(visited[i]) continue;
			tmp.add(nums[i]);
			visited[i] = true;
			dfs(nums, result, visited, tmp);
			visited[i] = false;
			tmp.remove(tmp.size() - 1);
		}
	}

}
