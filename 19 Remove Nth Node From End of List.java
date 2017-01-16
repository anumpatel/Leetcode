/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
public class Solution {
    public ListNode removeNthFromEnd(ListNode head, int n) {
        if(head == null)
            return head;
        int len = 0,i=0;
        ListNode tmp2 = head;
        while(tmp2.next != null){
            len += 1;
            tmp2 = tmp2.next;
        }
        
        if( len == 0)
            return null;
        ListNode temp = head;
        if(n == len+1){
            head = head.next;
            return head;
        }
        
        int count = 0;
        while(count != len - n  ){
            temp = temp.next;
            count++;
        }
        
        if(n == 1){
            temp.next = null;
        }else{
        temp.next = temp.next.next;
        }
        return head;
    }
}