package problems;

public class MaxPower {

	public static void main(String[] args) {
		
		System.out.println(maxPower("hooraaaaaaaaaaay"));
		System.out.println(maxPower("tourist"));
		System.out.println(maxPower("triplepillooooow"));
		System.out.println(maxPower("abbcccddddeeeeedcba"));
		System.out.println(maxPower("leetcode"));

	}

	private static int maxPower(String s) {
		if(s.length() == 0 || (s = s.trim()).length() == 0) return 0;
		int maxPower = 1;
		int start = 0,next = 1;
		int curr = 1;
		
		while(next < s.length()) {
			
			if(s.charAt(start) == s.charAt(next)) {
				curr++;
			}
			else {
				
				maxPower = Math.max(maxPower, curr);
				start = next;
				curr = 1;
			}
			next++;
		}
		
		return Math.max(maxPower, curr);
	}

}
