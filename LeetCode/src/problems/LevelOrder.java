package problems;

import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

import SO.TreeNode;

public class LevelOrder {

	public static void main(String[] args) {
		
		TreeNode root = new TreeNode(1, new TreeNode(), new TreeNode());
		root.left = new TreeNode(2, new TreeNode(), new TreeNode());
		root.right = new TreeNode(3, null,null);
		root.left.left = new TreeNode(4, null, null);
		root.right.right = new TreeNode(5, null, null);
		
		System.out.println(levelOrder(root).toString());

	}

	private static List<List<Integer>> levelOrder(TreeNode root) {
		
		List<List<Integer>> result = new LinkedList<>();
		if(root == null) return result;
		Queue<TreeNode> queue = new LinkedList<>();
		queue.offer(root);
		while (!queue.isEmpty()) {
			int level = queue.size();
			List<Integer> childList = new LinkedList<>();
			for (int i = 0; i < level; i++) {
				if(queue.peek().left != null) queue.offer(queue.peek().left);
				if(queue.peek().right != null) queue.offer(queue.peek().right);
				childList.add(queue.poll().val);
			}
			
			result.add(childList);
		}
		
		return result;
	}

}
