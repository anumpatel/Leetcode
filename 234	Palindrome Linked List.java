/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
public class Solution {
    public boolean isPalindrome(ListNode head) {
        if(head == null)
            return true;
        ListNode temp = head;
        ListNode pr = new ListNode(head.val);
        while(temp.next!=null){
            ListNode temp2 = new ListNode(temp.next.val);
            temp2.next = pr;
            pr = temp2;
            temp = temp.next;
        }
        ListNode p1 = head;
        ListNode p2 = pr;
        while(p1!=null){
            if(p1.val != p2.val)
                return false;
            p1 = p1.next;
            p2 = p2.next;
        }
        return true;
        
        
    }
	   
}