import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class Longest_Substring_Without_Repeating_CharactersTest {

    // step 1
    @Test
    public void s_is_a_should_return_1() {
        AssertLength("a", 1);
        /*
            String s = "a";
            Assert.assertEquals(1, new Longest_Substring_Without_Repeating_Characters().lengthOfLongestSubstring(s));
         */
    }

    // step 2
    @Test
    public void s_is_bb_should_return_1(){
        AssertLength("bb", 1);
    }

    // step 3
    @Test
    public void s_is_pwwkew_length_should_be_3(){
        AssertLength("pwwkew", 3);
    }

    // step 4
    @Test
    public void s_is_dvdf_length_should_be_3(){
        AssertLength("dvdf", 3);
    }

    private static void AssertLength(String s, int expected) {
        Assert.assertEquals(expected, new Longest_Substring_Without_Repeating_Characters().lengthOfLongestSubstring(s));
    }


}