package problems;

public class PalindromicSubstrings {

	public static void main(String[] args) {

		System.out.println(countSubstrings("aaa"));
	}

	public static int countSubstrings(String s) {

		if(s.length() == 1) return 1;
		int result = 0;

		for(int index = 0 ; index < s.length() ; index++){

			result += findPalindrom(s,index , index);
			result += findPalindrom(s,index , index + 1);
		}

		return result;
	}

	public static int findPalindrom(String s, int start , int end){

		int temp = 0;

		while(start >= 0 && end < s.length() && s.charAt(start) == s.charAt(end)){
			start--;
			end++;
			temp++;
		}

		return temp;
	}

}
