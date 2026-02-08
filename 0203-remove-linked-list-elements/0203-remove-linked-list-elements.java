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
        if(head==null) return null;
        
        ListNode temp=head;
        ListNode prev1=new ListNode(0);
        prev1.next=head;
        ListNode prev=prev1;
        while(temp!=null){
            if(temp.val==val){
                prev.next=temp.next;
            }
            else{
            prev=temp;
            
            }
            temp=temp.next;

        }
        return prev1.next;
    }
}