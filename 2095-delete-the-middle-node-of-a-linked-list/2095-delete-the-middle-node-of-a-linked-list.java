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
        if(head==null || head.next==null){
            return null;
        }
        
        ListNode prev=null;
        ListNode temp=head;
        int sz=0;
         while(temp!=null){
            temp=temp.next;
            sz++;

         }
         ListNode curr=head;
         int n=sz/2;
         int indx=0;
         while(indx<n){
            prev=curr;
            curr=curr.next;
            indx++;
         }
        prev.next=curr.next;
        return head;

    }
}