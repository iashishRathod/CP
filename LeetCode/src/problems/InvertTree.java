package problems;

import SO.TreeNode;

public class InvertTree {

	public static void main(String[] args) {

		TreeNode root = new TreeNode();

		invertTree(root);
	}

	public static TreeNode invertTree(TreeNode root) {

		if(root == null)
			return root;
		else
			return invert(root);
	}  

	public static TreeNode invert(TreeNode root){

		if(root==null)
			return null;

		TreeNode left = invert(root.left);
		TreeNode right = invert(root.right);

		root.left = right;
		root.right = left;

		return root;   
	}
}
