package problems;

public class GetHint {

	public static void main(String[] args) {
		
		System.out.println(getHint("1122","1222"));

	}

	private static String getHint(String secret, String guess) {
		int bulls = 0;
		int cows = 0;
		int[] map = new int[10];
		int i = 0;
		while (i < guess.length()) {
			int s = Character.getNumericValue(secret.charAt(i));
			int g = Character.getNumericValue(guess.charAt(i));
			if(s == g) bulls++;
			else {
				if (map[s] < 0) cows++;
				if (map[g] > 0) cows++;
				map[s] ++;
				map[g] --;
			}
			i++;
		}
		return new StringBuilder().append(bulls).append("A").append(cows).append("B").toString();
	}

}
