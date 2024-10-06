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

    @Override
    public void addPrice(double extraCost) {
        if (extraCost < 0) {
            return;
        } else {
            price += extraCost;
        }
    }

    @Override
    public void addDetails(String s) {
        details = details + " " + s;
    }

}
