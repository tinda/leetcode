import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class Single_Number {

    public static void main(String[] args) {
        int[] nums = {2, 2, 1};
        System.out.println(singleNumber(nums));
    }

    public static int singleNumber(int[] nums) {
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            if (map.get(nums[i]) != null) {
                map.remove(nums[i]);
            } else {
                map.put(nums[i], nums[i]);
            }
        }
        String y = map.keySet().toString();
        int x = Integer.parseInt(y.replace("[", "").replace("]", ""));
        return x;
    }

    public static int singleNumber1(int[] nums) {
        Arrays.sort(nums);
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            if (map.get(nums[i]) != null) {
                map.remove(nums[i]);
            } else {
                map.put(nums[i], nums[i]);
            }
        }
        String y = map.values().toString();
        int x = Integer.parseInt(y.replace("[", "").replace("]", ""));
        return x;
    }

    public int singleNumber2(int[] nums) {
        int result = 0;
        for (int i : nums) {
            result ^= i;
        }
        return result;
    }

    public int singleNumber3(int[] nums) {
        /**
         * we use bitwise XOR to solve this problem :
         *
         * first , we have to know the bitwise XOR in java
         *
         * 0 ^ N = N
         * N ^ N = 0
         * So..... if N is the single number
         *
         * N1 ^ N1 ^ N2 ^ N2 ^..............^ Nx ^ Nx ^ N
         *
         * = (N1^N1) ^ (N2^N2) ^..............^ (Nx^Nx) ^ N
         *
         * = 0 ^ 0 ^ ..........^ 0 ^ N
         *
         * = N
         */
        int ans = 0;

        int len = nums.length;
        for (int i = 0; i != len; i++)
            ans ^= nums[i];

        return ans;
    }

}
