package by.andrey.twikss.exer4stock.service;

import by.andrey.twikss.exer4stock.bean.Stock;

public class StockServer {
    private Stock stock;

    public StockServer(Stock stock) {
        this.stock = stock;
    }

    public void updatePrice(int newPrice){
        if (newPrice > stock.getMaxPrice()){
            stock.setMaxPrice(newPrice);
            stock.setCurrentPrice(newPrice);
        } else if (newPrice < stock.getMinPrice()){
            stock.setMinPrice(newPrice);
            stock.setCurrentPrice(newPrice);
        } else {
            stock.setCurrentPrice(newPrice);
        }
    }
}
