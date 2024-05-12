//leetcode question no-2095 Delete the Middle Node of a Linked List
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
    public ListNode deleteMiddle(ListNode head) {
        ListNode s=head;
        int size=1;
        while(s.next!=null){
            size++;
            s=s.next;
        }

        if(size<=1){
            return null;
        }
        
        int mid=size/2;
        ListNode prev=null;
        ListNode curr=head;
        while(mid>0){
            prev=curr;
            curr=curr.next;
            mid--;
        }
        prev.next=curr.next;
        return head;
    }
}
