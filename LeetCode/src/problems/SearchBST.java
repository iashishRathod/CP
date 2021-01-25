package problems;

import SO.TreeNode;

public class SearchBST {

	public static void main(String[] args) {

		TreeNode root = new TreeNode();
		int val = 15;

		root.val = 62;
		root.left = new TreeNode();
		root.left.val = 2;
		root.right = new TreeNode();
		root.right.val = 93;
		root.left.right = new TreeNode();
		root.left.right.val = 30;
		root.left.right.left = new TreeNode();
		root.left.right.left.val = 15;

		TreeNode result = searchBST(root,val);

		if(null != result) {
			System.out.println(result.val);
			if(null != result.left) System.out.println(result.left.val); else System.out.println("- ");
			if(null != result.right) System.out.println(result.right.val); else System.out.println(" -");
		}
	}

	private static TreeNode searchBST(TreeNode root, int x) {
		if (root==null || root.val==x) return root; 
		if (root.val > x) return searchBST(root.left, x); 
		return searchBST(root.right, x); 
	}
}
