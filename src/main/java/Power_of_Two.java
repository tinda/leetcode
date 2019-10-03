/**
 * Given an integer, write a function to determine if it is a power of two.
 * https://leetcode.com/problems/power-of-two/?tab=Description
 */

public class Power_of_Two {
    public static boolean isPowerOfTwo(int n) {
        if (n <= 0) return false;

        char[] chararray = Integer.toBinaryString(n).toCharArray();
        int counter = 0;
        for (char cha : chararray) {
            if (cha == '1') {
                counter++;
            }
        }
        if (counter == 1) {
            return true;
        }
        return false;
    }
}
