package problems;

public class LengthOfLastWord {

	public static void main(String[] args) {

		System.out.println(lengthOfLastWord("Hello"));
	}

	private static int lengthOfLastWord(String s) {
		
		if(s.length() == 0) return 0;
        
        String[] words = s.split(" ");
        
        return words.length == 0 ? 0 : words[words.length-1].length();
	}

}
