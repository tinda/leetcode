import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class Best_Time_to_Buy_and_Sell_StockTest {

    @Test
    public void prices_is_5_4_maxProfit_should_be_0() {
        int[] prices = {5, 4};
        Assert.assertEquals(0, new Best_Time_to_Buy_and_Sell_Stock().maxProfit(prices));
    }
}