import java.util.HashMap;
import java.util.TreeSet;

/**
 * https://leetcode.com/problems/contains-duplicate-iii/
 *
 * Given an array of integers, find out whether there are two distinct indices i and j in the array such that the absolute difference between nums[i] and nums[j] is at most t and the absolute difference between i and j is at most k.
 *
 * 解釋：給一個 int[] nums ，以及 2 個正整數 k 與 t，如果存在著 i 與 j 使得 |nums[i] - nums[j]| <= t，且 |i-j|<= k，則回傳 true。若不然，則回傳 false。
 */

public class Contains_Duplicate_III {
    public static boolean containsNearbyAlmostDuplicate(int[] nums, int k, int t) {
        if (nums == null || nums.length == 0 || k <= 0) return false;

        TreeSet<Long> treeSet = new TreeSet<Long>();
        for (int i = 0; i < nums.length; i++) {

            final Long floor = treeSet.floor((long) nums[i] + t);
            final Long ceil = treeSet.ceiling((long) nums[i] - t);

            if ((floor != null && floor >= (long) nums[i]) || (ceil != null && ceil <= (long) nums[i])) {
                return true;
            }

            treeSet.add((long) nums[i]);
            if (i >= k) {        //因为元素的座標差不能超過k，所以在treeSet中最多只能有k个元素
                treeSet.remove((long) nums[i - k]);
            }
        }
        return false;
    }

    /**
     * @param nums
     * @param k
     * @param t
     * @return 平衡樹的方法。複雜度O(nlogk)
     * <p>
     * 題意有：-t <= x- nums[i] <= t
     * <p>
     * 左邊有 nums[i]  – t <= x 因此把符合條件的數構建成一顆平衡樹，然後查找一個最小的x使得x>= nums[i] – t
     * <p>
     * 如果該x還滿足 x  <= t + nums[i]就是我們要的答案啦
     */
    public static boolean containsNearbyAlmostDuplicate2(int[] nums, int k, int t) {
        if (k <= 0 || t < 0) return false;
        TreeSet<Long> tree = new TreeSet<>();
        for (int i = 0; i < nums.length; i++) {
            // ceiling(E e) 方法用來返回在此設定為大於或等於給定的元素的最小元素，或null，如果不存在這樣的元素。
            Long x = tree.ceiling((long) nums[i] - t);
            if (x != null && x <= (long) nums[i] + t) return true;
            if (i >= k)
                tree.remove((long) nums[i - k]);
            tree.add((long) nums[i]);
        }
        return false;
    }

    public static boolean containsNearbyAlmostDuplicate3(int[] nums, int k, int t) {
        if (k <= 0 || t < 0) return false;
        HashMap<Long, Long> keyToNum = new HashMap<>();
        long div = (long) t + 1;
        for (int i = 0; i < nums.length; i++) {
            long num = (long) nums[i];
            long key = num / div;
            if (num < 0) key--;
            if (keyToNum.containsKey(key)
                    || keyToNum.containsKey(key + 1) && keyToNum.get(key + 1) - num <= t
                    || keyToNum.containsKey(key - 1) && num - keyToNum.get(key - 1) <= t)
                return true;
            if (i >= k) keyToNum.remove(((long) nums[i - k]) / div);
            keyToNum.put(key, num);
        }
        return false;
    }
}
