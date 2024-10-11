package bundles;

import products.Laptop;
import products.mouse;
import products.penDrive;

public class newYearBundle extends bundles {

    public newYearBundle() {
        build();
        name = "new Year Bundle";
    }

    @Override
    void build() {
        items.add(new christmasBundle());
        items.add(new mouse());
    }
}