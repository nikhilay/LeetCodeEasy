/**
 * Created by Nikhil on 10/18/16.
 */

public class ReverseLinkedList {

    //Definition for singly-linked list.
    public class ListNode {
        int val;
        ListNode next;

        ListNode(int x) {
            val = x;
        }
    }

    public ListNode reverseList(ListNode head) {

        ListNode prev =null;
        ListNode curr = head;
        while(curr!=null){
            ListNode temp = curr.next;
            curr.next = prev;
            prev = curr;
            curr= temp;
        }
        return prev;

    }

    //With Recursion
    public ListNode reverseListWithRecursion(ListNode head) {
        if (head == null || head.next == null) {
            return head;
        }
        ListNode temp = reverseListWithRecursion(head.next);
        head.next.next = head;
        head.next = null;
        return temp;
    }
}
