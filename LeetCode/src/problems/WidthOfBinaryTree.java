package problems;

import java.util.ArrayList;
import java.util.List;

import SO.TreeNode;

public class WidthOfBinaryTree {
	
	public static void main(String[] args) {
		
		TreeNode root = new TreeNode();

		root.val = 1;
		root.left = new TreeNode();
		root.left.val = 3;
		/*root.right = new TreeNode();
		root.right.val = 2;*/
		root.left.left = new TreeNode();
		root.left.left.val = 5;
		root.left.right = new TreeNode();
		root.left.right.val = 3;
		/*root.left.left.left = new TreeNode();
		root.left.left.left.val = 6;
		root.right.right = new TreeNode();
		root.right.right.val = 9;
		root.right.right.right = new TreeNode();
		root.right.right.right.val = 7;*/
		
		System.out.println(dfs(root,1,0,new ArrayList<Integer>()));

	}

	private static int dfs(TreeNode root, int id, int depth, List<Integer> levelList) {
		
		if(root ==null)  return 0;
		if(depth == levelList.size()) levelList.add(id);
		return Math.max(id +1 - levelList.get(depth), 
				Math.max(dfs(root.left, 2*id, depth+1, levelList), dfs(root.right, 2*id+1, depth+1, levelList)));
		
	}
}
