package problems;

import SO.TreeNode;

public class IsValidBST {

	public static void main(String[] args) {
		
		TreeNode root = new TreeNode();
		
		root.val = 2;
		root.left = new TreeNode();
		root.left.val = 1;
		/*root.left.left = new TreeNode();
		root.left.left.val = 4;
		root.left.right = new TreeNode();
		root.left.right.val = 5;*/
		root.right = new TreeNode();
		root.right.val = 3;
		
		System.out.println(isValidBST(root));

	}

	private static boolean isValidBST(TreeNode root) {
		return isValid(root,Long.MAX_VALUE,Long.MIN_VALUE);
	}

	private static boolean isValid(TreeNode root, long maxValue, long minValue) {
		if(root == null) return true;
		if(root.val >= maxValue || root.val <= minValue) return false;
		return isValid(root.left, root.val,minValue) && isValid(root.right,maxValue ,root.val);
	}
}
