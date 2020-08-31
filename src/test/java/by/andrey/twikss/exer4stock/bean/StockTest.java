package by.andrey.twikss.exer4stock.bean;

import junit.framework.TestCase;
import org.junit.Test;

public class StockTest extends TestCase {

    @Test
    public void testTestEqualsReturnTrue() {
        Stock stock1 = new Stock("Буларусхерний",14);
        Stock stock2 = new Stock("Буларусхерний",14);

        boolean expected = true;
        boolean actual = stock1.equals(stock2);

        assertEquals(expected,actual);
    }

    @Test
    public void testTestEqualsReturnFalse() {
        Stock stock1 = new Stock("Буларусхерний",14);
        Stock stock2 = new Stock("Буларусхерний",0);

        boolean expected = false;
        boolean actual = stock1.equals(stock2);

        assertEquals(expected,actual);
    }

    @Test
    public void testTestHashCode() {
        Stock stock = new Stock("Буларусхерний",0);

        int expected = 1109219388;
        int actual = stock.hashCode();

        assertEquals(expected,actual);
    }

    @Test
    public void testTestToString() {
        Stock stock = new Stock("Буларусхерний",0);

        String expected = "Stock{company='Буларусхерний', currentPrice=0, minPrice=0, maxPrice=0}";
        String actual = stock.toString();

        assertEquals(expected,actual);
    }
}