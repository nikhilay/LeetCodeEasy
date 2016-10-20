/**
 * Created by Nikhil on 10/20/16.
 */

/**
 * Remove all elements from a linked list of integers that have value val.
 */
public class RemoveLinkedListElement {
    //Definition for singly-linked list.
    public class ListNode {
        int val;
        ListNode next;

        ListNode(int x) {
            val = x;
        }
    }
    public ListNode removeElements(ListNode head, int val) {
        ListNode helper = new ListNode(0);
        helper.next = head;
        ListNode curr = helper;
        while(curr.next!=null){
            if(curr.next.val==val){
                curr.next = curr.next.next;
            }else{
                curr = curr.next;
            }

        }
        return helper.next;
    }
}
