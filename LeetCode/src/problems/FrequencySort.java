package problems;

import java.util.Comparator;
import java.util.HashMap;
import java.util.PriorityQueue;

public class FrequencySort {

	public static void main(String[] args) {

		String s = "tree";
		System.out.print(frequencySort(s));

	}

	private static String frequencySort(String s) {

		final HashMap<Character, Integer> map = new HashMap<>();

		for (int i = 0; i < s.toCharArray().length; i++) {

			Integer count = map.get(s.charAt(i));
			if(null == count)
				count = 1;
			else
				count++;
			map.put(s.charAt(i), count);
		}

		PriorityQueue<Character> maxHeap = new PriorityQueue<>(map.size(), new Comparator<Character>() {
			@Override
			public int compare(Character w1, Character w2) {
				return map.get(w1) > map.get(w2) ? -1 : 1;
			}
		});

		maxHeap.addAll(map.keySet());
		StringBuilder sb = new StringBuilder();
		while(!maxHeap.isEmpty()){
			Character top = maxHeap.remove();
			for (int i = 1; i <= map.get(top); i++) 
				sb.append(top);
		}

		return sb.toString();
	}
}
