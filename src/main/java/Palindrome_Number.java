/**
 * https://leetcode.com/problems/palindrome-number/
 * <p>
 * Determine whether an integer is a palindrome. An integer is a palindrome when it reads the same backward as forward.
 * <p>
 * Example 1:
 * <p>
 * Input: 121
 * Output: true
 * Example 2:
 * <p>
 * Input: -121
 * Output: false
 * Explanation: From left to right, it reads -121. From right to left, it becomes 121-. Therefore it is not a palindrome.
 * Example 3:
 * <p>
 * Input: 10
 * Output: false
 * Explanation: Reads 01 from right to left. Therefore it is not a palindrome.
 */

public class Palindrome_Number {

    public static void main(String[] args) {
        int input = 121;
        isPalindrome1(input);
    }

    public static boolean isPalindrome(int x) {
        if (x < 0) {
            return false;
        }
        char[] xi = String.valueOf(x).toCharArray();
        String y = "";
        for (int i = xi.length - 1; i > -1; i--) {
            y = y + xi[i];
        }

        return y.equals(String.valueOf(x));
    }

    /**
     * Approach 1: Revert half of the number
     */
    public static boolean isPalindrome1(int x) {
        if (x < 0 || (x % 10 == 0 && x != 0)) {
            return false;
        }

        int revertedNumber = 0;
        while (x > revertedNumber) {
            revertedNumber = revertedNumber * 10 + x % 10;
            x /= 10;
        }

        return x == revertedNumber || x == revertedNumber / 10;
    }

}
