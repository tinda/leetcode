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
        return CreateSumNode(l1, l2, 0);
    }

    public ListNode addTwoNumbers_old(ListNode l1, ListNode l2) {

        int carry_0 = 0;
        int l1Val = l1.val;
        int l2Val = l2.val;

        int rootSum = carry_0 + l1Val + l2Val;
        int rootVal = rootSum % 10;

        ListNode result = new ListNode(rootVal);

        boolean needCarry = rootSum >= 10;
        boolean hasl1Next = l1.next != null;
        boolean hasl2Next = l2.next != null;

        if (needCarry || hasl1Next || hasl2Next) {
            int carry = needCarry ? 1 : 0;
            int l1NextVal = l1.next != null ? l1.next.val : 0;
            int l2NextVal = l2.next != null ? l2.next.val : 0;

            int nextSum = carry + l1NextVal + l2NextVal;
            int nextVal = nextSum % 10;

            result.next = new ListNode(nextVal);

            boolean needCarry_2 = nextSum >= 10;
            boolean hasl1Next_2 = hasl1Next && l1.next.next != null;
            boolean hasl2Next_2 = hasl2Next && l2.next.next != null;

            if (needCarry_2 || hasl1Next_2 || hasl2Next_2) {
                int carry_2 = needCarry_2 ? 1 : 0;
                int l1Next_2_Val = l1.next.next != null ? l1.next.val : 0;
                int l2Next_2_Val = l2.next.next != null ? l2.next.val : 0;
                result.next.next = new ListNode(carry_2 + l1Next_2_Val + l2Next_2_Val);
            }
        }

        return result;
    }

    private ListNode CreateSumNode(ListNode l1, ListNode l2, int carry) {
        if (l1 == null && l2 == null) {
            return carry == 0 ? null : new ListNode(carry);
        }

        int l1Val = l1 != null ? l1.val : 0;
        int l2Val = l2 != null ? l2.val : 0;

        int rootSum = carry + l1Val + l2Val;

        ListNode result = new ListNode(rootSum % 10);

        int carryNext = rootSum >= 10 ? 1 : 0;
        result.next = CreateSumNode(l1.next != null ? l1.next : null, l2.next != null ? l2.next : null, carryNext);

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


