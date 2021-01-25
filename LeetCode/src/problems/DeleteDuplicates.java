package problems;

import SO.ListNode;

public class DeleteDuplicates {

	public static void main(String[] args) {
		
		ListNode head = new ListNode(1, new ListNode(1, new ListNode(2, new ListNode(3, new ListNode(3, null)))));

		System.out.println(deleteDuplicates(head));


	}

	private static ListNode deleteDuplicates(ListNode head) {
		ListNode res = head;
		while(res != null && res.next != null) {
			if(res.next.val == res.val) res.next = res.next.next;
			else res = res.next;
		}
		return head;
	}

}
