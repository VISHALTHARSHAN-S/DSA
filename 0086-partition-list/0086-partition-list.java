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
    public ListNode partition(ListNode head, int x) {
       ListNode right=new ListNode();
       ListNode left=new ListNode();
       ListNode rtemp=right,temp=head;
       ListNode ltemp=left;
       while(temp!=null)
       {
        if(temp.val<x)
        {
            ltemp.next=temp;
            ltemp=ltemp.next;
        }
        else
        {
            rtemp.next=temp;
            rtemp=rtemp.next;
        }

        temp=temp.next;
       } 
       rtemp.next= null;
       ltemp.next=right.next;

       return left.next;


    }
}