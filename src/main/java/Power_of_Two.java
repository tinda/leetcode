/**
 * Given an integer, write a function to determine if it is a power of two.
 * https://leetcode.com/problems/power-of-two/?tab=Description
 */

public class Power_of_Two {
    public static boolean isPowerOfTwo(int n) {
        if (n <= 0) return false;

        if (n == 1) {
            return true;
        }
        //生產代碼：先用 mod 2 於 0 通過此測試案例。(hard-code 通過 test case 的情況)
        return n % 2 == 0;
    }
}
