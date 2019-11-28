/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
 
 /*
 use two pointers to find the next different one.
 The solution idea is to compare each two and skip if vals are same
 */
class Solution {
    public ListNode deleteDuplicates(ListNode head) {
        if(head == null || head.next == null) return head;
        ListNode cur = head;
        ListNode nex = head.next;
        while(nex != null){
            if(nex.val == cur.val){
                nex = nex.next;
            }
            else{
                cur.next = nex;
                cur = nex;
                nex = nex.next;
            }
        }
        cur.next = null;
        return head;
    }
}
