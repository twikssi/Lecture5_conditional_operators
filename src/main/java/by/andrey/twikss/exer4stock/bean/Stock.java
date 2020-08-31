package by.andrey.twikss.exer4stock.bean;

import java.util.Objects;

public class Stock {
    private String company;
    private int currentPrice;
    private int minPrice;
    private int maxPrice;

    public Stock(String company, int currentPrice) {
        this.company = company;
        this.currentPrice = currentPrice;
        this.minPrice = currentPrice;
        this.maxPrice = currentPrice;
    }

    public String getCompany() {
        return company;
    }

    public void setCompany(String company) {
        this.company = company;
    }

    public int getCurrentPrice() {
        return currentPrice;
    }

    public void setCurrentPrice(int currentPrice) {
        this.currentPrice = currentPrice;
    }

    public int getMinPrice() {
        return minPrice;
    }

    public void setMinPrice(int minPrice) {
        this.minPrice = minPrice;
    }

    public int getMaxPrice() {
        return maxPrice;
    }

    public void setMaxPrice(int maxPrice) {
        this.maxPrice = maxPrice;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Stock stock = (Stock) o;
        return currentPrice == stock.currentPrice &&
                minPrice == stock.minPrice &&
                maxPrice == stock.maxPrice &&
                Objects.equals(company, stock.company);
    }

    @Override
    public int hashCode() {
        return Objects.hash(company, currentPrice, minPrice, maxPrice);
    }

    @Override
    public String toString() {
        return "Stock{" +
                "company='" + company + '\'' +
                ", currentPrice=" + currentPrice +
                ", minPrice=" + minPrice +
                ", maxPrice=" + maxPrice +
                '}';
    }
}
