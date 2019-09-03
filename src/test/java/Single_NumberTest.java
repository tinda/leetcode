import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class Single_NumberTest {

    @Test
    public void nums_is_5_singleNumber_should_be_5() {
        int[] nums = {5};
        AssertSingleNumber(nums, 5);
    }

    @Test
    public void nums_is_4_5_4_singleNumber_should_be_5() {
        int[] nums = {4, 5, 4};
        AssertSingleNumber(nums, 5);
    }

    @Test
    public void nums_is_4_2_4_7_2_singleNumber_should_be_7() {
        int[] nums = {4, 2, 4, 7, 2};
        AssertSingleNumber(nums, 7);
    }

    private static void AssertSingleNumber(int[] nums, int expected) {
        Assert.assertEquals(expected, new Single_Number().singleNumber(nums));
    }
}