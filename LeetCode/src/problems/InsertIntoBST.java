package problems;

import SO.TreeNode;

public class InsertIntoBST {

	public static void main(String[] args) {
		
		TreeNode root = new TreeNode(4, new TreeNode(2, new TreeNode(1, null, null), new TreeNode(3, null, null)), new TreeNode(7, null, null));
		
		System.out.println(insertIntoBST(root,5));

	}

	private static TreeNode insertIntoBST(TreeNode root, int val) {
		if(root == null) return new TreeNode(val);
		if(root.val > val) root.left = insertIntoBST(root.left, val);
		if(root.val < val) root.right = insertIntoBST(root.right, val);
		return root;
	}

}
