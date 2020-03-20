/**
 * https://leetcode.com/problems/search-insert-position/
 * Given a sorted array and a target value, return the index if the target is found. If not, return the index where it would be if it were inserted in order.
 * <p>
 * You may assume no duplicates in the array.
 * <p>
 * Example 1:
 * Input: [1,3,5,6], 5
 * Output: 2
 * <p>
 * Example 2:
 * Input: [1,3,5,6], 2
 * Output: 1
 * <p>
 * Example 3:
 * Input: [1,3,5,6], 7
 * Output: 4
 * <p>
 * Example 4:
 * Input: [1,3,5,6], 0
 * Output: 0
 * <p>
 * 參考:https://ithelp.ithome.com.tw/articles/10213268
 */

public class Search_Insert_Position {
    public int searchInsert(int[] nums, int target) {
        if (nums == null || nums.length == 0) {
            return 0;
        }
        int i = 0, j = nums.length - 1;
        int index = -1;
        while (i <= j) {
            index = (i + j) / 2;
            if (nums[index] == target)
                return index;
            if (nums[index] >= target)
                j = index - 1;
            else
                i = index + 1;
        }
        return i;
    }
}
