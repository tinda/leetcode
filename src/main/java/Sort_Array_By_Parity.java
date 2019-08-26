import java.util.Arrays;

/**
 * https://leetcode.com/problems/sort-array-by-parity/
 *
 * Given an array A of non-negative integers, return an array consisting of all the even elements of A, followed by all the odd elements of A.
 *
 * You may return any answer array that satisfies this condition.
 *
 * Example 1:
 *
 * Input: [3,1,2,4]
 * Output: [2,4,3,1]
 * The outputs [4,2,3,1], [2,4,1,3], and [4,2,1,3] would also be accepted.
 */

public class Sort_Array_By_Parity {

    public static void main(String[] args) {
        int[] A = {3, 1, 2, 4};
        int[] B = sortArrayByParity(A);

        for (int b : B) {
            System.out.print(b);
        }

    }

    public static int[] sortArrayByParity(int[] A) {
        int j = 0;
        for (int i = 0; i < A.length; i++) {
            if (A[i] % 2 != 1) {
                int tmp = A[j];
                A[j] = A[i];
                A[i] = tmp;
                j++;
            }
        }
        return A;
    }

    //Approach 1: Sort
    public int[] sortArrayByParity1(int[] A) {
        Integer[] B = new Integer[A.length];
        for (int t = 0; t < A.length; ++t)
            B[t] = A[t];

        Arrays.sort(B, (a, b) -> Integer.compare(a % 2, b % 2));

        for (int t = 0; t < A.length; ++t)
            A[t] = B[t];
        return A;

        /* Alternative:
        return Arrays.stream(A)
                     .boxed()
                     .sorted((a, b) -> Integer.compare(a%2, b%2))
                     .mapToInt(i -> i)
                     .toArray();
        */
    }

    //Approach 2: Two Pass
    public int[] sortArrayByParity2(int[] A) {
        int[] ans = new int[A.length];
        int t = 0;

        for (int i = 0; i < A.length; ++i)
            if (A[i] % 2 == 0)
                ans[t++] = A[i];

        for (int i = 0; i < A.length; ++i)
            if (A[i] % 2 == 1)
                ans[t++] = A[i];

        return ans;
    }

    //Approach 3: In-Place
    public int[] sortArrayByParity3(int[] A) {
        int i = 0, j = A.length - 1;
        while (i < j) {
            if (A[i] % 2 > A[j] % 2) {
                int tmp = A[i];
                A[i] = A[j];
                A[j] = tmp;
            }

            if (A[i] % 2 == 0) i++;
            if (A[j] % 2 == 1) j--;
        }

        return A;
    }
}
