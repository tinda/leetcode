import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class Best_Time_to_Buy_and_Sell_StockTest {

    @Test
    public void prices_is_5_4_maxProfit_should_be_0() {
        int[] prices = {5, 4};
        AssertMaxProfitShouldBe(prices, 0);
    }

    private static void AssertMaxProfitShouldBe(int[] prices, int expected) {
        Assert.assertEquals(expected, new Best_Time_to_Buy_and_Sell_Stock().maxProfit(prices));
    }
}