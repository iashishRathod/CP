package problems;

import java.util.LinkedList;
import java.util.List;

public class PathInZigZagTree {

	public static void main(String[] args) {

		System.out.println(pathInZigZagTree(14).toString());

	}

	private static List<Integer> pathInZigZagTree(int label) {
		LinkedList<Integer> path = new LinkedList<>();
		int parent = label;
		path.addFirst(parent);

		while(parent != 1){
			int depth = (int)(Math.log(parent)/Math.log(2));
			int offset = (int)Math.pow(2,depth+1)-1-parent;
			parent = ((int)Math.pow(2,depth)+offset)/2;
			path.addFirst(parent);
		}  
		return path;
	}

}
