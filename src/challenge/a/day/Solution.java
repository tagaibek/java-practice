package challenge.a.day;

import org.junit.Test;
import org.junit.runner.JUnitCore;
import org.junit.runner.Result;
import org.junit.runner.notification.Failure;

import static org.junit.Assert.assertEquals;

public class Solution {

    private static int getMaxProfit(int[] stockPrices) {
        if (stockPrices.length < 2) {
            throw new IllegalArgumentException("total stock prices cannot be less than 2");
        }

        int maxProfit = stockPrices[1] - stockPrices[0];
        int buyPrice = stockPrices[0];

        for (int i = 1; i < stockPrices.length; i++) {
            final int currentPrice = stockPrices[i];
            final int currentProfit = currentPrice - buyPrice;

            if (currentProfit > maxProfit) {
                maxProfit = currentProfit;
            }

            if (currentPrice < buyPrice) {
                buyPrice = currentPrice;
            }
        }

        return maxProfit;
    }

    @Test
    public void priceGoesUpThenDownTest1() {
        final int actual = getMaxProfit(new int[]{2, 5, 1, 3});
        final int expected = 3;
        assertEquals(expected, actual);
    }

    @Test
    public void priceGoesUpThenDownTest() {
        final int actual = getMaxProfit(new int[]{1, 5, 3, 2});
        final int expected = 4;
        assertEquals(expected, actual);
    }

    @Test
    public void priceGoesDownThenUpTest() {
        final int actual = getMaxProfit(new int[]{7, 2, 8, 9});
        final int expected = 7;
        assertEquals(expected, actual);
    }

    @Test
    public void priceGoesDownThenUpTest2() {
        final int actual = getMaxProfit(new int[]{9, 4, 2, 4});
        final int expected = 2;
        assertEquals(expected, actual);
    }

    @Test
    public void priceGoesUpAllDayTest() {
        final int actual = getMaxProfit(new int[]{1, 6, 7, 9});
        final int expected = 8;
        assertEquals(expected, actual);
    }

    @Test
    public void priceGoesDownAllDayTest() {
        final int actual = getMaxProfit(new int[]{9, 7, 4, 1});
        final int expected = -2;
        assertEquals(expected, actual);
    }

    @Test
    public void priceGoesDownAllDayTest2() {
        final int actual = getMaxProfit(new int[]{10, 5, 1});
        final int expected = -4;
        assertEquals(expected, actual);
    }

    @Test
    public void priceGoesDownAllDayTest3() {
        final int actual = getMaxProfit(new int[]{9, 7, 4, 3});
        final int expected = -1;
        assertEquals(expected, actual);
    }

    @Test
    public void priceStaysTheSameAllDayTest() {
        final int actual = getMaxProfit(new int[]{1, 1, 1, 1});
        final int expected = 0;
        assertEquals(expected, actual);
    }

    @Test(expected = Exception.class)
    public void exceptionWithOnePriceTest() {
        getMaxProfit(new int[]{5});
    }

    @Test(expected = Exception.class)
    public void exceptionWithEmptyPricesTest() {
        getMaxProfit(new int[]{});
    }

    //from the channel
    @Test
    public void custom1() {
        final int actual = getMaxProfit(new int[]{2, 5, 6, 3});
        final int expected = 4;
        assertEquals(expected, actual);
    }

    public static void main(String[] args) {
        Result result = JUnitCore.runClasses(Solution.class);
        for (Failure failure : result.getFailures()) {
            System.out.println(failure.toString());
        }
        if (result.wasSuccessful()) {
            System.out.println("All tests passed.");
        }
    }
}