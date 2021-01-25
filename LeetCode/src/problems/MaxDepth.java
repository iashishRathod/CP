package problems;

import SO.TreeNode;

public class MaxDepth {

	public static void main(String[] args) {
		
		TreeNode root = new TreeNode(3, new TreeNode(9, null, null), new TreeNode(20, new TreeNode(15, null, null), new TreeNode(7, null, null)));
		
		System.out.println(maxDepth(root));

	}

	private static int maxDepth(TreeNode root) {
		if(root == null) return 0;
		int l = maxDepth(root.left) , r = maxDepth(root.right); 
		return 1 + Math.max(l, r);
	}



}
