package bevarages;

import Interfaces.IBeverage;

public class Latte implements IBeverage {
    @Override
    public double getPrice() {
        return 25;
    }
}
