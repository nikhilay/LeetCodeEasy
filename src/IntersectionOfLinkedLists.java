/**
 * Created by Nikhil on 1/1/17.
 */

/**
 * Write a program to find the node at which the intersection of two singly linked lists begins.g
 * For example, the following two linked lists:
 */
public class IntersectionOfLinkedLists {
    public class ListNode {
        int val;
        ListNode next;

        ListNode(int x) {
            val = x;
            next = null;
        }
    }

    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        if (headA == null || headB == null) return null;
        int lenA = 0;
        int lenB = 0;
        ListNode nodeA = headA;
        ListNode nodeB = headB;
        while (nodeA != null) {
            lenA++;
            nodeA = nodeA.next;
        }
        while (nodeB != null) {
            lenB++;
            nodeB = nodeB.next;
        }
        if (lenA > lenB) {
            int diff = lenA - lenB;
            for (int i = 0; i < diff; i++) {
                headA = headA.next;
            }
        }
        if (lenB > lenA) {
            int diff = lenB - lenA;
            for (int i = 0; i < diff; i++) {
                headB = headB.next;
            }
        }
        while (headA != headB) {
            headA = headA.next;
            headB = headB.next;
        }
        return headA;


    }
}
