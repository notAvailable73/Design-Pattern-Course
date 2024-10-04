package Condiments;

import Interfaces.ICondiment;

public class Milk implements ICondiment {
    @Override
    public double Cost() {
        return 15;
    }

}
