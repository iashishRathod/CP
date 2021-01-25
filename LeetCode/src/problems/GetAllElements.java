package problems;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import SO.TreeNode;

public class GetAllElements {
	
	static List<Integer> list = new ArrayList<>();

	public static void main(String[] args) {
		
		TreeNode root1 = new TreeNode();
		TreeNode root2 = new TreeNode();
		
		root1.val = 0;
		root1.right = new TreeNode();
		root1.right.val = 10;
		root1.left = new TreeNode();
		root1.left.val = -10;
		
		root2.val = 5;
		root2.right = new TreeNode();
		root2.right.val = 7;
		root2.left = new TreeNode();
		root2.left.val = 1;
		root2.left.left = new TreeNode();
		root2.left.left.val = 0;
		root2.left.right = new TreeNode();
		root2.left.right.val = 2;
		
		getAllElements(root1,root2);
		Collections.sort(list);
		System.out.println(list.toString());
	}

	private static void getAllElements(TreeNode root1, TreeNode root2) {
		helper(root1);
		helper(root2);
	}

	private static void helper(TreeNode root) {
		
		if(root == null) return;
		list.add(root.val);
		helper(root.left);
		helper(root.right);
	}
}
