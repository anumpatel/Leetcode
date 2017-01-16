/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
public class Solution {
    public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        ListNode dummy = new ListNode(0);
        ListNode lastNode = dummy;
        // if(l1 == null || l1.next == null){
        //     return l1;
        // }
        // if(l2 == null || l2.next == null){
        //     return l2;
        // }
        
        // ListNode temp1 = l1.next;
        // ListNode temp2 = l2.next;
        // if(temp1.val > temp2.val){
        //     l1.next = temp2;
        //     temp2 = temp2.next;
        // }
        // else{
        //     l1.next = temp1;
        //     temp1 = temp1.next;
        // }
        // ListNode mergeNode = l1.next;
        while(l1!= null && l2!=null){
            if(l1.val > l2.val){
                lastNode.next = l2;
                l2 = l2.next;
            }
            else{
                lastNode.next = l1;
                l1 = l1.next;
            }
            lastNode = lastNode.next;
        }
        if(l1 != null){
            lastNode.next = l1;
        }
        else{
            lastNode.next = l2;
        }
        return dummy.next;
    }
}