package problems;

import SO.TreeNode;

public class SumRootToLeaf {
	
	public static void main(String[] args) {

		TreeNode root = new TreeNode();

		root.val = 1;
		root.left = new TreeNode();
		root.left.val = 0;
		root.left.left = new TreeNode();
		root.left.left.val = 0;
		root.left.right = new TreeNode();
		root.left.right.val = 1;
		root.right = new TreeNode();
		root.right.val = 1;
		root.right.left = new TreeNode();
		root.right.left.val = 0;
		root.right.right = new TreeNode();
		root.right.right.val = 1;


		System.out.println(sumRootToLeaf(root,0));

	}

	private static int sumRootToLeaf(TreeNode root, int val) {
		helper(root,val);
		return ans;
	}

	static int ans = 0;
	private static void helper(TreeNode root, int val) {
		
		if(root == null) return;
		val = val << 1 | root.val;
        if(root.left == null && root.right == null) ans += val;		
		helper(root.left,val);
		helper(root.right,val);
	}

}
