import org.junit.Assert;
import org.junit.Test;

public class Contains_Duplicate_IITest {

    /**
     * 第一個紅燈，k = 0，應回傳 false。
     */

    @Test
    public void Test_k_is_zero_should_return_false() {
        int[] nums = new int[]{1, 2, 3, 1, 2};
        int k = 0;
        Assert.assertFalse(Contains_Duplicate_II.containsNearbyDuplicate(nums, k));
    }

    /**
     * 新增一個測試案例， nums = {5,5}, k = 1, return true;
     */

    @Test
    public void Test_nums_5_5_and_k_is_1_should_return_true()
    {
        int[] nums = new int[] { 5, 5 };
        int k = 1;
        Assert.assertTrue(Contains_Duplicate_II.containsNearbyDuplicate(nums, k));
    }

    /**
     * 新增一個測試案例，nums = {5,6}, k = 1, return false;
     */
    @Test
    public void Test_nums_5_6_and_k_is_1_should_return_false()
    {
        int[] nums = new int[] { 5, 6 };
        int k = 1;
        Assert.assertFalse(Contains_Duplicate_II.containsNearbyDuplicate(nums, k));
    }
}