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
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
       ListNode temp1=l1;
       ListNode temp2=l2;
       int carry=0; 
       ListNode list=new ListNode(0);
       ListNode current=list;
   
       while(temp1!=null || temp2!=null){
        int val1=(temp1!=null)? temp1.val:0;
        int val2=(temp2!=null)? temp2.val:0;

        int sum=val1+val2+carry;
        carry=sum/10;
        current.next=new ListNode(sum%10);
        current=current.next;

        if(temp1!=null) temp1=temp1.next;
        if(temp2!=null) temp2=temp2.next;
       }
       if(carry>0){
        current.next=new ListNode(carry);
       }
    return list.next; 
    

        
    }
    
}