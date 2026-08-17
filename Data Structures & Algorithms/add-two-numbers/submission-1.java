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
        ListNode head1=l1;
        ListNode head2=l2;
        ListNode temp=head1;
        ListNode temp2=head2;

        ListNode dummy=new ListNode(-1);
        ListNode cur=dummy;
         int carry=0;
        while(temp!=null||temp2!=null){
           
            int sum=carry;
            if(temp!=null){
                sum+=temp.val;
            }
            if(temp2!=null){
                sum+=temp2.val;
            }
            ListNode newNode=new ListNode(sum%10);
            carry=sum/10;
             cur.next=newNode;
             cur=cur.next;
             if(temp!=null){
                temp=temp.next;
             }
             if(temp2!=null){
                temp2=temp2.next;
             }
        } 
        if(carry!=0){
            ListNode newNode=new ListNode(carry);
            cur.next=newNode;
        }
       return dummy.next;

    }
}
