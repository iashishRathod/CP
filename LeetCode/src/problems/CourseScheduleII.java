package problems;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Queue;

public class CourseScheduleII {

	public static void main(String[] args) {

		System.out.println(findOrder(2, new int [][] {
			{1,0}
		}));
		
		System.out.println(findOrder(4, new int [][] {
			{1,0},
			{2,0},
			{3,1},
			{3,2}
		}));


	}

	private static int[] findOrder(int numCourses, int[][] prerequisites) {

		Map<Integer,List<Integer>> graph = new HashMap<>();

		int[] indegree = new int[numCourses];

		buildMap(graph, prerequisites,indegree);

		Queue<Integer> queue = new LinkedList<>();

		for(int v = 0 ; v < indegree.length ; v++) {
			if(indegree[v] == 0) queue.add(v);
		}
		
		int[] res = {};

		if(queue.isEmpty()) return res;
		
		res = new int[numCourses];
		
		int count = 0;
		
		while(!queue.isEmpty()) {
			
			int u = queue.poll();
			
			res[count++]  = u;
			
			List<Integer> valueList = graph.get(u);
			
			if(valueList == null) continue;
			
			for(int i : valueList) { 
				if(--indegree[i] == 0 ) queue.add(i);
			}
		}
		
		if(count != numCourses) {
			int[] res1 = {};
			return res1;
		}
		
		return res;
	}

	private static void buildMap(Map<Integer, List<Integer>> graph, int[][] prerequisites, int[] indegree) {

		for(int[] pre :prerequisites ) {

			graph.putIfAbsent(pre[1], new ArrayList<>());
			graph.get(pre[1]).add(pre[0]);
			indegree[pre[0]]++;
		}

	}

}
