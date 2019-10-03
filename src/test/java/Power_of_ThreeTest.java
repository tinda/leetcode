import org.junit.Assert;
import org.junit.Test;

public class Power_of_ThreeTest {
    /**
     * Step 1: n 為 3，應回傳 true
     */
    @Test
    public void n_is_3_should_be_true() {
        int n = 3;
        Assert.assertTrue(Power_of_Three.isPowerOfThree(n));
    }

    /**
     * Step 2: n 為 243，應回傳 true
     */
    @Test
    public void n_is_243_should_be_true() {
        int n = 243;
        Assert.assertTrue(Power_of_Three.isPowerOfThree(n));
    }

}