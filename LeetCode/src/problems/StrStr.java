package problems;

public class StrStr {

	public static void main(String[] args) {
		
		String haystack ="mississippi",needle="issip";
		
		System.out.print(strStr(haystack,needle));

	}

	private static int strStr(String haystack, String needle) {
		
		if(needle.length() == 0) return 0;
		
		if(haystack.indexOf(needle) != -1) {
			return haystack.indexOf(needle);
		}
		
		return -1;
	}
}
