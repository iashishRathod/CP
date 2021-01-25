package problems;

import SO.TreeNode;

public class IncreasingBST {
	
	public static void main(String[] args) {
		
		TreeNode root = new TreeNode(5, new TreeNode(), new TreeNode());
		root.left = new TreeNode(3, new TreeNode(), new TreeNode());
		root.right = new TreeNode(6, null, new TreeNode());
		root.left.left = new TreeNode(2, new TreeNode(),null);
		root.left.right = new TreeNode(4, null,null);
		root.left.left.left = new TreeNode(1, null,null);
		root.right.right = new TreeNode(8, new TreeNode(), new TreeNode());
		root.right.right.left = new TreeNode(7, null, null);
		root.right.right.right = new TreeNode(9, null, null);
		
		System.out.println(increasingBST(root).toString());

	}

	private static TreeNode increasingBST(TreeNode root) {
		return helper(root,null);
	}

	private static TreeNode  helper(TreeNode root,TreeNode tail) {
		if(root == null) return tail;
		TreeNode result = helper(root.left,root);
		root.left = null;
		root.right = helper(root.right,tail);
		return result;
	}

}
