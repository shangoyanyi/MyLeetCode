package yanyi.leetcode.medium;

/**
 * You are given two non-empty linked lists representing two non-negative integers. The digits are stored in reverse order and each of their nodes contain a single digit. Add the two numbers and return it as a linked list.
 * You may assume the two numbers do not contain any leading zero, except the number 0 itself.
 * Input: (2 -> 4 -> 3) + (5 -> 6 -> 4)
 * Output: 7 -> 0 -> 8
 * @author shangoyanyi
 * @since 2017/2/22
 */
public class AddTwoNumbers {	
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
    	 ListNode result = new ListNode(0);
         ListNode resultPointer = result;
         
         int overflow = 0;
         while(!((l1 == null) && (l2 == null) && (overflow == 0))){
         	int sum = 0;
         	if ((l1!=null) && (l2!=null)){
         		sum = l1.val + l2.val + overflow;
 	        
 		        if(sum >= 10){
 		        	sum -= 10;
 		        	overflow = 1;
 		        }else{
 		        	overflow = 0;
 		        }
 		        
 		        l1 = l1.next;
 		        l2 = l2.next;
 		        
         	}else if((l1 != null) && (l2 == null)){
         		sum = l1.val + 0 + overflow;
         		
         		if(sum >= 10){
 		        	sum -= 10;
 		        	overflow = 1;
 		        }else{
 		        	overflow = 0;
 		        }
         		
         		l1 = l1.next;
         		
         	}else if((l1 == null) && (l2 != null)){
         		sum = 0 + l2.val + overflow;
         		
         		if(sum >= 10){
 		        	sum -= 10;
 		        	overflow = 1;
 		        }else{
 		        	overflow = 0;
 		        }
 		        
         		l2 = l2.next;
         		
         	}else if(overflow > 0){
         		sum = 0 + 0 + overflow;
         		
         		if(sum >= 10){
 		        	sum -= 10;
 		        	overflow = 1;
 		        }else{
 		        	overflow = 0;
 		        }
 		        
         		overflow = 0;
         		
         	}else{
         		break;
         	}
         	
 	        resultPointer.next = new ListNode(sum);
 	        resultPointer = resultPointer.next;
         }
         
         if(result.next != null){
         	result = result.next;
         }
         
         return result;
    }
	
	
    /**
     * Definition for singly-linked list.
     * public class ListNode {
     *     int val;
     *     ListNode next;
     *     ListNode(int x) { val = x; }
     * }
     */
	public class ListNode {
	     int val;
	     ListNode next;
	     ListNode(int x) { val = x; }
	}
	
	public ListNode buildListNode(int x){
		return new ListNode(x);
	}
}
