package bevarages;

import Interfaces.IBeverage;

public class Latte implements IBeverage {
    private String details;
    private double price;

    public Latte() {
        price = 15;
        details = "Latte";
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
