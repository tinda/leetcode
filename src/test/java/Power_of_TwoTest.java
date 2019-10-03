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

    /**
     * Step 2: n 為 1，應為 2 的次方
     */
    @Test
    public void n_is_1_should_return_true() {
        int n = 1;
        ShouldBeTrue(n);
    }

    private static void ShouldBeTrue(int n) {
        Assert.assertTrue(Power_of_Two.isPowerOfTwo(n));
    }

    private static void ShouldBeFalse(int n) {
        Assert.assertFalse(Power_of_Two.isPowerOfTwo(n));
    }
}