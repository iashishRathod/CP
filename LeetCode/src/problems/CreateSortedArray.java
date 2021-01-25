package problems;

import java.util.ArrayList;
import java.util.List;

public class CreateSortedArray {

	public static void main(String[] args) {

		System.out.println(createSortedArray(new int[] {1,2,3,6,5,4}));

	}

	private static int createSortedArray(int[] instructions) {

		if(instructions.length <= 2) return 0;

		List<Integer> list = new ArrayList<>();
		long cost = 0;

		for(int i = 0 ; i < instructions.length ; i++) {

			cost += getCost(instructions[i] , list);
			cost %= 1000000007;

		}

		return (int)cost;
	}

	private static int getCost(int num, List<Integer> list) {

		int front = 0 , back = 0 , start = 0 , end = list.size();

		while(start < end) {

			int mid = start + (end - start)/2;

			if(list.get(mid) >= num) {

				end = mid;
			}
			else {
				start = mid + 1;
			}
		}

		front = start;

		start = 0 ; end = list.size();

		while(start < end) {

			int mid = start + (end - start)/2;

			if(list.get(mid) > num) {

				end = mid;
			}
			else {
				start = mid + 1;
			}
		}

		back = start;

		int costF = front;
		int costB = list.size() - back;

		list.add(front, num);
		return Math.min(costF, costB);
	}

}
