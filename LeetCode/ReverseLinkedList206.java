/**
 * Created by Jubril on 6/16/16.
 */
public class ReverseLinkedList206 {
    public class ListNode {
        int val;
        ListNode next;

        ListNode(int x) {
            val = x;
        }
    }


    public ListNode reverseList(ListNode head) {
        ListNode next = null;
        ListNode prev = null;
        ListNode current = head;
        while (current != null) {
            next = current.next;
            current.next = prev;
            prev = current;
            current = next;
        }
        return prev;
    }

}
