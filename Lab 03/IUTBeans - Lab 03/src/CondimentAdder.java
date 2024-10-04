import Interfaces.IBeverage;
import Interfaces.ICondiment;

public class CondimentAdder {
    ICondiment condiment;
    IBeverage beverage;
    public CondimentAdder(IBeverage bev, ICondiment cond){
        condiment = cond;
    }
    void addCost(){
        condiment.Cost();
    }
}
