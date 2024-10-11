package bundles;

import interfaces.item;

import java.util.ArrayList;
import java.util.List;


public abstract class bundles implements item {

    List<item> items = new ArrayList<item>() ;
    abstract void build();
    String name;
    @Override
    public String getDetails() {
        StringBuilder detail = new StringBuilder();
        for(item i : items){
            detail.append(i.getDetails() + ",");
        }
        detail.deleteCharAt(detail.length()-1);


        return detail.toString();
    }

    @Override
    public double getPrice() {
        double totalPrice = 0;
        for (item i:items){
            totalPrice+= i.getPrice();
        }
        return totalPrice;
    }
}
