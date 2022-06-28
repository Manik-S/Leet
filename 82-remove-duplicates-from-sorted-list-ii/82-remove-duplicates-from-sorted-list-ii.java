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
    public ListNode deleteDuplicates(ListNode head) {
        
        ListNode left=null;
        ListNode newHead=null;
        int valu=-1101010;
        while(head !=null)
        {
            if(head.next!=null)
            {
               if(head.val==head.next.val && left!=null)
                {
                    head=head.next;
                    valu=head.val;
                    left.next=null;
                }
                else if(head.val==head.next.val && left==null)
                {
                    head=head.next;
                    valu=head.val;
                }
                else
                {
                    if(left!=null && head.val!=valu)
                    {
                        left.next=head;            
                        left=head;
                    }
                    else if(left==null && head.val!=valu)
                    {
                        newHead=head;            
                        left=head;
                    }
                    head=head.next;
                } 
            }
            else
            {
                    if(left!=null && head.val!=valu)
                    {
                        left.next=head;            
                        left=head;
                    }
                    else if(left==null && head.val!=valu)
                    {
                        newHead=head;            
                        left=head;
                    }
                    head=head.next;
            }
            
        }
        return newHead;
        
    }
}