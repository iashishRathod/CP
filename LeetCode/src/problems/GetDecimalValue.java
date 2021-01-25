package problems;

import SO.ListNode;

public class GetDecimalValue {

	public static void main(String[] args) {
		
		ListNode head = new ListNode(1, new ListNode(0, new ListNode(1,null)));
		
		System.out.println(getDecimalValue(head));

	}

	private static int getDecimalValue(ListNode head) {
		
		if(head == null) return 0;
		
		StringBuilder sb = new StringBuilder();
		
		while(head != null) {
			sb.append(head.val);
			head = head.next;
		}
		
		return Integer.parseInt(sb.toString(), 2);
	}

}
