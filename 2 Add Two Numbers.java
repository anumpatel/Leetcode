/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
public class Solution {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        if(l1 == null && l2 ==null){
            return null;
        }
        
        
        ListNode dummy = new ListNode(0);
        ListNode lastNode = dummy;
        int sum=0,pre=0,sum1=0,pre1=0;
        

        
        while(l1!= null && l2!= null){
            sum = pre1 + l1.val + l2.val;
            lastNode.next = new ListNode(sum % 10);
            pre1 = sum / 10;
            l1 = l1.next;
            l2 = l2.next;
            lastNode = lastNode.next;
        }
        while(l1!=null){
            sum = pre1 + l1.val;
            //pre = sum % 10;
            
            //pre = sum - pre * 10;
            //ListNode tmp = new ListNode(pre);
            lastNode.next = new ListNode(sum % 10);
            pre1 = sum / 10;
            l1 = l1.next;
            lastNode = lastNode.next;
        }
        while(l2!=null){
            sum = pre1 + l2.val;
            //pre = sum % 10;
            
            //pre = sum - pre * 10;
            //ListNode tmp = new ListNode(pre);
            lastNode.next = new ListNode(pre = sum % 10);
            pre1 = sum / 10;
            l2 = l2.next;
            lastNode = lastNode.next;
            
        }
        if(pre1 != 0){
            lastNode.next = new ListNode(pre1);
        }
        
        
        // while(l1 != null || l2 !=null){
        //     /*if(l1 != null || l2 != null){
        //     sum1 = l1.val + l2.val;
        //     sum = sum1 + pre1;
            
        //     }*/
        //     // if(l2 == null){
        //     //     sum2 = l1.val;
        //     //     //sum = sum1 + pre1;
        //     //     l1 = l1.next;
        //     // }
        //     // if(l1 == null){
        //     //     sum3 = l2.val;
        //     //     //sum = sum1 + pre1;
        //     //     l2 = l2.next;
        //     // }
        //     // if(l1 == null){
        //     //     sum1 = l2.val;
        //     //     l2 = l2.next;
        //     // }                
        //     // if(l2 == null){
        //     //     sum1 = l1.val;
        //     //     l1 = l1.next;
        //     // }
        //     if(l1 != null && l2 != null){
        //         sum1 = l1.val + l2.val;
                
        //     }
        //     //sum1 = sum2+sum3;
        //     sum = sum1+pre1;
        //     if(sum > 9){
        //         pre = sum % 10;
        //         pre1 = sum / 10;
        //         //pre = sum - pre * 10;
        //         ListNode tmp = new ListNode(pre);
        //         lastNode.next = tmp;
        //     }
        //         if(l1.next == null && l2.next != null){
        //             lastNode = lastNode.next;
        //             l2 = l2.next;
        //             ListNode tmplast = new ListNode(pre1);
        //             lastNode.next = tmplast;
        //             continue;
        //         }
        //         if(l2.next == null && l1.next != null){
        //             lastNode = lastNode.next;
        //             l1 = l1.next;
        //             ListNode tmplast = new ListNode(pre1);
        //             lastNode.next = tmplast;
        //             continue;
        //         }
            
        //     if(sum < 10){
        //         ListNode tmp = new ListNode(sum);
        //         lastNode.next = tmp;
            
        //     }
            
        //     lastNode = lastNode.next;
        //     l1 = l1.next;
        //      l2 = l2.next;
        //     // if(l1.next != null){
        //     //     l1 = l1.next;
        //     // }
        //     // if(l2.next != null){
        //     //     l2 = l2.next;
        //     // }
            
        //     // sum2=0;
        //     // sum3=0;
   
            
        // }
        return dummy.next;
        
        
        
    }
}