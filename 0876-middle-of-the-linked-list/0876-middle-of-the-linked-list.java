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
    public ListNode middleNode(ListNode head) {

        ListNode temp=head;
        int sz=0;
        while(temp!=null){
            temp=temp.next;
            sz++;
        }
        int n=(sz/2);

        ListNode curr=head;
        int indx=0;

        while(indx<n){
            indx++;
            curr=curr.next;
        }
        return curr;

        
    }
}