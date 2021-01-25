package problems;

public class ReachNumber {

	public static void main(String[] args) {
		
		System.out.println(reachNumber(2));
		System.out.println(reachNumber(6));

	}

	private static int reachNumber(int target) {
		
		if(target == 0) return 0;
		
		int steps = 0,sum = 0;
		
		target = Math.abs(target);
		
		while(sum < target) {
			sum += steps;
			steps++;
		}
		
		while((sum - target) % 2 == 1) {
			sum += steps;
			steps++;
		}
		
		return steps - 1;
	}

}
