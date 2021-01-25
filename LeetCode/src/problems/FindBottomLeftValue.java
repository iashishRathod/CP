package problems;

import java.util.LinkedList;
import java.util.Queue;

import SO.TreeNode;

public class FindBottomLeftValue {

	public static void main(String[] args) {
		
		TreeNode root = new TreeNode(1, new TreeNode(), new TreeNode());
		root.left = new TreeNode(2, new TreeNode(), null);
		root.right = new TreeNode(3, new TreeNode(), new TreeNode());
		root.left.left = new TreeNode(4, null,null);
		root.right.left = new TreeNode(5, new TreeNode(), null);
		root.right.right = new TreeNode(6, null, null);
		root.right.left.left = new TreeNode(7, null, null);
		
		System.out.println(findBottomLeftValue(root));

	}

	private static int findBottomLeftValue(TreeNode root) {
		if(root == null ) return 0;
		Queue<TreeNode> queue = new LinkedList<>();
		queue.offer(root);
		while(!queue.isEmpty()) {
			for (int i = 0; i < queue.size(); i++) {
				if(queue.peek().right != null) queue.offer(queue.peek().right);
				if(queue.peek().left != null) queue.offer(queue.peek().left);
				root = queue.poll();
			}
		}
		
		return root.val;
	}
}

