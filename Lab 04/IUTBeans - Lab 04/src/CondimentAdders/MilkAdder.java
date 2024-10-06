package CondimentAdders;

import Interfaces.IBeverage;
import Interfaces.BeverageMaker;

public class MilkAdder extends CondimentAdder implements BeverageMaker {


    public MilkAdder(){
        cost = 2;
    }
    @Override
    void addCost() {
        beverage.addPrice(cost);
    }


    @Override
    void addDetails() {
        beverage.addDetails("with extra milk");

    }

    @Override
    public void decorate(IBeverage bev) {
        beverage = bev;
        addCost();
        addDetails();
    }
}
