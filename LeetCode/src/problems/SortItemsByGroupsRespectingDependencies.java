package problems;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class SortItemsByGroupsRespectingDependencies {

	public static void main(String[] args) {
		
		List<List<Integer>> beforeItems = new ArrayList<>();
		
		beforeItems.add(new ArrayList<>());
		beforeItems.add(new ArrayList<>(Arrays.asList(6)));
		beforeItems.add(new ArrayList<>(Arrays.asList(5)));
		beforeItems.add(new ArrayList<>(Arrays.asList(6)));
		beforeItems.add(new ArrayList<>(Arrays.asList(3,6)));
		beforeItems.add(new ArrayList<>());
		beforeItems.add(new ArrayList<>());
		beforeItems.add(new ArrayList<>());
		
		System.out.println(sortItems(8 , 2, new int[] {-1,-1,1,0,0,1,0,-1} , beforeItems));
	}

	private static int[] sortItems(int n, int m, int[] group, List<List<Integer>> beforeItems) {
		
		Map<Integer , Integer> itemGraph = new HashMap<>();
		Map<Integer , Integer> groupGraph = new HashMap<>();
		
		buildGraph();
		
		return null;
	}

	private static void buildGraph() {
		
	}

}
