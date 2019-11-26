package LeetCode;/*
Author: Zhao Liu
Email: Liuzhaobest@gmail.com
Date: Nov 20 2019
*/
/*
206. Reverse Linked List
Reverse a singly linked list.
Input: 1->2->3->4->5->NULL
Output: 5->4->3->2->1->NULL
A linked list can be reversed either iteratively or recursively. Could you implement both?
 */

/*
I feel that iterative method is better. Recursive method need to use the recursive stack.
So for linked list, we are trying to manipulate the links. To do that, sometimes we need
multiple pointers.
 */
/*
Name change
 */
public class ReverseLinkedList {
    public static void main(String[] args)
    {

    }

    // iterative
    public ListNode reverseListIteratively(ListNode head) {
        ListNode pre, cur, next;
        if(head == null) return head;
        if(head.next == null) return head;
        pre = null;
        cur = head;
        next = head.next;
        while(cur.next != null)
        {
            cur.next = pre;
            pre = cur;
            cur = next;
            next = next.next;
        }
        cur.next = pre;
        return cur;
    }

    public ListNode reverseListRecursively(ListNode head){
        if(head == null) return head;
        if(head.next == null) return head;
        ListNode p = reverseListRecursively(head.next);
        head.next.next = head;
        head.next = null;
        return p;
    }



    private class ListNode {
        int val;
        ListNode next;
        ListNode(int x) { val = x; }
    }

}



