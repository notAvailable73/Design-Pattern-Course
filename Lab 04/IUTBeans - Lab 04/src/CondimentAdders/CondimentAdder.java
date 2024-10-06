package CondimentAdders;

import Interfaces.IBeverage;

public abstract class CondimentAdder {
    protected IBeverage beverage;
    protected double cost;
    abstract void addCost();
    abstract void addDetails();
    
}
