
import Interfaces.IBeverage;
import bevarages.Cappuccino;
import bevarages.Espresso;
import bevarages.Latte;

import java.util.Dictionary;
import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        // initialize
        Dictionary<Integer, IBeverage> dict = null;
        dict.put(1, new Cappuccino());
        dict.put(2, new Espresso());
        dict.put(3, new Latte());
        Scanner myObj = new Scanner(System.in);



        // start
        printCondaments();
        int inputForBeverageChoice = myObj.nextInt();
        IBeverage beverage = dict.get(inputForBeverageChoice);


    }
    public static void printMenu(){
        System.out.println("What do you want?" +
                "\n1. Cappuccino" +
                "\n2. Espresso" +
                "\n3. Latte" +
                "\nYour response: ");
    }
    public static void printCondaments(){
        System.out.println("Do you need any condament?" +
                "\n1. Milk" +
                "\n2. Whipped Cream" +
                "\n3. White Suger" +
                "\n4. No more condament" +
                "\nYour response: ");
    }

}