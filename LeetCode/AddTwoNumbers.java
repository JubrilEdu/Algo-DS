package LeetCode;

/**
 * Created by JB on 4/9/19.
 */
public class AddTwoNumbers {


      public class ListNode {
          int val;
          ListNode next;
          ListNode(int x) { val = x; }
      }

       public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
           ListNode listNode = new ListNode(0);
           ListNode tracker  = listNode;
           int carry = 0;
            while (l1 != null || l2 != null) {
                int x = l1 != null ? l1.val: 0;
                int y = l2 != null ? l2.val: 0;
                int sum = x + y + carry;
                carry = sum/10;

                tracker.next = new ListNode(sum%10);
                tracker = tracker.next;
                if (l1 != null) {l1 = l1.next;}
                if (l2 != null) {l2 = l2.next;}
            }

            if (carry>0){
                tracker.next = new ListNode(carry);
            }
            return listNode.next;
       }

}
