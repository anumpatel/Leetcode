/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
public class Solution {
    public ListNode reverseBetween(ListNode head, int m, int n) {
        if(m>=n || head == null)
            return head;
        
        ListNode temp = new ListNode(0);
        temp.next = head;
        head = temp;
        
        for(int i =1;i<m;i++){
            if(head == null)
                return null;
            head = head.next;
        }
        
        ListNode prev = head;
        ListNode mnode = head.next;
        ListNode nnode = mnode;
        ListNode post = mnode.next;
        
        for(int i =m;i<n;i++){
            if(post == null){
                return null;
            }
            ListNode temp2 = post.next;
            post.next = nnode;
            nnode = post;
            post = temp2;
        }
        mnode.next = post;
        prev.next = nnode;
        
        return temp.next;
        
        
        
    }
}