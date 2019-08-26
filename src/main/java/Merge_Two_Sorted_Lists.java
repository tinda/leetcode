/**
 * Merge two sorted linked lists and return it as a new list. The new list should be made by splicing together the nodes of the first two lists.
 * <p>
 * Example:
 * <p>
 * Input: 1->2->4, 1->3->4
 * Output: 1->1->2->3->4->4
 */

public class Merge_Two_Sorted_Lists {

    public static void main(String[] args) {
        ListNode listnode1 = new ListNode(1);
        listnode1.next = new ListNode(2);
        listnode1.next.next = new ListNode(4);

        ListNode listnode2 = new ListNode(1);
        listnode2.next = new ListNode(3);
        listnode2.next.next = new ListNode(4);

        ListNode listnode3 = null;
        ListNode listnode4 = new ListNode(0);

        ListNode listnode5 = new ListNode(5);
        ListNode listnode6 = new ListNode(1);
        listnode6.next = new ListNode(2);
        listnode6.next.next = new ListNode(4);

        ListNode listnode_finall = mergeTwoLists(listnode5, listnode6);
        printlist(listnode_finall);
    }

    public static ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        if (l1 == null) return l2;
        if (l2 == null) return l1;
        if (l1.val < l2.val) {
            l1.next = mergeTwoLists(l1.next, l2);
            return l1;
        } else {
            l2.next = mergeTwoLists(l1, l2.next);
            return l2;
        }
    }

    public static void printlist(ListNode ln) {
        if (ln != null) {
            System.out.print(ln.val);
            if (ln.next != null)
                printlist(ln.next);
        }
    }


    public static class ListNode {
        int val;
        ListNode next;

        ListNode(int x) {
            val = x;
        }
    }
}

