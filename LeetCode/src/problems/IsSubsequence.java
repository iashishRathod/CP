package problems;

public class IsSubsequence {

	public static void main(String[] args) {
		
		String s = "aaaaaa", t ="bbaaaa";
		
		System.out.print(isSubsequence(s,t));

	}

	private static boolean isSubsequence(String s, String t) {
		for (int i = 0;i<s.length();i++) {
			int index = t.indexOf(s.charAt(i));
			if(index < 0) return false;
			t = t.substring(index+1);
		}
		return true;
	}
}
