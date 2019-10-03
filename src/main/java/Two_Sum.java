import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

/**
 * Given an array of integers, return indices of the two numbers such that they add up to a specific target.
 * <p>
 * You may assume that each input would have exactly one solution, and you may not use the same element twice.
 */

public class Two_Sum {

    public static void main(String[] args) {
        int[] nums = {2, 7, 11, 15};
        int target = 9;
        System.out.println(twoSum(nums, target));
    }

    public static int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> dictionary = new HashMap();
        for (int i = 0; i < nums.length; i++) {
            int key = target - nums[i];
            if (dictionary.containsKey(key)) {
                return new int[]{dictionary.get(key), i};
            } else if (!dictionary.containsKey(nums[i])) {
                dictionary.put(nums[i], i);
            }
        }
        return null;
    }

    public static int[] twoSum1(int[] nums, int target) {
        Arrays.sort(nums);

        int start = 0;
        int end = nums.length - 1;

        while (start < end) {
            if (nums[start] + nums[end] == target) {
                return new int[]{Math.min(start, end), Math.max(start, end)};
            } else if (nums[start] + nums[end] < target) {
                start++;
            } else {
                end--;
            }
        }
        return null;
    }

    public static int[] twoSum2(int[] nums, int target) {
        if (nums.length == 0)
            return nums;
        for (int i = 0; i < nums.length; i++) {
            for (int j = 0; j < nums.length; j++) {
                if ((nums[i] + nums[j] == target) && (i != j)) {
                    System.out.println(i + " " + j);
                    return new int[]{i, j};
                }
            }
        }

        return nums;
    }
}
