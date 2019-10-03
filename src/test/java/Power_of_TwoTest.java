import org.junit.Assert;
import org.junit.Test;

public class Power_of_TwoTest {
    /**
     * Step 1: n 為 0 或 負數，應回傳 false
     */
    @Test
    public void n_is_less_or_equal_0_should_return_false() {
        int n = 0;
        ShouldBeFalse(n);
    }

    private static void ShouldBeFalse(int n) {
        Assert.assertFalse(Power_of_Two.isPowerOfTwo(n));
    }
}