import org.junit.Test;

import static org.junit.Assert.*;

public class To_Lower_CaseTest {

    @Test
    public void test() {
        To_Lower_Case to_lower_case = new To_Lower_Case();
        String input = "Hello";
        String output = "hello";
        assertEquals(to_lower_case.toLowerCase(input), output);
    }
}