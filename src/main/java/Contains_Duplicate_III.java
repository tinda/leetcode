import java.util.TreeSet;

/**
 * Given an array of integers, find out whether there are two distinct indices i and j in the array such that the absolute difference between nums[i] and nums[j] is at most t and the absolute difference between i and j is at most k.
 * https://leetcode.com/problems/contains-duplicate-iii/
 * <p>
 * 解釋：給一個 int[] nums ，以及 2 個正整數 k 與 t，如果存在著 i 與 j 使得 |nums[i] - nums[j]| <= t，且 |i-j|<= k，則回傳 true。若不然，則回傳 false。
 */

public class Contains_Duplicate_III {
    public static boolean containsNearbyAlmostDuplicate(int[] nums, int k, int t) {
        if (nums == null || nums.length == 0 || k <= 0) return false;

        TreeSet<Long> treeSet = new TreeSet<Long>();
        for (int i = 0; i < nums.length; i++) {

            final Long floor = treeSet.floor((long) nums[i] + t);
            final Long ceil = treeSet.ceiling((long) nums[i] - t);

            if ((floor != null && floor >= (long) nums[i]) ||
                    (ceil != null && ceil <= (long) nums[i])) {
                return true;
            }

            treeSet.add((long) nums[i]);
            if (i >= k) {        //因为元素的座標差不能超過k，所以在treeSet中最多只能有k个元素
                treeSet.remove((long) nums[i - k]);
            }
        }
        return false;
    }
}
