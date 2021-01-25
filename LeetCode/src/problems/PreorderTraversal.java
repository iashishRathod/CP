package problems;

import java.util.LinkedList;
import java.util.List;
import java.util.Stack;

import SO.TreeNode;

public class PreorderTraversal {

	public static void main(String[] args) {

		TreeNode root = new TreeNode();

		root.val = 1;
		root.right = new TreeNode();
		root.right.val = 2;
		root.right.left = new TreeNode();
		root.right.left.val = 3;

		preorderTraversal(root);
	}

	private static List<Integer> preorderTraversal(TreeNode root) {
		List<Integer> list = new LinkedList<>();
		if(root == null) return list;
		Stack<TreeNode> stack = new Stack<>();
		stack.push(root);
		while(!stack.isEmpty()) {
			TreeNode tovisit = stack.pop();
			list.add(tovisit.val);
			if(tovisit.right != null) stack.push(tovisit.right);
			if(tovisit.left != null) stack.push(tovisit.left);
			
		}
		return list;
	}

}
