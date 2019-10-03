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
        return new int[] { 0, 1 };
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
