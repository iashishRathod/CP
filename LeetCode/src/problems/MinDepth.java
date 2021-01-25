package problems;

import SO.TreeNode;

public class MinDepth {

	public static void main(String[] args) {
		
		TreeNode root = new TreeNode(3, new TreeNode(9, null, null), new TreeNode(20, new TreeNode(15, null, null), new TreeNode(7, null, null)));
		
		System.out.println(minDepth(root));

	}

	private static int minDepth(TreeNode root) {
		if(root == null) return 0;
		int l = minDepth(root.left) , r = minDepth(root.right); 
		return 1 + (Math.min(l, r) > 0 ? Math.min(l, r) : Math.max(l, r));
	}

}
