/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        ListNode a1 = new ListNode(0);
        ListNode b1 = new ListNode(0);

        Set<ListNode> ab = new HashSet<>();
        while(headA != null){
            ab.add(headA);
            headA = headA.next;
        }
        while(headB != null){
            if(ab.contains(headB)) return headB;
            headB=headB.next;
        }
        return null;
    }
}