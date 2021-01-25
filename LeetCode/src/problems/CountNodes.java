package problems;

import SO.TreeNode;

public class CountNodes {

	public static void main(String[] args) {
		
		TreeNode root = new TreeNode();
		
		root.val = 1;
		root.left = new TreeNode();
		root.left.val = 2;
		root.right = new TreeNode();
		root.right.val = 3;
		root.left.left = new TreeNode();
		root.left.left.val = 4;
		root.left.right = new TreeNode();
		root.left.right.val = 5;
		root.right.left = new TreeNode();
		root.right.left.val = 6;

		System.out.print(optimiz(root));
		System.out.print(countNodes(root));
	}

	private static int countNodes(TreeNode root) {
		int h = height(root);
		if(h < 0) return 0;
		int rightHeight = height(root.right);
		if(rightHeight == h-1) return countNodes(root.right) + (1<<h);
		else return (1 << h-1) + countNodes(root.left);
	}
	
	static int height(TreeNode root) {
		if(root == null) return -1;
		return height(root.left)+1;
	}
	
	
	//Mycode
	private static int optimiz(TreeNode root) {
		if(root == null) return 0;
		return optimiz(root.left) + optimiz(root.right) +1;
	}
}
