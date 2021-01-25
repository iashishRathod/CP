package problems;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class NumsSameConsecDiff {

	public static void main(String[] args) {

		System.out.println(numsSameConsecDiff(3,7));
		System.out.println(optimized(2,0));

	}

	private static int[] optimized(int n, int k) {

		Set<Integer> result = new HashSet<>();
		
		for(int i = 1; i <= 9 ; i++) {
			dfs(i , n - 1 , k , result , i , i);
		}

		return result.stream().mapToInt(i->i).toArray();
	}

	private static void dfs(int num, int length, int k, Set<Integer> list, int sum, int prev) {

		if(length == 0 ) {
			list.add(sum);
			return;
		}
		int num1 = prev + k;
		if(num1 >= 0 && num1 <= 9) {
			dfs(num, length - 1, k, list, sum * 10 + num1, num1 );
		}

		int num2 = prev-k;
		if(num2 >= 0 && num2 <= 9) 	{
			dfs(num, length - 1, k, list, sum * 10 + num2 , num2);
		}

	}


	private static int[] numsSameConsecDiff(int n, int k) {

		List<Integer> result = new ArrayList<>(Arrays.asList(0,1,2,3,4,5,6,7,8,9));

		for(int i = 2; i <= n ; i++) {

			List<Integer> cur = new ArrayList<>();

			for(int x : result) {

				int lastDigit = x % 10;

				if(x > 0 && lastDigit + k  < 10) cur.add(x * 10 + lastDigit + k);
				if(x > 0 && k > 0 && lastDigit - k >= 0 ) cur.add(x * 10 + lastDigit - k);

			}

			result = cur;
		}



		return result.stream().mapToInt(i -> i).toArray();
	}

}
