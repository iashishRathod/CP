package problems;

import SO.ListNode;

public class DeleteNode {

	public static void main(String[] args) {
		
		ListNode node = new ListNode();
		
		deleteNode(node);
		
	}
	
	public static void deleteNode(ListNode node) {
        
        node.val = node.next.val;
        node.next = node.next.next;
    }

}
