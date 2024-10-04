package bevarages;

import Interfaces.IBeverage;

public class Cappuccino implements IBeverage {
    @Override
    public double getPrice() {
        return 10;
    }
}
