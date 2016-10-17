/**
 * Created by Nikhil on 10/17/16.
 */

/**
 * Write a function to delete a node(except the tail)in a singly linked list,given only access to that node.
 * Supposed the linked list is 1->2->3->4and you are given the third node with value 3,the
 * linked list should become 1->2->4after calling your function.
 */
public class DeleteASingleLinkedList {


    //Definition for singly-linked list.
    public class ListNode {
        int val;
        ListNode next;

        ListNode(int x) {
            val = x;
        }
    }

    public void deleteNode(ListNode node) {
        node.val = node.next.val;
        node.next = node.next.next;

    }


}
