package problems;

public class RepeatedSubstringPattern {

	public static void main(String[] args) {
		
		System.out.println(repeatedSubstringPattern("aba"));

	}

	private static boolean repeatedSubstringPattern(String s) {
		int length = s.length();
		if(s.length() <=1) return false;

		for (int i = s.length()/2; i < s.toCharArray().length; i++) {
			if(length % i != 0 ) continue;
			String sub = s.substring(0, i);
			return dfs(s,sub,i,length);
		}
		return false;
	}

	private static boolean dfs(String s, String sub, int i, int length) {
		if(i == length) return true;
		if(!s.startsWith(sub, i)) return false;
		return dfs(s, sub, i+sub.length(), length);
	}
}
