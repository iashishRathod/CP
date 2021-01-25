package problems;

public class CountArrangement {

	static int count = 0;
	public static void main(String[] args) {

		System.out.println(countArrangement(3));
	}

	private static int countArrangement(int num) {
		dfs(num,new boolean[num+1],1);
		return count;
	}

	private static void dfs(int num, boolean[] visited, int index) {
		
		if(index > num) count++;
		
		for (int i = 1; i <= num; i++) {
			if(!visited[i] && (index % i == 0 ||i % index == 0)){
				visited[i] = true;
				dfs(num, visited, index + 1);
				visited[i] = false;
			}
		}
	}
}
