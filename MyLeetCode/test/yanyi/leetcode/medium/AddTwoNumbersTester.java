package yanyi.leetcode.medium;

import static org.junit.Assert.*;

import org.junit.Test;

import yanyi.leetcode.medium.AddTwoNumbers.ListNode;

public class AddTwoNumbersTester {

	@Test
	public void test() {
		try{
			AddTwoNumbers addTwoNumbers = new AddTwoNumbers();
			
			
			AddTwoNumbers.ListNode l1 = addTwoNumbers.buildListNode(2);
			l1.next = addTwoNumbers.buildListNode(4);
			l1.next.next = addTwoNumbers.buildListNode(3);
			
			AddTwoNumbers.ListNode l2 = addTwoNumbers.buildListNode(5);
			l2.next = addTwoNumbers.buildListNode(6);
			l2.next.next = addTwoNumbers.buildListNode(4);		
			
			AddTwoNumbers.ListNode temp1 = l1;
			while(temp1 != null){
				System.out.print(temp1.val);
				temp1 = temp1.next;
			}
			
			System.out.print("\n");
			
			AddTwoNumbers.ListNode temp2 = l2;
			while(temp2 != null){
				System.out.print(temp2.val);
				temp2 = temp2.next;
			}
			
			
			AddTwoNumbers.ListNode result = new AddTwoNumbers().addTwoNumbers(l1, l2);	
			
			System.out.print("\n");
			
			while(result != null){
				System.out.print(result.val);
				result = result.next;
			}
			
		}catch(Exception e){
			fail(e.toString());
		}
	}

}
