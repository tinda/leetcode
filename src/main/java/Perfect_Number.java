/**
 *
 */
public class Perfect_Number {

    public static void main(String[] args) {
        int num = 99999997;
        System.out.println(checkPerfectNumber(num));
    }

    public static boolean checkPerfectNumber(int num) {
        int count = 0;
        for (int i = 1; i < num - 1; i++) {
            if (num % i == 0) {
                count = count + i;
            }
        }
        if (num == count) {
            return true;
        } else {
            return false;
        }
    }

    public boolean checkPerfectNumber2(int num) {
        if (num == 1) {
            return false;
        }
        int sum = 0;
        for (int i = 2; i <= Math.sqrt(num); i++) {
            if (num % i == 0) {
                sum += i;
                if (i != num / i) sum += num / i;
            }
        }
        sum++;

        return sum == num;

    }
}
