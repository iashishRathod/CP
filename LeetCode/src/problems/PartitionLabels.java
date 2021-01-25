package problems;

import java.util.ArrayList;
import java.util.List;

public class PartitionLabels {

	public static void main(String[] args) {

		System.out.println(partitionLabels("a").toString());
	}

	private static List<Integer> partitionLabels(String s) {
		s = s.trim();
		List<Integer> list = new ArrayList<>();
		int[] map = new int[125];
		map[s.charAt(0)]++;
		int max = s.lastIndexOf(s.charAt(0));
		int length = s.length();
		int partTill = 0;
		for (int index = 1; index < length; index++) {
			if(map[s.charAt(index)] == 0 ) {
				map[s.charAt(index)]++;
				int lastIndex = s.lastIndexOf(s.charAt(index));
				if(index <= max) max = Math.max(lastIndex, max);
				else {
					list.add(index - partTill);
					partTill = index;
					max = lastIndex;
				}
			}
		}
		
		if(max > -1) {
			list.add(list.isEmpty() ? max + 1 : max+1 - partTill);
			return list;
		}
		
		return list;
	}

}
