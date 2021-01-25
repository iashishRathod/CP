package problems;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

import SO.TreeNode;

public class DistanceK {
	
	static Map<TreeNode,Integer> map = new HashMap<>();

	public static void main(String[] args) {
		
		TreeNode root = new TreeNode(3, new TreeNode(5, new TreeNode(), new TreeNode()), new TreeNode(1, new TreeNode(), new TreeNode()));
		root.left.left =  new TreeNode(6, null, null);
		root.left.right	 =  new TreeNode(2, new TreeNode(7,null,null), new TreeNode(4,null,null));
		root.right.left = new TreeNode(0,null,null);
		root.right.right = new TreeNode(8,null,null);

		System.out.println(distanceK(root,new TreeNode(5, null, null),2).toString());
	}

	private static List<Integer> distanceK(TreeNode root, TreeNode target, int k) {
		List<Integer> result = new LinkedList<>();
		buildMap(root,target);
		helper(root,target,k,map.get(root),result);
		return result;
	}

	private static void helper(TreeNode root, TreeNode target, int k,Integer length, List<Integer> result) {
		if(root == null) return;
		if(map.containsKey(root)) length = map.get(root); 
		if(length == k ) result.add(root.val);
		helper(root.left, target, k, length+1, result);
		helper(root.right, target, k, length+1, result);
	}

	private static int buildMap(TreeNode root, TreeNode target) {
		
		if(root == null) return -1;
		if(root == target) {
			map.put(root, 0);
			return 0;
		}
		
		int l = buildMap(root.left, target);
		
		if(l >= 0) {
			map.put(root,l= l+1);
			return l;
		}
		
		int r = buildMap(root.right, target);
		
		if(r >= 0) {
			map.put(root,r= r+1);
			return r;
		}
		return -1;
		
	}

}
