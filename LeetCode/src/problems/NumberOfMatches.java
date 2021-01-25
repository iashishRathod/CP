package problems;

public class NumberOfMatches {

	public static void main(String[] args) {
		
		System.out.println(numberOfMatches(7));

	}

	private static int numberOfMatches(int n) {
		
		if(n == 1) return 0;
		int count = 0;
		while(n > 1) {
			
			if(n % 2 == 0) {
				count += n/2;
				n = n/2;
			}
			else {
				count += (n - 1)/2;
				n = (n - 1)/2;
				n++;
			}
		}
		return count;
	}

}
