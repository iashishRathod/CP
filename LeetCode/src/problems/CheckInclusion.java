package problems;

public class CheckInclusion {

	public static void main(String[] args) {

		String s1 = "ab",s2 = "eidboaoo";

		System.out.print(checkInclusion(s1,s2));

	}

	private static boolean checkInclusion(String s1, String s2) {

		int[] char_counts = new int[26];

		for(char chara :s1.toCharArray())
			char_counts[chara - 'a']++;

		int left = 0,right = 0,count = s1.length();

		while(right < s2.length()){

			if(char_counts[s2.charAt(right++) - 'a']-- >=1) count--;

			if(count == 0) return true;

			if(right - left == s1.length() && char_counts[s2.charAt(left++) - 'a']++ >=0) count++;

		}
		return false;
	}
}