package problems;

import SO.TreeNode;

public class MaxPathSum {
	
	static int max;

	public static void main(String[] args) {
		
		TreeNode root = new TreeNode(1, new TreeNode(), new TreeNode());
		root.left = new TreeNode(2, null, null);
		root.right = new TreeNode(3, null, null);
		max = Integer.MIN_VALUE;
		
		System.out.println(maxPathSum(root));

	}

	private static int maxPathSum(TreeNode root) {
		helper(root);
		return max;
	}

	private static int helper(TreeNode root) {
		
		if(root == null) return 0;
		
		int left = Math.max(0, helper(root.left));
		int right = Math.max(helper(root.right), 0);
		max = Math.max(left + right + root.val,max);
		return Math.max(left, right) + root.val;
	}

}
