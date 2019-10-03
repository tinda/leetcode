import org.junit.Assert;
import org.junit.Test;

public class Contains_Duplicate_IIITest {

    /**
     * 第一個紅燈，k =0 應回傳 false
     */
    @Test
    public void k_is_0_should_return_false() {
        int[] nums = {9};
        ShouldBeFalse(nums, 0, 0);
    }

    private static void ShouldBeFalse(int[] nums, int k, int t) {
        Assert.assertFalse(Contains_Duplicate_III.containsNearbyAlmostDuplicate(nums, k, t));
    }
}