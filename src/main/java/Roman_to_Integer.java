/**
 * https://leetcode.com/problems/roman-to-integer/
 * <p>
 * Roman numerals are represented by seven different symbols: I, V, X, L, C, D and M.
 * <p>
 * Symbol       Value
 * I             1
 * V             5
 * X             10
 * L             50
 * C             100
 * D             500
 * M             1000
 * For example, two is written as II in Roman numeral, just two one's added together. Twelve is written as, XII, which is simply X + II. The number twenty seven is written as XXVII, which is XX + V + II.
 * <p>
 * Roman numerals are usually written largest to smallest from left to right. However, the numeral for four is not IIII. Instead, the number four is written as IV. Because the one is before the five we subtract it making four. The same principle applies to the number nine, which is written as IX. There are six instances where subtraction is used:
 * <p>
 * I can be placed before V (5) and X (10) to make 4 and 9.
 * X can be placed before L (50) and C (100) to make 40 and 90.
 * C can be placed before D (500) and M (1000) to make 400 and 900.
 * Given a roman numeral, convert it to an integer. Input is guaranteed to be within the range from 1 to 3999.
 */

public class Roman_to_Integer {

    public static void main(String[] args) {
        System.out.println(romanToInt("IX"));
    }

    public static int romanToInt(String s) {
        char[] chars = s.toCharArray();

        int output = 0;
        for (int i = 0; i < chars.length; i++) {
            switch (chars[i]) {
                case 'I':
                    if ((i + 1 != chars.length) && ((chars[i + 1] == 'V') || (chars[i + 1] == 'X'))) {
                        output += -1;
                    } else {
                        output += 1;
                    }
                    break;
                case 'V':
                    output += 5;
                    break;
                case 'X':
                    if ((i + 1 != chars.length) && ((chars[i + 1] == 'L') || (chars[i + 1] == 'C'))) {
                        output += -10;
                    } else {
                        output += 10;
                    }
                    break;
                case 'L':
                    output += 50;
                    break;
                case 'C':
                    if ((i + 1 != chars.length) && ((chars[i + 1] == 'D') || (chars[i + 1] == 'M'))) {
                        output += -100;
                    } else {
                        output += 100;
                    }
                    break;
                case 'D':
                    output += 500;
                    break;
                case 'M':
                    output += 1000;
                    break;
            }
        }
        return output;
    }
}
