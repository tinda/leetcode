/**
 * https://leetcode.com/problems/power-of-three/?tab=Description
 *
 * Given an integer, write a function to determine if it is a power of three.
 *
 */

public class Power_of_Three {
    public static boolean isPowerOfThree(int n) {
        if (n <= 0) return false;
        return (Math.log10(n) / Math.log10(3)) % 1 == 0;
    }
}
