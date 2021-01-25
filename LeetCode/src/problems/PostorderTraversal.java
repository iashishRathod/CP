package problems;

import java.util.LinkedList;
import java.util.List;
import java.util.Stack;

import SO.TreeNode;

public class PostorderTraversal {
	static List<Integer> list = new LinkedList<>();
	public static void main(String[] args) {

		TreeNode root = new TreeNode();

		root.val = 1;
		root.left = new TreeNode();
		root.left.val = 2;
		root.left.left = new TreeNode();
		root.left.left.val = 4;
		root.left.right = new TreeNode();
		root.left.right.val = 5;
		root.right = new TreeNode();
		root.right.val = 3;
		root.right.left = new TreeNode();
		root.right.left.val = 6;
		root.right.right = new TreeNode();
		root.right.right.val = 7;
		
		System.out.println(postorderTraversal(root).toString());
	

	}

	private static List<Integer> postorderTraversal(TreeNode root) {
		if(root == null) return list;
		Stack<TreeNode> stack = new Stack<>();
		stack.push(root);
		TreeNode prev = null;
		while(!stack.isEmpty()) {
			TreeNode tovisit = stack.peek();
			
			if(prev == null || tovisit == prev.left || prev.right == tovisit) {
				
				if(tovisit.left != null) stack.push(tovisit.left);
				else if(tovisit.right != null) stack.push(tovisit.right);
				else {
					stack.pop();
					list.add(tovisit.val);
				}
			}
			else if(tovisit.left == prev) {
				if(tovisit.right != null) stack.push(tovisit.right);
				else {
					stack.pop();
					list.add(tovisit.val);
				}
			}
			else if(tovisit.right == prev) {
				stack.pop();
				list.add(tovisit.val);
			}
			prev = tovisit;
		}
		return list;
	}

}
