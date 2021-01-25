package problems;

import SO.TreeNode;

public class LcaDeepestLeaves {

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
		
		lcaDeepestLeaves(root);
		
	}

	private static TreeNode lcaDeepestLeaves(TreeNode root) {
		Pair p = getLca(root,0);
		return p.node;
	}

	private static Pair getLca(TreeNode root, int d) {
		if(root == null) return new Pair(null, d);
		Pair l = getLca(root.left, d+1);
		Pair r = getLca(root.right, d+1);
		if(l.d == r.d) return new Pair(root, l.d);
		return l.d > r.d ?  l: r;
	}

}

class Pair {
    TreeNode node;
    int d;
    Pair(TreeNode node, int d) {
        this.node = node;
        this.d = d;
    }
}
