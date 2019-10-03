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

    /**
     * 新增一個測試案例，當 nums 長度小於 2，應回傳 false
     */
    @Test
    public void nums_length_less_than_2_should_return_false() {
        int[] nums = {9};
        ShouldBeFalse(nums, 1, 1);
    }

    /**
     * 新增一個失敗的測試案例，當 t = 0 時，應等同於 leet code 219 的需求
     */
    @Test
    public void when_t_is_0_and_k_is_1_nums_5_5_should_return_true() {
        int[] nums = {5, 5};
        ShouldBeTrue(nums, 1, 0);
    }

    /**
     * 新增相關測試案例與產品代碼，以滿足所有 t = 0 的情況
     */
    @Test
    public void when_t_is_0_and_k_is_1_nums_5_6_5_should_return_false() {
        int[] nums = {5, 6, 5};
        ShouldBeFalse(nums, 1, 0);
    }

    /**
     * 新增第一個 t 不為 0 失敗的測試案例
     */
    @Test
    public void when_t_is_1_and_k_is_1_nums_5_6_should_return_true() {
        int[] nums = {5, 6};
        ShouldBeTrue(nums, 1, 1);
    }

    /**
     * 新增一個失敗的測試案例，nums={6,5}, k=1, t=1
     */
    @Test
    public void when_t_is_1_and_k_is_1_nums_6_5_should_return_true() {
        int[] nums = {6, 5};
        ShouldBeTrue(nums, 1, 1);
    }

    private void ShouldBeFalse(int[] nums, int k, int t) {
        Assert.assertFalse(Contains_Duplicate_III.containsNearbyAlmostDuplicate(nums, k, t));
    }

    private void ShouldBeTrue(int[] nums, int k, int t) {
        Assert.assertTrue(Contains_Duplicate_III.containsNearbyAlmostDuplicate(nums, k, t));
    }
}