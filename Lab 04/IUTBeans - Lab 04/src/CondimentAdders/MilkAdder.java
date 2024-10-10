package CondimentAdders;

import Interfaces.IBeverage;

public class MilkAdder extends CondimentAdder {


    public MilkAdder(IBeverage bev){
        cost = 2;
        this.beverage = bev;
    }

    @Override
    public String getDetails() {
        return beverage.getDetails() + " with extra milk";
    }
}
