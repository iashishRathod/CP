package problems;

public class IsPerfectSquare {

	public static void main(String[] args) {

		int n = 81;
		 
		System.out.print(checkPerfectSquare(n));
	}

	private static boolean checkPerfectSquare(int n) {

		if  (n  <=  0)
			return false;
		if  (n  ==  1)
			return true;
		long l = 1;
		long  r = n;
		while (l <= r) {
			long  mid = l + (r - l )/2;
			long  square  =  mid * mid;
			if (square == n) {
				return true;
			} else if (square > n) {
				r = mid - 1;
			} else {
				l = mid + 1;
			}
		}
		return false;
	}
}
