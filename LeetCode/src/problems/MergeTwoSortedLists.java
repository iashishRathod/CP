package problems;

import SO.ListNode;

public class MergeTwoSortedLists {

	public static void main(String[] args) {
		
		ListNode l1 = new ListNode(1, new ListNode(2, new ListNode(4, null)));
		ListNode l2 = new ListNode(1, new ListNode(3, new ListNode(4, null)));
		
		System.out.println(mergeTwoLists(l1,l2));

	}

	private static ListNode mergeTwoLists(ListNode l1, ListNode l2) {
		
		if(l1 == null) return l2;
		if(l2 == null) return l1;
		
		ListNode head = new ListNode(0);
		ListNode dummy = head;
		
		while(l1 != null && l2 != null) {
			
			if(l1.val < l2.val) {
				dummy.next = l1;
				l1 = l1.next;
			}
			else {
				dummy.next = l2;
				l2 = l2.next;
			}
			
			dummy = dummy.next;
		}
		
		dummy.next = l1 == null ? l2 : l1;
		
		return head.next;
	}
}
