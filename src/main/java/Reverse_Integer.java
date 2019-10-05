/**
 * Given a 32-bit signed integer, reverse digits of an integer.
 */

public class Reverse_Integer {

    public static void main(String[] args) {

        System.out.println(reverse(1534236469));

    }

    public static int reverse(int x) {

        if (x > 2147483647) {
            return 0;
        } else if (x < -2147483647) {
            return 0;
        }

        int z = 0;
        if (x < 0) {
            z = 1;
        }

        char[] chars = String.valueOf(Math.abs(x)).toCharArray();

        String y = "";
        for (int i = chars.length - 1; i >= 0; i--) {
            y += chars[i];
        }

        if (Double.parseDouble(y) > 2147483647) {
            return 0;
        }

        if (z == 1) {
            return Integer.parseInt(y) * (-1);
        }

        return Integer.parseInt(y);
    }

    public int reverse2(int x) {
        int rev = 0;
        while (x != 0) {
            int pop = x % 10;
            x /= 10;
            if (rev > Integer.MAX_VALUE / 10 || (rev == Integer.MAX_VALUE / 10 && pop > 7)) return 0;
            if (rev < Integer.MIN_VALUE / 10 || (rev == Integer.MIN_VALUE / 10 && pop < -8)) return 0;
            rev = rev * 10 + pop;
        }
        return rev;
    }

    public int reverse3(int x) {
        long res = 0;
        while (x != 0) {
            res = res * 10 + x % 10;
            x = x / 10;
        }

        if (res < Integer.MIN_VALUE || res > Integer.MAX_VALUE) {
            return 0;
        } else {
            return (int) res;
        }
    }

    public int reverse4(int x) {
        String reversed = new StringBuilder().append(Math.abs(x)).reverse().toString();
        try {
            return (x < 0) ? Integer.parseInt(reversed) * -1 : Integer.parseInt(reversed);
        } catch (NumberFormatException e) {
            return 0;
        }
    }
}
