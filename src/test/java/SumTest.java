import org.junit.Assert;
import org.junit.Test;

import java.util.LinkedList;
import java.util.List;

public class SumTest {

    @Test
    public void test_nums_0_0_0() {
        int[] nums = {0, 0, 0};

        List<List<Integer>> expected = new LinkedList<>();
        List<Integer> inexpected = new LinkedList<>();
        inexpected.add(0);
        inexpected.add(0);
        inexpected.add(0);
        expected.add(inexpected);

        ShouldBeEqual(nums, expected);
    }

    private static void ShouldBeEqual(int[] nums, List<List<Integer>> expected) {
        List<List<Integer>> actual = new Sum().threeSum(nums);
        Assert.assertEquals(expected, actual);
    }

}