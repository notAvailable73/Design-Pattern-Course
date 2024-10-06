package bevarages;

import Interfaces.IBeverage;
import Interfaces.BeverageMaker;

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
