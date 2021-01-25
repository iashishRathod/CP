package problems;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.PriorityQueue;

public class FindItinerary {
	
	static Map<String, PriorityQueue<String>> map;
	static LinkedList<String> resultList;

	public static void main(String[] args) {
		
		List<List<String>> tickets = new ArrayList<>();
		List<String> abc = new ArrayList<>();
		
		abc.add("MUC");abc.add("LHR");
		tickets.set(0, abc);
		abc.clear();
		abc.add("JFK");abc.add("MUC");
		tickets.set(1, abc);
		abc.clear();
		abc.add("SFO");abc.add("SJC");
		tickets.set(2, abc);
		abc.clear();
		abc.add("LHR");abc.add("SFO");
		tickets.set(3, abc);
		
		findItinerary(tickets);
	}

	private static LinkedList<String> findItinerary(List<List<String>> tickets) {

		map = new HashMap<>();

		for (List<String> list : tickets) {
			if(!map.containsKey(list.get(0))) map.put(list.get(0), new PriorityQueue<String>());
			map.get(list.get(0)).offer(list.get(1));
		}

		resultList = new LinkedList<>();

		dfs("JFK");
		return resultList;
	}

	private static void dfs(String dep) {
		
		PriorityQueue<String> arrivals = map.get(dep);
		
		while(null != arrivals && !arrivals.isEmpty()) dfs(arrivals.poll());
		
		resultList.addFirst(dep);
	}
	
	
}
