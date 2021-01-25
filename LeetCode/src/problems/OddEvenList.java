package problems;

import SO.ListNode;

public class OddEvenList {

	public static void main(String[] args) {
		
		ListNode head = new ListNode();
		
		if(head == null || head.next == null) System.out.print(head);

		ListNode orig_even = head.next;
		ListNode orig_odd  = head; 
		ListNode even      = orig_even;
		ListNode odd       = orig_odd;

		while(even != null){

			if(even.next !=null)
				odd.next = even.next;
			else{
				odd.next = orig_even;
				System.out.print(orig_odd);
			} 

			odd = even.next;
			even.next = odd.next;
			even = even.next;
		}

		odd.next = orig_even;
		System.out.print(orig_odd);
	}
}
