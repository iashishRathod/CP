package problems;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Queue;

public class JumpGameIV {

	public static void main(String[] args) {
		
		System.out.println(minJumps(new int[] {100,-23,-23,404,100,23,23,23,3,404}));

	}

	private static int minJumps(int[] nums) {
		
		if(nums.length == 1 ) return 0;
		
		Map<Integer,List<Integer>> map = new HashMap<>();
		
		buildMap(map,nums);
		
		Queue<Integer> queue = new ArrayDeque<>();
		boolean visited[] = new boolean[nums.length];
		int jump = 0;
		
		queue.add(0);
		visited[0] = true;
		
		while(!queue.isEmpty()) {
			
			int size = queue.size();
			
			for(int i = 0 ; i < size ; i++) {
				
				int index = queue.poll();
				
				if(index == nums.length - 1) return jump;
				
				int left = index - 1;
				int right = index + 1;
				
				if(left >= 0 && left < nums.length && !visited[left]) {
					queue.add(left);
					visited[left] = true;
				}
				
				if(right >= 0 && right < nums.length && !visited[right]) {
					queue.add(right);
					visited[right] = true;
				}
				
				if(map.containsKey(nums[index])){
					
					for(int num : map.get(nums[index])) {
						visited[num] = true;
						queue.add(num);
					}
					map.remove(nums[index]);
				}
			}
			
			jump++;
		}
		
		return jump;
	}

	private static void buildMap(Map<Integer, List<Integer>> map, int[] nums) {
		
		for(int i = 0 ; i < nums.length ; i++) {
			map.putIfAbsent(nums[i], new ArrayList<>());
			map.get(nums[i]).add(i);
		}
	}
}
