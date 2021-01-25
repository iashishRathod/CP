package problems;

public class FindTheDifference {

	public static void main(String[] args) {
		
		System.out.println(findTheDifference("a","aa"));

	}

	private static char findTheDifference(String s, String t) {
		int i = 0;
		char c = t.charAt(t.length()-1);
		while(i < t.length()-1) {
			c ^= s.charAt(i);
			c ^= t.charAt(i);
			i++;
		}
		return c;
	}

}
