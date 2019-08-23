/**
 * Given an array of integers that is already sorted in ascending order, find two numbers such that they add up to a specific target number.
 * <p>
 * The function twoSum should return indices of the two numbers such that they add up to the target, where index1 must be less than index2.
 */

public class Two_Sum_II {

    public static void main(String[] args) {

    }

    public int[] twoSum(int[] numbers, int target) {
        if (numbers.length == 0)
            return numbers;
        for (int i = 0; i < numbers.length; i++) {
            for (int j = 0; j < numbers.length; j++) {
                if ((numbers[i] + numbers[j] == target) && (i != j)) {
                    System.out.println(i + " " + j);
                    return new int[]{i+1, j+1};
                }
            }
        }

        return numbers;
    }
}
