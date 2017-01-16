/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
public class Solution {
    public ListNode reverseList(ListNode head) {
        if(head == null)
            return head;
        // if(head.next.val == null)
        //     return head;
        ListNode temp = head;
        ListNode pr = new ListNode(head.val);
        while(temp.next != null){
            ListNode temp2 = new ListNode(temp.next.val);
            temp2.next = pr;
            pr = temp2;
            temp = temp.next;
        }
        ListNode p1 = pr;
        return p1;
    }
}