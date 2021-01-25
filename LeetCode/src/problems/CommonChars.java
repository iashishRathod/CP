package problems;

import java.util.ArrayList;
import java.util.List;

public class CommonChars {

	public static void main(String[] args) {
		
		String[] A = {"cool","lock","cook"};
		List<String> result = commonChars(A); 
		for(String s : result) System.out.println(s);

	}

	private static List<String> commonChars(String[] A) {

		if(A.length == 0) return new ArrayList<>();

		List<String> parentList = new ArrayList<>();
		
		int charCount[] = new int[26];
		
		for (char c1 :  A[0].toCharArray()) charCount[c1 - 97]++;
		
		for (int i = 1; i < A.length; i++) charCount = getCharsCount(A[i],charCount);
		
		for (int i = 0; i < charCount.length; i++) {
			while(charCount[i]>0){
				parentList.add("" + (char)(i + 97));
				charCount[i]--;
			}
		}
		return parentList;
	}

	private static int[] getCharsCount(String str, int[] charCount) {
		
		int charCountUpdated[] = new int[26];
		
		for (int i = 0; i < str.length(); i++) {
			
			if(charCount[str.charAt(i) - 97] > 0){
				charCount[str.charAt(i) - 97]--;
				charCountUpdated[str.charAt(i) - 97]++;
			}
		}
		return charCountUpdated;
	}
}
