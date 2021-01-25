package problems;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class CalcEquation {

	public static void main(String[] args) {
		
		List<List<String>> equations = new ArrayList<>();
		equations.add(Arrays.asList(new String[] {"a","b"}));
		equations.add(Arrays.asList(new String[] {"b","c"}));
		
		double[] values = {2.0,3.0} ;
		List<List<String>> queries = new ArrayList<>();
		queries.add(Arrays.asList(new String[] {"a","c"}));
		queries.add(Arrays.asList(new String[] {"b","a"}));
		queries.add(Arrays.asList(new String[] {"a","e"}));
		queries.add(Arrays.asList(new String[] {"a","a"}));
		queries.add(Arrays.asList(new String[] {"x","x"}));

		System.out.println(calcEquation(equations,values,queries));
	}

	private static double[] calcEquation(List<List<String>> equations, double[] values, List<List<String>> queries) {
		
		Map<String, Map<String, Double>> graph = buildGraph(equations,values);
		
		double result[] = new double[queries.size()];
		
		int i = 0;
		for (List<String> query : queries) {
			result[i] = helper(query.get(0),query.get(1),new HashSet<>(),graph);
			i++;
		}
		return result;
	}

	private static double helper(String start, String end, Set<String> visited,Map<String, Map<String, Double>> graph) {
		
		if(!graph.containsKey(start) || !graph.containsKey(end)) return -1.0;
		
		if(graph.get(start).containsKey(end)) return graph.get(start).get(end);
		
		visited.add(start);
		
		for (Entry<String, Double> entry : graph.get(start).entrySet()) {
			
			if(visited.contains(entry.getKey())) continue;
			double product = helper(entry.getKey(), end, visited, graph);
			if(product == -1.0) continue;
			return product * entry.getValue();
		}
		
		return -1.0;
	}

	private static Map<String, Map<String, Double>> buildGraph(List<List<String>> equations, double[] values) {
		
		 Map<String, Map<String, Double>> graph = new HashMap<>();
		 String u, v;
		 for (int i = 0; i < equations.size(); i++) {
			 u = equations.get(i).get(0);
			 v = equations.get(i).get(1);
			 graph.putIfAbsent(u, new HashMap<>());
			 graph.get(u).put(v, values[i]);
			 graph.putIfAbsent(v, new HashMap<>());
			 graph.get(v).put(u, 1/values[i]);
			
		}
		 return graph;
	}

}
