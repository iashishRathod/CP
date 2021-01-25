package problems;

public class DetectCapitalUse {

	public static void main(String[] args) {
		
		System.out.print(detectCapitalUse("Leetcode"));

	}

	private static boolean detectCapitalUse(String word) {
		int caps = 0;
		for (int i = 0; i<=word.length()-1;i++) {
			if(Character.isUpperCase(word.charAt(i))) caps++;
		}
		
		return caps == 0 || caps == word.length() || (caps == 1 && Character.isUpperCase(word.charAt(0)));
	}

}
