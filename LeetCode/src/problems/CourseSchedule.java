package problems;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Queue;

public class CourseSchedule {

	public static void main(String[] args) {
		
		System.out.println(canFinish(2, new int [][] {
			{1,0}
		}));
		
		System.out.println(canFinish(2, new int [][] {
			{1,0},
			{0,1}
		}));
		
		System.out.println(canFinish(3, new int [][] {
			{2,0},
			{2,1}
		}));
	}

	private static boolean canFinish(int numCourses, int[][] prerequisites) {
		
		Map<Integer,List<Integer>> graph = new HashMap<>();
		
		int[] indegree = new int[numCourses];
		
		buildMap(graph, prerequisites,indegree);
		
		Queue<Integer> queue = new LinkedList<>();
		
		for(int v = 0 ; v < indegree.length ; v++) {
			if(indegree[v] == 0) queue.add(v);
		}
		
		if(queue.isEmpty()) return false;
		
		int count = 0;
		
		while(!queue.isEmpty()) {
			
			count++;
			
			List<Integer> valuList = graph.get(queue.poll());
			
			if(valuList == null) continue;
			
			for(int i : valuList) {
				if (--indegree[i] == 0) queue.add(i); 
			}
		}
		
		return count == numCourses;
	}

	private static void buildMap(Map<Integer, List<Integer>> graph, int[][] prerequisites, int[] indegree) {
		
		for(int[] pre :prerequisites ) {
			
			graph.putIfAbsent(pre[0], new ArrayList<>());
			graph.get(pre[0]).add(pre[1]);
			indegree[pre[1]]++;
		}
		
	}

}
