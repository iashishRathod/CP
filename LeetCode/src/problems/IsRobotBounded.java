package problems;

public class IsRobotBounded {

	public static void main(String[] args) {
		
		System.out.println(isRobotBounded("GGLLGG"));

	}

	private static boolean isRobotBounded(String instructions) {
		
		int x = 0,y = 0 , currPoint = 0 , dp[][] = {{0,1},{1,0},{0,-1},{-1,0}};
		
		for (int i = 0; i < instructions.length(); ++i) {
			
			if(instructions.charAt(i) == 'L') currPoint = (currPoint+1) % 4;
			else if(instructions.charAt(i) == 'R') currPoint = (currPoint + 3) % 4;
			
			else {
				 x += dp[currPoint][0];
				 y += dp[currPoint][1];
			}
		}
		return (x == y && x == 0) || currPoint > 0;
	}

}
