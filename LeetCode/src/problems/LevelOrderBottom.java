package problems;

import java.util.LinkedList;
import java.util.List;

import SO.TreeNode;

public class LevelOrderBottom {
	
	static List<List<Integer>> returnObject;

	public static void main(String[] args) {
		
		returnObject = new LinkedList<>();
		
		TreeNode root = new TreeNode();
		
		root.val = 3;
		root.left = new TreeNode();
		root.left.val = 9;
		root.right = new TreeNode();
		root.right.val = 20;
		root.right.left = new TreeNode();
		root.right.left.val = 15;
		root.right.right = new TreeNode();
		root.right.right.val = 7;
		
		levelOrderBottom(root,0);
		
		System.out.println(returnObject.toString());
		
	}

	private static void levelOrderBottom(TreeNode root, int depth) {
		
		if(root == null) return;
		if(depth >= returnObject.size()) returnObject.add(0, new LinkedList<Integer>());
		
		levelOrderBottom(root.left, depth+1);
		levelOrderBottom(root.right, depth+1);
		
		returnObject.get(returnObject.size()-depth-1).add(root.val);
	}

}
