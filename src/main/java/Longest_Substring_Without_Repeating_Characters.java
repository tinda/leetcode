import java.util.*;

/**
 * https://leetcode.com/problems/longest-substring-without-repeating-characters/
 * <p>
 * Given a string, find the length of the longest substring without repeating characters.
 */

public class Longest_Substring_Without_Repeating_Characters {
    public int lengthOfLongestSubstring(String s) {

        char[] chararray = s.toCharArray();

        Map<Character, Integer> map = new HashMap<>();

        int index = 0;
        int resultLength = 0;

        while (index < chararray.length) {
            char c = chararray[index];

            if (map.containsKey(c)) {
                resultLength = Math.max(resultLength, map.size());
                index = map.get(c);
                map.clear();
            } else {
                map.put(c, index);
            }
            index++;
        }

        return Math.max(resultLength, map.size());
    }
}
