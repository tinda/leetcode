/**
 * https://leetcode.com/problems/climbing-stairs/
 *
 * You are climbing a stair case. It takes n steps to reach to the top.
 * <p>
 * Each time you can either climb 1 or 2 steps. In how many distinct ways can you climb to the top?
 * <p>
 * Note: Given n will be a positive integer.
 *
 * 參考:https://ithelp.ithome.com.tw/articles/10213272
 */

public class Climbing_Stairs {

    public static void main(String[] args) {
        int x = 2;
    }

    public int climbStairs(int n) {
        if(n <= 2) return n;
        int[] res = new int[n];
        res[1-1] = 1;
        res[2-1] = 2;
        for(int i = 3; i <= n; i++) {
            res[i-1] = res[i-1-1] + res[i-2-1];
        }
        return res[n-1];
    }

}
