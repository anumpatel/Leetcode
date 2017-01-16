/**
 * Definition for singly-linked list.
 * class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public ListNode detectCycle(ListNode head) {
        if(head == null || head.next == null){
            return null;
        }
        ListNode slow = head;
        ListNode fast = head;
        boolean loop = false;
        while(fast != null && fast.next != null){
            slow = slow.next;
            fast = fast.next.next;
            if(slow == fast)
                //loop = true;
                break;
                
            
        }
        if (fast == null || fast.next == null) {
            return null;
        }
        slow = head;
        //if(loop){
            
            while(slow != fast){
                slow = slow.next;
                fast = fast.next;
            }
            
        //}
        return slow;
    }
}