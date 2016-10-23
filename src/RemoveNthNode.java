/**
 * Created by Nikhil on 10/22/16.
 */
public class RemoveNthNode {
    //Definition for singly-linked list.
    public class ListNode {
        int val;
        ListNode next;

        ListNode(int x) {
            val = x;
        }
    }


    public ListNode removeNthFromEnd(ListNode head, int n) {
        ListNode slow = head;
        ListNode fast = head;
        for(int i=0;i<n;i++){
            fast = fast.next;
        }

        if(fast==null){
            head = head.next;
            return head;
        }

        while(fast.next!=null){
            fast = fast.next;
            slow = slow.next;
        }
        slow.next = slow.next.next;

        return head;
    }
}
