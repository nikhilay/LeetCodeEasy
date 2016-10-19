/**
 * Created by Nikhil on 10/19/16.
 */
public class RemovingElementsFromSortedList {
    //Definition for singly-linked list.
    public class ListNode {
        int val;
        ListNode next;

        ListNode(int x) {
            val = x;
        }
    }

    public ListNode deleteDuplicates(ListNode head) {
        if (head == null || head.next == null) return head;
        ListNode curr = head.next;
        ListNode prev = head;
        while (curr != null) {
            if (prev.val == curr.val) {
                curr = curr.next;
                prev.next = curr;
            } else {
                prev = curr;
                curr = curr.next;
            }
        }
        return head;
    }
}
