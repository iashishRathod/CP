package problems;

import java.util.LinkedList;
import java.util.List;
import java.util.Stack;

import SO.TreeNode;

public class InorderTravesal {
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
		/*root.right.left = new TreeNode();
		root.right.left.val = 6;
		root.right.right = new TreeNode();
		root.right.right.val = 7;
*/		
		System.out.println(inorderTravesal(root).toString());

	}

	private static List<Integer> inorderTravesal(TreeNode root) {
		if(root == null) return list;
		Stack<TreeNode> stack = new Stack<>();
		TreeNode curr = root;
		while (curr != null || !stack.isEmpty()) {
			while(curr !=null ) {
				stack.push(curr);
				curr = curr.left;
			}
			curr = stack.pop();
			list.add(curr.val);
			curr = curr.right;
		}
		return list;
	}

}
