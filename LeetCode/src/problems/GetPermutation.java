package problems;

public class GetPermutation {

	public static void main(String[] args) {

		int n = 3,k=3;

		System.out.print(getPermutation(n,k));

	}

	private static String getPermutation(int n, int k) {
		if (n == 1) return "1";

		int num = fact(n - 1);

		int first = (k - 1)/num + 1;

		String next = getPermutation(n - 1, k - (first - 1)*num);
		StringBuilder ans = new StringBuilder();
		ans.append(first);

		for (int i = 0; i < next.length(); i++) {
			if (next.charAt(i) - '0' >= first) {
				ans.append((char) (next.charAt(i) + 1));
			} else {
				ans.append(next.charAt(i));
			}
		}

		return ans.toString();
	}


	public static int fact(int n) {
		if (n == 1) return 1;
		return n*fact(n - 1);
	}
}
