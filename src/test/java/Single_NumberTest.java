import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class Single_NumberTest {

    @Test
    public void nums_is_5_singleNumber_should_be_5() {
        int[] nums = {5};
        Assert.assertEquals(5, new Single_Number().singleNumber(nums));
    }
}