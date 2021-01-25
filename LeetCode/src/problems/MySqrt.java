package problems;

public class MySqrt {

	public static void main(String[] args) {

		System.out.println(mySqrt(8));
	}

	private static int mySqrt(int x) {
		long r = x;
		while (r*r > x)
			r = (r + x/r) / 2;
		return (int) r;
	}

}
