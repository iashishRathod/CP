package problems;

import java.util.Arrays;

public class BagOfTokensScore {

	public static void main(String[] args) {
		
		System.out.println(bagOfTokensScore(new int[] {100},50));

	}

	private static int bagOfTokensScore(int[] tokens, int p) {
		
		Arrays.sort(tokens);
		
		int start = 0,end = tokens.length -1;
		int score = 0,maxScore = 0;
		
		while(start <= end) {
			
			if(p >= tokens[start]) {
				 
				p -= tokens[start++];
				score++;
				maxScore = Math.max(score,maxScore);
			}
			else if(score > 0) {
				
				p += tokens[end--];
				score--;
			}
			else break;
		}
		
		return maxScore;
	}

}
