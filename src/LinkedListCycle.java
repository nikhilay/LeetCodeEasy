/**
 * Created by Nikhil on 10/18/16.
 */

/**
 * Given a linked list, determine if it has a cycle in it.
 * x , 2x -
 */
public class LinkedListCycle {
    public class ListNode {
        int val;
        ListNode next;

        ListNode(int x) {
            val = x;
        }
    }

    public boolean hasCycle(ListNode head) {
        ListNode slow = head;
        ListNode fast = head;

        if (head == null) return true;

        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
            if (slow == fast) {
                return true;
            }
        }
        return false;
    }
}
