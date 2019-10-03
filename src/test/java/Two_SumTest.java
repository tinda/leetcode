import org.junit.Assert;
import org.junit.Test;

public class Two_SumTest {

    /**
     * 測試案例代表性：最單純的情境，nums長度為 2，結果為 {0, 1}
     */
    @Test
    public void Test_nums_is_1_8_and_target_is_9_should_return_0_1() {
        int[] nums = {1, 8};
        int[] actual = TwoSum(nums, 9);

        int[] expected = {0, 1};
        ShouldEqual(expected, actual);
    }

    private static int[] TwoSum(int[] nums, int target)
    {
        return Two_Sum.twoSum(nums, target);
    }

    private static void ShouldEqual(int[] expected, int[] actual)
    {
        Assert.assertArrayEquals(expected, actual);
    }


}