package problems;


public class MaxSubarraySumCircular {

	public static void main(String[] args) {

		int a[] = {-2,-3,-1};
		int total = 0,max_ending_at = 0,min_ending_at=0,min_sum = Integer.MAX_VALUE,max_sum = Integer.MIN_VALUE;

		for(int x:a){

			total += x;
			max_ending_at = Math.max(max_ending_at + x,x);
			max_sum       = Math.max(max_ending_at,max_sum);
			min_ending_at = Math.min(min_ending_at + x,x);
			min_sum       = Math.min(min_ending_at,min_sum);
		}

		if(max_sum > 0)
			System.out.print(Math.max(max_sum,total - min_sum));

		System.out.print(max_sum);
	}

}
