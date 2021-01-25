package problems;

public class FindPoisonedDuration {

	public static void main(String[] args) {
		
		System.out.println(findPoisonedDuration(new int[] {1,2},2));

	}

	private static int findPoisonedDuration(int[] timeSeries, int duration) {
		
		if(timeSeries.length == 0) return 0;
		int result = duration;
		for (int i = 1; i < timeSeries.length; i++) {
			result += Math.min(duration, timeSeries[i] - timeSeries[i-1]);
		}
		
		return result;
	}

}
