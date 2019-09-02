import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class Longest_Substring_Without_Repeating_CharactersTest {

    @Test
    public void s_is_a_should_return_1() {
        AssertLength("a", 1);
    }

    @Test
    public void s_is_bb_should_return_1(){
        AssertLength("bb", 1);
    }

    private static void AssertLength(String s, int expected) {
        Assert.assertEquals(expected, new Longest_Substring_Without_Repeating_Characters().lengthOfLongestSubstring(s));
    }


}