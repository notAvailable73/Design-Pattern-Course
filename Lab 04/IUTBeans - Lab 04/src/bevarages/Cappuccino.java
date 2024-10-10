package bevarages;

import Interfaces.IBeverage;

public class Cappuccino implements IBeverage {
    private String details;
    private double price;

    public Cappuccino() {
        price = 20;
        details = "Cappuccino";
    }

    @Override
    public double getPrice() {
        return price;
    }

    @Override
    public String getDetails() {
        return details;
    }

}
