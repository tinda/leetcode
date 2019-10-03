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

    /**
     * Step 3, 新增失敗測試案例，Test_nums_is_1_2_4_and_target_is_5_should_return_0_2
     */
    @Test
    public void Test_nums_is_1_2_4_and_target_is_5_should_return_0_2() {
        int[] nums = {1, 2, 4};
        int[] actual = TwoSum(nums, 5);

        int[] expected = {0, 2};
        ShouldEqual(expected, actual);
    }

    /**
     * Step 8, 新增測試案例，Test_nums_is_3_2_4_and_target_is_6_should_return_1_2
     */
    @Test
    public void Test_nums_is_3_2_4_and_target_is_6_should_return_1_2() {
        int[] nums = {3, 2, 4};
        int[] actual = TwoSum(nums, 6);

        int[] expected = {1, 2};
        ShouldEqual(expected, actual);
    }

    private static int[] TwoSum(int[] nums, int target) {
        return Two_Sum.twoSum(nums, target);
    }

    private static void ShouldEqual(int[] expected, int[] actual) {
        Assert.assertArrayEquals(expected, actual);
    }


}