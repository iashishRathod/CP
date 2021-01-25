package problems;

import SO.TreeNode;

public class IsBalanced {

	public static void main(String[] args) {
		
		TreeNode root = new TreeNode(3, new TreeNode(9, null, null), new TreeNode(20, new TreeNode(15, null, null), new TreeNode(7, null, null)));
		
		System.out.println(isBalanced(root));

		TreeNode root1 = new TreeNode(1, new TreeNode(2, new TreeNode(3, new TreeNode(4, null, null), new TreeNode(4, null, null)), new TreeNode(3, null, null)), new TreeNode(2,null,null));
		
		System.out.println(isBalanced(root1));
	}

	private static boolean isBalanced(TreeNode root) {
		if (root == null) return true;
		 return helper(root) != -1;
	}

	private static int helper(TreeNode root) {
		
		if(root == null) return 0;
		 int left = helper(root.left);
		 int right = helper(root.right);
		 if(left == -1 || right == -1 || Math.abs(right - left) > 1) return -1;
		return Math.max(helper(root.left), helper(root.right)) + 1;
		
	}

}
