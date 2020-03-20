import org.junit.Assert;
import org.junit.Test;

public class Add_BinaryTest {
    @Test
    public void a_addBinary_should_be_6() {
        String a = "11";
        String b = "1";
        AssertAddBinary(a, b, "100");
    }

    private static void AssertAddBinary(String a, String b, String expected) {
        Assert.assertEquals(expected, new Add_Binary().addBinary(a, b));
    }

}