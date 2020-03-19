import java.util.LinkedList;
import java.util.List;

/**
 * https://leetcode.com/problems/3sum/
 *
 * Given an array nums of n integers, are there elements a, b, c in nums such that a + b + c = 0? Find all unique triplets in the array which gives the sum of zero.
 * <p>
 * Note:
 * <p>
 * The solution set must not contain duplicate triplets.
 */

public class Sum {

    public List<List<Integer>> threeSum(int[] nums) {

        List<List<Integer>> result = new LinkedList<>();

        for (int i = 0; i < nums.length; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                for (int k = j + 1; k < nums.length; k++) {
                    List<Integer> inside = new LinkedList<>();
                    inside.add(nums[i]);
                    inside.add(nums[j]);
                    inside.add(nums[k]);
                    result.add(inside);
                }
            }
        }

        return result;
    }

}
