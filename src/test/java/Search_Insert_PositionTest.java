import org.junit.Assert;
import org.junit.Test;

public class Search_Insert_PositionTest {
    @Test
    public void nums_is_1_3_5_6_target_is_5_searchInsert_should_be_2() {
        int[] nums = {1, 3, 5, 6};
        AssertSearchInsert(nums, 5, 2);
    }

    private static void AssertSearchInsert(int[] nums, int target, int expected) {
        Assert.assertEquals(expected, new Search_Insert_Position().searchInsert(nums, target));
    }

}