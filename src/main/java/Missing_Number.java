import java.util.Arrays;

/**
 * Given an array containing n distinct numbers taken from 0, 1, 2, ..., n, find the one that is missing from the array.
 */

public class Missing_Number {
    public static void main(String[] args) {
        int[] nums = {0, 2, 3};
        System.out.println(missingNumber(nums));
    }

    public static int missingNumber(int[] nums) {
        Arrays.sort(nums);
        int result = 0;

        if (nums[0] != 0) {
            return 0;
        }

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != i) {
                return i;
            } else {
                result = i + 1;
            }
        }
        return result;
    }

    public int missingNumber2(int[] nums) {
        int expectedSum = nums.length * (nums.length + 1) / 2;
        int actualSum = 0;
        for (int num : nums) actualSum += num;
        return expectedSum - actualSum;
    }
}
