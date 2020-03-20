import org.junit.Assert;
import org.junit.Test;

public class Maximum_SubarrayTest {
    @Test
    public void nums_maxSubArray_should_be_6() {
        int[] nums = {-2, 1, -3, 4, -1, 2, 1, -5, 4};
        AssertMaxSubArray(nums, 6);
    }

    private static void AssertMaxSubArray(int[] nums, int expected) {
        Assert.assertEquals(expected, new Maximum_Subarray().maxSubArray(nums));
    }
}