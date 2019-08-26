/**
 * Reverse a singly linked list.
 * <p>
 * Example:
 * <p>
 * Input: 1->2->3->4->5->NULL
 * Output: 5->4->3->2->1->NULL
 */

public class Reverse_Linked_List {

    public static void main(String[] args) {
        ListNode listnode1 = new ListNode(1);
        listnode1.next = new ListNode(2);
        listnode1.next.next = new ListNode(3);
        listnode1.next.next.next = new ListNode(4);
        listnode1.next.next.next.next = new ListNode(5);

        ListNode listnode_finall = reverseList(listnode1);
        printlist(listnode_finall);
    }

    public static ListNode reverseList(ListNode head) {
        ListNode prev = null;
        ListNode curr = head;

        while (curr != null) {
            ListNode nextTemp = curr.next;
            curr.next = prev;
            prev = curr;
            curr = nextTemp;
        }
        return prev;
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
