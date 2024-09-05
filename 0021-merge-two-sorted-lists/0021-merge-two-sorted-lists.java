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
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        //Intializing two pointers default to 0 
        ListNode node1 = new ListNode();
        ListNode curHead = node1 ;
        //Node node2 = new Node();
        while(list1 != null && list2 != null){
            if(list1.val < list2.val){
                curHead.next = list1;
                list1 = list1.next;
            }else{
                curHead.next = list2;
                list2 = list2.next;
            }
            curHead=curHead.next;
        }
        if(list1!=null) curHead.next = list1;
        if(list2!=null) curHead.next = list2;
        //node1 = node1.next;
        return node1.next;
    }
}