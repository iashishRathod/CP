package problems;

import SO.ListNode;

public class SwapPairs {

	public static void main(String[] args) {
		
		ListNode head = new ListNode(1, new ListNode(2, new ListNode(3, new ListNode(4, null))));
		
		System.out.println(swapPairs(head));

	}

	private static ListNode swapPairs(ListNode head) {
		
		if(head == null) return head;
		
		ListNode temp = new ListNode(0);
		ListNode current = temp;
		
		temp.next = head;
		
		while(current.next != null && current.next.next != null) {
			
			ListNode first = current.next;
			ListNode second = current.next.next;
			
			first.next = second.next;
			current.next = second;
			current.next.next = first;
			current = current.next.next;
		}
		
		
		return temp.next;
	}

}
