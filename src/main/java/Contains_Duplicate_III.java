import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

/**
 * Given an array of integers, find out whether there are two distinct indices i and j in the array such that the absolute difference between nums[i] and nums[j] is at most t and the absolute difference between i and j is at most k.
 * https://leetcode.com/problems/contains-duplicate-iii/
 */

public class Contains_Duplicate_III {
    public static boolean containsNearbyAlmostDuplicate(int[] nums, int k, int t) {
        if (k == 0) {
            return false;
        }

        Arrays.sort(nums);

        List<Integer> list = new LinkedList<>();

        for (int i = 0; i < nums.length; i++) {
            list.add(nums[i]);

            if (i > 0) {
                //single
                int counter = 1;
                while ((i - counter) >= 0) {
                    int diffValue = list.get(i) - list.get(i - counter);
                    if (diffValue > t) {
                        break;
                    }

                    int diffIndex = Math.abs(nums[i] - nums[i - counter]);
                    if (diffIndex <= k) {
                        return true;
                    }
                    counter++;
                }
            }
        }
        return false;
    }
}
