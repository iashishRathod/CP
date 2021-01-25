package problems;

public class GuessNumber {

	public static void main(String[] args) {
		
		int n = 10;
		System.out.print(guessNumber(n));

	}

	private static int  guessNumber(int n) {
		int left = 1;
		while(left < n) {
			int mid = left + (n-left)/2;
			int res = guess(mid);
			if(res == 1)  left = mid +1;
			else if(res == -1) n = mid;
			else return mid;
		}
		return left;
	}

	private static int guess(int num) {
		
		int pick = 6;
		
		if(pick > num) return 1;
		if(pick < num) return -1;
		return 0;
	}
}
