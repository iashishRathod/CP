package problems;

import java.util.ArrayList;
import java.util.List;

public class LetterCombinations {

	public static void main(String[] args) {
		
		System.out.println(letterCombinations("23").toString());

	}

	private static List<String> letterCombinations(String digits) {
		List<String> result = new ArrayList<>();
		if(digits.length() == 0) return result;
		String[] map = new String[8];
		buildMap(map);
		dfs(digits,map,0,"",result);
		return result;
	}

	private static void dfs(String digits, String[] map, int index, String s, List<String> result) {

		if(digits.length() == index){
			result.add(new String(s));
			return;
		}

		for(int i = 0; i < map[digits.charAt(index) - '2'].length(); i++) {
			dfs(digits, map, index + 1, s + map[digits.charAt(index) - '2'].charAt(i), result);
		}
	}

	private static void buildMap(String[] map) {
		
		map[0] = "abc";
		map[1] = "def";
		map[2] = "ghi";
		map[3] = "jkl";
		map[4] = "mno";
		map[5] = "pqrs";
		map[6] = "stuv";
		map[7] = "wxyz";
		
	}

}
