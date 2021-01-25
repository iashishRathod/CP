package problems;

import java.util.ArrayList;
import java.util.List;

public class SplitIntoFibonacci {

	public static void main(String[] args) {
		
		System.out.println(splitIntoFibonacci("123456579"));
	}

	private static List<Integer> splitIntoFibonacci(String s) {
		List<Integer> res = new ArrayList<>();
		dfs(s,res,0);
		return res;
	}

	private static boolean dfs(String s, List<Integer> res, int pos) {
		
		if(pos == s.length()) {
			return res.size() > 2;
		}
		
		int num = 0;
		
		for(int i = pos ; i < s.length() ; i++) {
			
			num = num * 10 + (s.charAt(i) - '0');
			
			if(num < 0) return false;
			
			if(res.size() < 2 || res.get(res.size() - 1) + res.get(res.size() - 2) == num) {
				res.add(num);
				if(dfs(s, res, i + 1)) return true;
				res.remove(res.size() - 1);
			}
			
			if(i == pos && s.charAt(i) == '0') return false;
		}
		return false;
	}

}
