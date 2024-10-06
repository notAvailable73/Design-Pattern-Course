package bevarages;

import Interfaces.IBeverage;
import Interfaces.BeverageMaker;

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
