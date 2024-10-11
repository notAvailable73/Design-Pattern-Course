import bundles.christmasBundle;
import bundles.newYearBundle;
import products.Laptop;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        christmasBundle cbundle = new christmasBundle();
        System.out.println(cbundle.getDetails());
        System.out.println("price: " + cbundle.getPrice());

        newYearBundle nybundle = new newYearBundle();
        System.out.println(nybundle.getDetails());
        System.out.println("price: " + nybundle.getPrice());


        Laptop laptop = new Laptop();
        System.out.println(laptop.getDetails());
        System.out.println("price: " + laptop.getPrice());
    }
}