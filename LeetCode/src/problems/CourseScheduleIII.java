package problems;

import java.util.Arrays;
import java.util.PriorityQueue;
import java.util.Queue;

public class CourseScheduleIII {

	public static void main(String[] args) {

		System.out.println(scheduleCourse(new int [][] {
			{100, 200},
			{200,1300},
			{1000, 1250},
			{2000, 3200}
		}));

		System.out.println(scheduleCourse(new int [][] {
			{5, 5},
			{4,6},
			{2, 6}

		}));

	}

	private static int scheduleCourse(int[][] courses) {

		if(courses.length == 0 ) return 0;

		Queue<Integer> pqueue = new PriorityQueue<>((a,b) -> b - a);

		Arrays.sort(courses, (a, b) -> Integer.compare(a[1], b[1]));

		int totalTime = 0;

		for (int[] course : courses) {
			totalTime += course[0];
			pqueue.offer(course[0]);
			if (totalTime > course[1]) {
				totalTime -= pqueue.poll();
			}
		}

		return pqueue.size();
	}

}
