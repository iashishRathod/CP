package problems;

public class LongestCommonPrefix {

	public static void main(String[] args) {
		
		String[] strs = {"flower","flow","flight"};
		
		System.out.print(longestCommonPrefix(strs));

	}

	private static String longestCommonPrefix(String[] strs) {
		
		//1.take first string 
		//2.run a loop and check the common prefix
		
		if(strs.length == 0) return "";
		String str = strs[0];
		for (int i = 1; i < strs.length; i++) {
			while(strs[i].indexOf(str)!=0) str = str.substring(0, str.length()-1);
		}
		
		return str;
	}

}
