package by.andrey.twikss.exer4stock.service;

import by.andrey.twikss.exer4stock.bean.Stock;
import org.slf4j.LoggerFactory;
import org.slf4j.Logger;

public class StockServer {
    private Stock stock;
    private Logger logger = LoggerFactory.getLogger(StockServer.class);

    public StockServer(Stock stock) {
        this.stock = stock;
    }

    public void printInformation (){
        String infoStock = "Company = " + stock.getCompany() +
                ", Current price = " + stock.getCurrentPrice() +
                ", Min price = " + stock.getMinPrice() +
                ", Max price = " + stock.getMaxPrice();
        logger.info(infoStock);
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
