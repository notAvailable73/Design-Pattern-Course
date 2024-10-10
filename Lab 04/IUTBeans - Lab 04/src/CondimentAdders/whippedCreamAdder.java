package CondimentAdders;

import Interfaces.IBeverage;

public class whippedCreamAdder extends CondimentAdder {

    public whippedCreamAdder(IBeverage bev){
        cost = 5;
        this.beverage = bev;
    }



    @Override
    public String getDetails() {
        return beverage.getDetails() + " with extra wheaped cream";
    }
}
