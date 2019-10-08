import java.util.HashMap;
import java.util.Map;

/**
 * Given a string containing just the characters '(', ')', '{', '}', '[' and ']', determine if the input string is valid.
 * <p>
 * An input string is valid if:
 * <p>
 * Open brackets must be closed by the same type of brackets.
 * Open brackets must be closed in the correct order.
 * Note that an empty string is also considered valid.
 * <p>
 * https://leetcode.com/problems/valid-parentheses/
 */

public class Valid_Parentheses {
    public static void main(String[] args) {
        String s = "()";
        String s1 = "([)]";
        String s2 = "{[]}";
        String s3 = "]";
        String s4 = "{{)}";

        System.out.println(isValid(s3));
    }

    static Map<Character, Character> mappings = new HashMap<>();

    static {
        mappings.put('(', ')');
        mappings.put('[', ']');
        mappings.put('{', '}');
    }

    public static boolean isValid(String s) {
        java.util.Stack<Character> st = new java.util.Stack<Character>();
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (mappings.containsKey(c)) {
                st.push(mappings.get(c));
            } else if (mappings.containsValue(c)) {
                if (st.isEmpty() || st.pop() != c) {
                    return false;
                }
            }
        }
        return st.isEmpty();
    }
}
