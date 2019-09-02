import org.junit.Assert;
import org.junit.Test;

import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class Add_Two_NumbersTest {

    @Test
    public void L1_is_5_and_L2_is_4_should_return_9() {
        Add_Two_Numbers.ListNode l1 = new Add_Two_Numbers.ListNode(5);
        Add_Two_Numbers.ListNode l2 = new Add_Two_Numbers.ListNode(4);
        Add_Two_Numbers.ListNode expected = new Add_Two_Numbers.ListNode(9);

        AssertResult(expected, l1, l2);
    }

    @Test
    public void Test_All_ListNode_is_4_1() {
        Add_Two_Numbers.ListNode node = new Add_Two_Numbers.ListNode(4);
        node.next = new Add_Two_Numbers.ListNode(1);

        LinkedList expected = new LinkedList<Integer>();
        expected.add(4);
        expected.add(1);

        for (int i : node.All()) {
            System.out.println(">" + i);
        }

        for (int i = 0; i < expected.size(); i++) {
            System.out.println(">>" + expected.get(i));
        }

        System.out.println(expected.equals(node.All()));
    }

    @Test
    public void L1_is_8_and_L2_is_6_should_return_4_1() {
        Add_Two_Numbers.ListNode l1 = new Add_Two_Numbers.ListNode(8);
        Add_Two_Numbers.ListNode l2 = new Add_Two_Numbers.ListNode(6);

        Add_Two_Numbers.ListNode expected2 = CreateListNodes(new int[]{4, 1});

        AssertResult(expected2, l1, l2);
    }

    @Test
    public void L1_is_5_4_and_L2_is_3_should_return_8_4() {
        Add_Two_Numbers.ListNode l1 = CreateListNodes(new int[]{5, 4});
        Add_Two_Numbers.ListNode l2 = CreateListNodes(new int[]{3});
        Add_Two_Numbers.ListNode expected = CreateListNodes(new int[]{8, 4});

        AssertResult(expected, l1, l2);
    }

    @Test
    public void L1_is_5_and_L2_is_3_4_should_return_8_4() {
        Add_Two_Numbers.ListNode l1 = new Add_Two_Numbers.ListNode(5);
        Add_Two_Numbers.ListNode l2 = CreateListNodes(new int[]{3, 4});
        Add_Two_Numbers.ListNode expected = CreateListNodes(new int[]{8, 4});

        AssertResult(expected, l1, l2);
    }

    @Test
    public void L1_is_5_4_3_and_L2_is_2_should_return_7_4_3() {
        Add_Two_Numbers.ListNode l1 = CreateListNodes(new int[]{5, 4, 3});
        Add_Two_Numbers.ListNode l2 = new Add_Two_Numbers.ListNode(2);
        Add_Two_Numbers.ListNode expected = CreateListNodes(new int[]{7, 4, 3});
        AssertResult(expected, l1, l2);
    }

    @Test
    public void L1_is_5_and_L2_is_1_2_3_should_return_6_2_3() {
        Add_Two_Numbers.ListNode l1 = new Add_Two_Numbers.ListNode(5);
        Add_Two_Numbers.ListNode l2 = CreateListNodes(new int[]{1, 2, 3});
        Add_Two_Numbers.ListNode expected = CreateListNodes(new int[]{6, 2, 3});
        AssertResult(expected, l1, l2);
    }

    @Test
    public void L1_is_5_4_and_L2_is_2_8_should_return_7_2_1() {
        Add_Two_Numbers.ListNode l1 = CreateListNodes(new int[]{5, 4});
        Add_Two_Numbers.ListNode l2 = CreateListNodes(new int[]{2, 8});
        Add_Two_Numbers.ListNode expected = CreateListNodes(new int[]{7, 2, 1});
        AssertResult(expected, l1, l2);
    }

    private static Add_Two_Numbers.ListNode CreateListNodes(int[] nums) {
        if (nums.length == 0) {
            return null;
        }

        Add_Two_Numbers.ListNode listNode = new Add_Two_Numbers.ListNode(nums[0]);

        Add_Two_Numbers.ListNode currentNode = listNode;
        for (int i = 1; i < nums.length; i++) {
            currentNode.next = new Add_Two_Numbers.ListNode(nums[i]);
            currentNode = currentNode.next;
        }

        return listNode;
    }

    private static void AssertResult(Add_Two_Numbers.ListNode expected, Add_Two_Numbers.ListNode l1, Add_Two_Numbers.ListNode l2) {
        Assert.assertEquals(expected.All(), new Add_Two_Numbers().addTwoNumbers(l1, l2).All());
    }
}