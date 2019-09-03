import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class Single_NumberTest {

    @Test
    public void nums_is_5_singleNumber_should_be_5() {
        int[] nums = {5};
        AssertSingleNumber(nums, 5);
    }

    private static void AssertSingleNumber(int[] nums, int expected) {
        Assert.assertEquals(expected, new Single_Number().singleNumber(nums));
    }
}