package by.andrey.twikss.exer4stock.service;

import by.andrey.twikss.exer4stock.bean.Stock;
import junit.framework.TestCase;
import org.junit.Test;

public class StockServerTest extends TestCase {

    @Test
    public void testUpdatePriceNewPriceMoreThanMaxPrice() {
        Stock stock = new Stock("Беларусхерний", 5);
        StockServer stockServer = new StockServer(stock);
        stockServer.updatePrice(7);

        boolean expected = true;
        boolean actual = (stock.getMaxPrice() == 7 ) && (stock.getCurrentPrice() == 7);

        assertEquals(expected,actual);
    }

    @Test
    public void testUpdatePriceNewPriceLessThanMinPrice() {
        Stock stock = new Stock("Беларусхерний", 5);
        StockServer stockServer = new StockServer(stock);
        stockServer.updatePrice(1);

        boolean expected = true;
        boolean actual = (stock.getMinPrice() == 1 ) && (stock.getCurrentPrice() == 1);

        assertEquals(expected,actual);
    }

    @Test
    public void testUpdatePriceNewPriceBetweenMinPriceAndMaxPrice() {
        Stock stock = new Stock("Беларусхерний", 5);
        StockServer stockServer = new StockServer(stock);
        stockServer.updatePrice(1);
        stockServer.updatePrice(10);
        stockServer.updatePrice(7);

        System.out.println(stock.toString());

        boolean expected = true;
        boolean actual = (stock.getCurrentPrice() == 7);

        assertEquals(expected,actual);
    }
}