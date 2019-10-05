import org.junit.Assert;
import org.junit.Test;

public class Contains_DuplicateTest {

    @Test
    public void num_is_1_1_should_be_true() {
        int[] nums = {1, 1};
        shouldBeTrue(nums);
    }

    @Test
    public void num_is_1_2_3_1_should_be_true() {
        int[] nums = {1, 2, 3, 1};
        shouldBeTrue(nums);
    }

    private void shouldBeTrue(int[] nums) {
        Assert.assertTrue(Contains_Duplicate.containsDuplicate(nums));
    }
}