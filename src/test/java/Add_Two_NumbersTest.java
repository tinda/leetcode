import org.junit.Assert;
import org.junit.Test;

public class Add_Two_NumbersTest {

    @Test
    public void L1_is_5_and_L2_is_4_should_return_9() {
        Add_Two_Numbers.ListNode l1 = new Add_Two_Numbers.ListNode(5);
        Add_Two_Numbers.ListNode l2 = new Add_Two_Numbers.ListNode(4);
        Add_Two_Numbers.ListNode expected = new Add_Two_Numbers.ListNode(9);

        AssertResult(expected, l1, l2);
    }

    private static void AssertResult(Add_Two_Numbers.ListNode expected, Add_Two_Numbers.ListNode l1, Add_Two_Numbers.ListNode l2) {
        Assert.assertSame(expected.val, new Add_Two_Numbers().addTwoNumbers(l1, l2).val);
    }
}