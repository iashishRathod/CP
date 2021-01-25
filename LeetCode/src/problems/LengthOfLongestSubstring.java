package problems;


public class LengthOfLongestSubstring {

	public static void main(String[] args) {
		
		String s = "pwwkew";
		System.out.print(lengthOfLongestSubstring(s));

	}

	private static int lengthOfLongestSubstring(String s) {
		if(s.isEmpty()) return 0;
		int length = 1;
		int charCount[] = new int[256];
		charCount[s.charAt(0)]++;
		int i = 0,j = 0;
		while(j != s.length()-1){
			if(charCount[s.charAt(j+1)] == 0){
				j++;
				charCount[s.charAt(j)]++;
				length	= Math.max(length, j-i+1);
			}else{
				charCount[s.charAt(i)]--;
				i++;
			}
		}
		return length;
	}
}
