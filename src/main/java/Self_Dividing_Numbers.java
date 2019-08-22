import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

/**
 *
 */

public class Self_Dividing_Numbers {

    public static void main(String[] args) {
        int left = 1;
        int right = 22;
        System.out.println(selfDividingNumbers(left, right));
    }

    public static List<Integer> selfDividingNumbers(int left, int right) {
        List<Integer> list = new LinkedList<>();

        for (int i = left; i < right + 1; i++) {
            if (!String.valueOf(i).contains("0")) {
                char[] x = String.valueOf(i).toCharArray();

                int counter = 0;
                for (int j = 0; j < x.length; j++) {
                    long y = (long) i % (long) Integer.parseInt(String.valueOf(x[j]));
                    System.out.println(i + " % " + x[j] + " = " + y);
                    if (y == 0) {
                        counter++;
                    }
                }
                if (counter == x.length) {
                    list.add(i);
                }
            }
        }

        return list;
    }

    public List<Integer> selfDividingNumbers2(int left, int right) {
        List<Integer> ans = new ArrayList();
        for (int n = left; n <= right; ++n) {
            if (selfDividing(n)) ans.add(n);
        }
        return ans;
    }
    public boolean selfDividing(int n) {
        for (char c: String.valueOf(n).toCharArray()) {
            if (c == '0' || (n % (c - '0') > 0))
                return false;
        }
        return true;
    }
}
