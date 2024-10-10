package CondimentAdders;

import Interfaces.IBeverage;

public class WhiteSugarAdder extends CondimentAdder {

    public WhiteSugarAdder(IBeverage bev){
        cost = 3;
        this.beverage = bev;
    }


    @Override
    public String getDetails() {
        return beverage.getDetails() + " with extra white sugar";
    }
}
