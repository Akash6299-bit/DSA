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
// class Solution {
//     public ListNode modifiedList(int[] nums, ListNode head) {
        
//         HashMap<Integer, Integer> map=new HashMap<>();

//         for(int i=0; i<nums.length; i++){
//             map.put(nums[i], map.getOrDefault(nums[i],0)+1);
//         }

//         ListNode dum=new ListNode(0);
//         ListNode p1=dum;
//         ListNode temp=head;

//         while(temp!=null){

//             if(!map.containsKey(temp.val)){
//                 p1.next=temp;
//                 p1=p1.next;
//             }

//             temp=temp.next;

//         }
//         p1.next=null;
//         return dum.next;
//     }
// }
class Solution {
    public ListNode modifiedList(int[] nums, ListNode head) {

        HashSet<Integer> set = new HashSet<>();

        for (int num : nums) {
            set.add(num);
        }

        ListNode dummy = new ListNode(0);
        ListNode curr = dummy;

        while (head != null) {

            if (!set.contains(head.val)) {
                curr.next = head;
                curr = curr.next;
            }

            head = head.next;
        }

        curr.next = null;

        return dummy.next;
    }
}