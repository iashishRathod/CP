package problems;


public class FindJudge {

	public static void main(String[] args) {

		int[][] trust = {{1,3},{2,3},{4,3}};
		int N = 4;

		if(trust.length<  N-1){
			System.out.print(-1);
		}

		int [] key = new int[N+1];
		int [] value =new int[N+1];
		for(int[] relation :trust){
			value[relation[0]]++;
			key[relation[1]]++;
		}
		for (int i = 1; i <= N; i++) {
			if (key[i] == N - 1 && value[i] == 0) {
				System.out.print(i);
			}
		}
		System.out.print(-1);
	}
}
