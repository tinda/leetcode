/**
 * Implement function ToLowerCase() that has a string parameter str, and returns the same string in lowercase.
 * Example 1:
 * Input: "Hello"
 * Output: "hello"
 * <p>
 * Example 2:
 * Input: "here"
 * Output: "here"
 * <p>
 * Example 3:
 * Input: "LOVELY"
 * Output: "lovely"
 */

public class To_Lower_Case {

    public static void main(String[] args) {
        String input = "Hello";
        String output = "hello";
        System.out.println(toLowerCase(input));
    }

    public static String toLowerCase(String str) {
        return str.toLowerCase();
    }
}
