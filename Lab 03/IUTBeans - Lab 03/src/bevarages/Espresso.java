package bevarages;

import Interfaces.IBeverage;

public class Espresso implements IBeverage {
    @Override
    public double getPrice() {
        return 15;
    }

}
