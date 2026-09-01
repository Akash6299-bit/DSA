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
    public ListNode rotateRight(ListNode head, int k) {
   
  
        ListNode temp=head;
        int count=0;

        ListNode last=head;


        while(temp!=null){
            
            last=temp;
            // last=last.next;
            temp=temp.next;
            count++;
        }

        if(count==0) return null;

         
        
        int netrotate=k%count;
        if(netrotate==0 || count==1) return head;
        
        ListNode newstart=head;

        ListNode dum=new ListNode(0);
        dum.next=head;

        ListNode newend=dum;

        for(int i=0; i<count-netrotate; i++){
            newend=newend.next;


        }
        
        newstart=newend.next;
        newend.next=null;

        last.next=head;

        return newstart;
    }
}