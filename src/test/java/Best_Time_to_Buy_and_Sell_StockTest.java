import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class Best_Time_to_Buy_and_Sell_StockTest {

    @Test
    public void prices_is_5_4_maxProfit_should_be_0() {
        int[] prices = {5, 4};
        AssertMaxProfitShouldBe(prices, 0);
    }

    @Test
    public void prices_is_4_6_maxProfit_should_be_2() {
        int[] prices = {4, 6};
        AssertMaxProfitShouldBe(prices, 2);
    }

    @Test
    public void prices_is_4_6_7_maxProfit_should_be_3() {
        int[] prices = {4, 6};
        AssertMaxProfitShouldBe(prices, 3);
    }

    @Test
    public void prices_is_4_7_6_9_3_maxProfit_should_be_5() {
        int[] prices = {4, 7, 6, 9, 3};
        AssertMaxProfitShouldBe(prices, 5);
    }

    @Test
    public void prices_is_4_1_7_maxProfit_should_be_6() {
        int[] prices = {4, 1, 7};
        AssertMaxProfitShouldBe(prices, 6);
    }

    private static void AssertMaxProfitShouldBe(int[] prices, int expected) {
        Assert.assertEquals(expected, new Best_Time_to_Buy_and_Sell_Stock().maxProfit(prices));
    }
}