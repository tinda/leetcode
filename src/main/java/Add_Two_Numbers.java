import java.util.Collection;
import java.util.LinkedList;
import java.util.List;

/**
 * https://leetcode.com/problems/add-two-numbers/
 * <p>
 * You are given two non-empty linked lists representing two non-negative integers. The digits are stored in reverse order and each of their nodes contain a single digit. Add the two numbers and return it as a linked list.
 * <p>
 * You may assume the two numbers do not contain any leading zero, except the number 0 itself.
 * <p>
 * Example:
 * <p>
 * Input: (2 -> 4 -> 3) + (5 -> 6 -> 4)
 * Output: 7 -> 0 -> 8
 * Explanation: 342 + 465 = 807.
 */


public class Add_Two_Numbers {

    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        int rootSum = l1.val + l2.val;
        int rootVal = rootSum % 10;

        ListNode result = new ListNode(rootVal);
        if (rootSum >= 10) {
            result.next = new ListNode(1);
        } else if (l1.next != null) {
            result.next = new ListNode(l1.next.val);
        } else if (l2.next != null) {
            result.next = new ListNode(l2.next.val);
        }

        return result;
    }


    public static class ListNode {
        public int val;
        public ListNode next;

        public ListNode(int x) {
            val = x;
        }

        public Iterable<Integer> All() {
            LinkedList result = new LinkedList<Integer>();
            result.add(this.val);

            if (this.next != null) {
                result.addAll((Collection) next.All());
            }
            return result;
        }
    }

}


