package CondimentAdders;

import Interfaces.BeverageMaker;
import Interfaces.IBeverage;

public class WheapedCreamAdder extends CondimentAdder implements BeverageMaker {

    public WheapedCreamAdder(){
        cost = 5;
    }
    @Override
    void addCost() {
        beverage.addPrice(cost);
    }

    @Override
    void addDetails() {
        beverage.addDetails("with extra white sugar");
    }

    @Override
    public void decorate(IBeverage bev) {
        beverage = bev;
        addCost();
        addDetails();
    }
}
