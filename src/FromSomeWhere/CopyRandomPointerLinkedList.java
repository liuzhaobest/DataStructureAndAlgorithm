package FromSomeWhere;

import java.util.HashMap;


/*
Link between these two list, the random pointer of B1 is found by link B1 to A1, A1 to Ak, Ak to Bk
 */
// leetCode 138

/*
public class CopyRandomPointerLinkedList {
    public static void main(String[] args) {

    }

    public static ListNode CopyLinkedList(ListNode head){
        if(head == null){
            return null;
        }
        ListNode resultHead;
        resultHead = head;
        resultHead.val = head.val;
        HashMap<ListNode, ListNode> map = new HashMap<ListNode, ListNode>();
        ListNode resultNext;
        while(head != null){

        }



    }

    public class ListNode {
      int val;
      ListNode next;
      ListNode random;
      ListNode(int x) { val = x; }
  }
}


 */