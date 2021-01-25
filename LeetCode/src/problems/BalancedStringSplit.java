package problems;

public class BalancedStringSplit {

	public static void main(String[] args) {
		
		String s = "RLRRRLLRLL";
		System.out.print(balancedStringSplit(s));
	}

	private static int balancedStringSplit(String s) {
		if(s.length()==0)return 0;
		int rCount = 0,lCount = 0,result = 0;
		for (char i : s.toCharArray()) {
			
			if(i == 'R') rCount++;
			if(i == 'L') lCount++;
			
			if(rCount == lCount) {
				result++;
				rCount = lCount = 0;
			}
		}
		return result;
	}
}
