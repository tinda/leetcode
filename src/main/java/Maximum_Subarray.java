/**
 * https://leetcode.com/problems/maximum-subarray/
 * Given an integer array nums, find the contiguous subarray (containing at least one number) which has the largest sum and return its sum.
 * <p>
 * Example:
 * <p>
 * Input: [-2,1,-3,4,-1,2,1,-5,4],
 * Output: 6
 * Explanation: [4,-1,2,1] has the largest sum = 6.
 * <p>
 * 參考:https://ithelp.ithome.com.tw/articles/10213270
 */

public class Maximum_Subarray {

    public int maxSubArray(int[] nums) {
        int cur = nums[0];
        int res = nums[0];
        for (int i = 1; i < nums.length; i++) {
            cur += nums[i];
            if (cur < nums[i] || nums[i] > cur) {
                cur = nums[i];
            }
            if (res < cur) {
                res = cur;
            }
        }
        return res;
    }

}
