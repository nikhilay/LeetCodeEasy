/**
 * Created by Nikhil on 10/22/16.
 */

import static com.sun.tools.javac.jvm.ByteCodes.ret;

/**
 * Given a singly linked list, determine if it is a palindrome.
 * Follow up:
 * Could you do it in O(n) time and O(1) space?
 */

public class PalindromLinkedList {

    public class ListNode {
        int val;
        ListNode next;

        ListNode(int x) {
            val = x;
        }
    }

    ListNode left;

    public boolean isPalindrome(ListNode head) {
        if (head == null) return true;
        left = head;
        return helper(head.next);

    }

    private boolean helper(ListNode right) {
        if (right == null) {
            return true;
        }

        boolean res = helper(right.next);
        if (!res) return false;

        if (left.val != right.val) {
            return false;

        }
        left = left.next;
        return true;
    }

}
