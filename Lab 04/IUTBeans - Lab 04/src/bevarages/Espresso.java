package bevarages;

import Interfaces.IBeverage;

public class Espresso implements IBeverage {

    private String details;
    private double price;

    public Espresso() {
        price = 10;
        details = "Espresso";
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
