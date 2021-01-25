package problems;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Combine {

	public static void main(String[] args) {
		System.out.println(combine(4, 2).toString());
	}

	private static List<List<Integer>> combine(int n, int k) {
		
		List<List<Integer>> result = new ArrayList<>();
		
		if(k == 1 && n == 1) {
			result.add(Arrays.asList(1));
			return result;
		}
		
		dfs(n,k,result,new ArrayList<>(),1);
		return result;
	}

	private static void dfs(int n, int k, List<List<Integer>> result, List<Integer> tmp, int index) {
		
		if(tmp.size() == k) {
			result.add(new ArrayList<>(tmp));
			return;
		}
		
		for(int i = index ; i <= n - (k - tmp.size()) + 1 ; i++) {
			tmp.add(i);
			dfs(n, k, result, tmp,i + 1);
			tmp.remove(tmp.size() - 1);
		}
	}

}
