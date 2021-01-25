package problems;

public class CountVowelStrings {

	public static void main(String[] args) {
		
		System.out.println(countVowelStrings(1));
		System.out.println(countVowelStrings(2));
		System.out.println(countVowelStrings(3));
		System.out.println(countVowelStrings(4));
		System.out.println(countVowelStrings(5));

	}
	static int count;
	private static int countVowelStrings(int n) {
		if(n == 1) return 5;
		count = 0;
		helper(n,1);
		return count;
	}
	private static void helper(int end, int start) {
		
		if( end == 0) {
			count++;
			return;
		}
		
		for(int i = start ; i <= 5 ; i++) {
			helper(end - 1 , i);
		}
	}

}

/*
5
15
35
70
126
*/