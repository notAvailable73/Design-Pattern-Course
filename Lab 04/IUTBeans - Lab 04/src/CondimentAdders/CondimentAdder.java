package CondimentAdders;

import Interfaces.IBeverage;

public abstract class CondimentAdder implements IBeverage{
    protected IBeverage beverage;
    protected double cost;
    public double getPrice() {
        return beverage.getPrice()+cost;
    }
    public abstract String getDetails();
}
