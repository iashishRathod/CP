package problems;

import java.util.concurrent.atomic.AtomicInteger;

import SO.TreeNode;


public class IsCousins {

	public static void main(String[] args) {
		
		TreeNode root = new TreeNode();
		
		root.val = 1;
		root.left = new TreeNode();
		root.left.val = 2;
		root.right = new TreeNode();
		root.right.val = 3;
		root.left.left = null;
		root.left.right = new TreeNode();
		root.left.right.val = 4;
		root.right.left = null;
		root.right.right = new TreeNode();
		root.right.right.val = 5;
		
		
		int x = 5;
		int y = 4;
		
		AtomicInteger px = new AtomicInteger();
		AtomicInteger py = new AtomicInteger();
		AtomicInteger dx = new AtomicInteger(-1);
		AtomicInteger dy = new AtomicInteger(-1);

		checkDepth(root,x,y,0,px,py,dx,dy);
		System.out.print((dx.get() == dy.get()) && (px.get() != py.get()));
	}

	 public static void checkDepth(TreeNode root, int x, int y,int d,AtomicInteger px,AtomicInteger py,AtomicInteger dx,AtomicInteger dy){
	        
	       if(root == null)return;
	      
	    if(root.left !=null){
	        
	        if(root.left.val == x){
	            
	            px.set(root.val);
	            dx.set(d+1);
	        }else if(root.left.val == y){
	            
	            py.set(root.val);
	            dy.set(d+1);
	        } 
	    }
	    if(root.right !=null){
	        
	        if(root.right.val == x){
	            
	            px.set(root.val);
	            dx.set(d+1);
	        }else if(root.right.val == y){
	            
	            py.set(root.val);
	            dy.set(d+1);
	        } 
	    }
	      if(dx.get() != -1 && dy.get() != -1)return;
	          
	        checkDepth(root.left, x, y,d+1,px,py,dx,dy);
	        checkDepth(root.right,x, y,d+1,px,py,dx,dy);
	          
	  }

}
