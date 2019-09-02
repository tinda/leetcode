import java.util.HashSet;

/**
 * https://leetcode.com/problems/longest-substring-without-repeating-characters/
 * <p>
 * Given a string, find the length of the longest substring without repeating characters.
 */

public class Longest_Substring_Without_Repeating_Characters {
    public int lengthOfLongestSubstring(String s) {

        char[] chararray = s.toCharArray();

        if (chararray.length == 1) {
            return 1;
        }

        HashSet set = new HashSet();

        int index = 0;
        int resultLength = 0;

        while (index < chararray.length) {
            char c = chararray[index];
            if (!set.add(c)) {
                resultLength = Math.max(resultLength, set.size());
                set.clear();
                //當發現字母重複時，目前 HashSet 所代表的字段長度與目前暫存的最大長度，取最大值暫存後，清除 HashSet 以存放下一個不重複字母的字段。
                continue;
            }
            index++;
        }

        return Math.max(resultLength, set.size());
    }
}
