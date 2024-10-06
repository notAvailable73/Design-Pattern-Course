package CondimentAdders;

import Interfaces.BeverageMaker;
import Interfaces.IBeverage;

public class WhiteSugarAdder extends CondimentAdder implements BeverageMaker {

    public WhiteSugarAdder(){
        cost = 3;
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
