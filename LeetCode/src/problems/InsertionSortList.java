package problems;

import SO.ListNode;

public class InsertionSortList {

	public static void main(String[] args) {
		
		ListNode head = new ListNode(4, new ListNode(2, new ListNode(1,new ListNode(3, null))));

		System.out.println(insertionSortList(head));
	}

	private static ListNode insertionSortList(ListNode head) {
		
		if(head == null) return head;
		
		ListNode helper = new ListNode(0);
		ListNode curr = head;
		ListNode prev = helper;
		ListNode next = null;
		
		while(curr != null) {
			
			next = curr.next;
			
			while(prev.next !=null && prev.next.val < curr.val) {
				prev = prev.next;
			}
			
			curr.next = prev.next;
			prev.next = curr;
			prev = helper;
			curr = next;
			
		}
		
		return helper.next;
	}

}
