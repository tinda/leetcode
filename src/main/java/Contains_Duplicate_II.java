import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

/**
 * Given an array of integers and an integer k, find out whether there are two distinct indices i and j in the array such that nums[i] = nums[j] and the absolute difference between i and j is at most k.
 * https://leetcode.com/problems/contains-duplicate-ii/
 * <p>
 * 題目解釋：給一個 int[] nums ，以及一正整數 k ，如果存在著 i 與 j 使得 nums[i] = nums[j]，且 |i-j|<= k，則回傳 true。若不然，則回傳 false。
 */

public class Contains_Duplicate_II {
    public static boolean containsNearbyDuplicate(int[] nums, int k) {
        if (k == 0) return false;

        int windowSize = k + 1;
        for (int i = 0; i < nums.length; i++) {
            System.out.println("**-> " + i);
            List<Integer> windowNums = Arrays.stream(nums).skip(i).limit(windowSize).boxed().collect(Collectors.toList());
            Set<Integer> set = new HashSet<>();
            for (int num : windowNums) {
                System.out.println("*-> " + num);
                if (!set.add(num)) return true;
            }
        }

        return false;
    }
}
