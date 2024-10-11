package products;

import interfaces.item;

public abstract class product implements item {
    String name;
    double price;
    String description;
    @Override
    public String getDetails() {
        return name;
    }

    @Override
    public double getPrice() {
        return price;
    }
}
