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
    public boolean isPalindrome(ListNode head) {
        ListNode temp=head;
        ArrayList<Integer>arr=new ArrayList<>();
        while(temp!=null){
            arr.add(temp.val);
            temp=temp.next;
        }
        int i=0;
        int j=arr.size()-1;
        boolean palin=true;
        while(i<j){
            if(arr.get(i)==arr.get(j)){
                i++;
                j--;
            }
            else{
                palin=false;
                break;
            }
        }
        return palin;

        
    }
}