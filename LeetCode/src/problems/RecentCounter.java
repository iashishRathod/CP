package problems;

import java.util.SortedSet;
import java.util.TreeSet;

public class RecentCounter {

	public static void main(String[] args) {
		
		SortedSet<Integer> set  = new TreeSet<>();
		
		set.add(1);
		set.add(2);
		set.add(12);
		set.add(19);
		
		System.out.println(set.headSet(2).size());
		

		
		
		
	}
	
	

}
