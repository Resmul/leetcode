/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        ListNode d1=headA;
        ListNode d2=headB;
        int c1=0,c2=0;
        while(d1!=null){
           c1++;
           d1=d1.next;
        }
        while(d2!=null){
            c2++;
            d2=d2.next;
        }
        d1=headA;
        d2=headB;
        if(c2>c1){
            int c=c2-c1;
            for(int i=0;i<c;i++){
                d2=d2.next;
            }
        }
        else{
            int c=c1-c2;
            for(int i=0;i<c;i++){
                d1=d1.next;
            }
        }
        while(d1!=null){
            if(d1==d2){
                return d1;
            }
            d1=d1.next;
            d2=d2.next;
        }
        return null;
    }
}