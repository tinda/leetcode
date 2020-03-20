/**
 * https://leetcode.com/problems/remove-duplicates-from-sorted-list/
 * Given a sorted linked list, delete all duplicates such that each element appear only once.
 * <p>
 * Example 1:
 * Input: 1->1->2
 * Output: 1->2
 *
 * Example 2:
 * Input: 1->1->2->3->3
 * Output: 1->2->3
 * 參考：https://ithelp.ithome.com.tw/articles/10213274
 */

public class Remove_Duplicates_from_Sorted_List {
    public ListNode deleteDuplicates(ListNode head) {

        return head;
    }


    public class ListNode {
        int val;
        ListNode next;

        ListNode(int x) {
            val = x;
        }
    }

}
