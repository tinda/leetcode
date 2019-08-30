import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * https://leetcode.com/problems/length-of-last-word/#/description
 * <p>
 * Given a string s consists of upper/lower-case alphabets and empty space characters ' ', return the length of last word in the string.
 * <p>
 * If the last word does not exist, return 0.
 * <p>
 * Note: A word is defined as a character sequence consists of non-space characters only.
 * <p>
 * Example:
 * <p>
 * Input: "Hello World"
 * Output: 5
 */
public class Length_of_Last_WordTest {

    @Test
    public void s_is_bc_should_return_2() {
        String s = "bc";

        LastWordLengthShouldBe(s, 2);
    }

    @Test
    public void s_is_bc_and_3_space_should_return_2() {
        LastWordLengthShouldBe("bc ", 2);
    }

    @Test
    public void s_is_bc_space_xyz_should_return_3() {
        LastWordLengthShouldBe("bc xyz", 3);
    }

    @Test
    public void s_is_space_a_should_return_1(){
        LastWordLengthShouldBe(" a", 1);
    }

    @Test
    public void s_is_should_return_0(){
        LastWordLengthShouldBe("", 0);
    }

    private static void LastWordLengthShouldBe(String s, int expected) {
        Assert.assertSame(expected, new Length_of_Last_Word().lengthOfLastWord(s));
    }
}