package problems;

import java.util.LinkedList;
import java.util.Queue;

public class NumberOfStudentsUnableToEatLunch {

	public static void main(String[] args) {
		
		System.out.println(countStudents(new int[] {1,1,0,0}, new int [] {0,1,0,1})); // space - 0(n) ,Time O(n)
		System.out.println(optimized(new int[] {1,1,1,0,0,1}, new int [] {1,0,0,0,1,1})); // space - 0(1) ,Time O(n)

	}

	private static int optimized(int[] students, int[] sandwiches) {
		int ones = 0, zeros = 0;
		for (int i : students) {
			if (i==1) ones++;
			else zeros++;
		}

		//next scan the food
		for (int i : sandwiches) {
			if (i==1) {
				if (ones>0) ones--;
				else return ones+zeros;
			} 
			else {
				if (zeros>0) zeros--;
				else return ones+zeros;
			}
		}
		return 0;
	}

	private static int countStudents(int[] students, int[] sandwiches) {
		
		if(students.length == 0) return 0;
		if(sandwiches.length == 0) return students.length;
		
		Queue<Integer> queue = new LinkedList<>();
		
		for(int i = 0 ; i < students.length ; i++) {
			queue.add(students[i]);
		}
		
		int j = 0;
		
		while(!queue.isEmpty() && queue.contains(sandwiches[j])) {
			
			int value = queue.poll();
			
			if(value == sandwiches[j]) {
				j++;
				continue;
			}
			
			queue.add(value);
			
		}
		
		return queue.size();
	}

}
