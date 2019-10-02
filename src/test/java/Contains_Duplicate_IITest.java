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

}