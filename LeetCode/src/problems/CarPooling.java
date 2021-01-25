package problems;

public class CarPooling {

	public static void main(String[] args) {

		int[][] trips = {{3,2,7},{3,7,9},{8,3,9}};

		System.out.println(carPooling(trips,11));

	}

	private static boolean carPooling(int[][] trips, int capacity) {

		int[] values = new int[1001];

		for (int[] t : trips) {
			values[t[1]] += t[0];
			values[t[2]] -= t[0];
		}

		for (int i : values) {
			if((capacity= capacity - i) < 0) return false;
		}

		return true;
	}

}
