package problems;

public class CheckPerfectNumber {

	public static void main(String[] args) {

		System.out.println(checkPerfectNumber(28));
	}

	private static boolean checkPerfectNumber(int num) {
		int result = 1;
		int i = 1;
		while(i <= Math.sqrt(num)) {

			if (num%i==0) { 
				if (num/i == i) result += i;
				else {
					result += i;
					result += num/i;
				}
			}
		}
		return result == num ? true :false;
	}
}