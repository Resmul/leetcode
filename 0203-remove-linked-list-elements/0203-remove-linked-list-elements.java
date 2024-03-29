/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public ListNode removeElements(ListNode head, int val) {
        ListNode ans = new ListNode();
        ListNode curr = ans;
        
        ListNode ptr = head;
        
        while(ptr != null) {
            if(ptr.val != val) {
                curr.next = new ListNode(ptr.val);
                curr = curr.next;
            }
            ptr = ptr.next;
        }
        return ans.next;
    }
}