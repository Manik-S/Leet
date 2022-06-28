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
        while(head!=null)
        {
            if(head.next!=null)
            {
                if(head.val==head.next.val)
                {
                    head=head.next;
                }
                else
                {
                    if(left==null)
                    {
                        newHead=head;
                        left=head;
                    }
                    else
                    {
                        left.next=head;
                        left=head;
                    }
                    head=head.next;
                } 
            }
            else
            {
                if(left==null)
                {
                    newHead=head;
                    head=head.next;
                }
                else
                {
                    left.next=head;
                    head=head.next;
                }
                
            }
            
        }
        return newHead;
        
    }
}