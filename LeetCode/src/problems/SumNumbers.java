package problems;

import SO.TreeNode;

public class SumNumbers {
	
	public static void main(String[] args) {

		TreeNode root = new TreeNode();

		root.val = 4;
		root.left = new TreeNode();
		root.left.val = 9;
		root.right = new TreeNode();
		root.right.val = 0;
		root.left.left = new TreeNode();
		root.left.left.val = 5;
		root.left.right = new TreeNode();
		root.left.right.val = 1;

		System.out.print(sumNumbers(root,0));

	}

	private static int sumNumbers(TreeNode root, int curr) {
		if(root == null);
		if(root.left == null && root.right ==null) return curr*10 +root.val;
		return sumNumbers(root.right,curr*10 +root.val) +sumNumbers(root.left,curr*10 +root.val);
	}

}
