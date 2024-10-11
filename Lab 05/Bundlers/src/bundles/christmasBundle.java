package bundles;

import products.Laptop;
import products.penDrive;

public class christmasBundle extends bundles{

    public christmasBundle(){
        build();
        name = "Christmas Bundle";
    }

    @Override
    void build() {
        items.add(new Laptop());
        items.add(new penDrive());
    }

}
