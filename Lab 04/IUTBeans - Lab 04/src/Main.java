import CondimentAdders.MilkAdder;
import CondimentAdders.whippedCreamAdder;
import CondimentAdders.WhiteSugarAdder;
import Interfaces.IBeverage;
import bevarages.Cappuccino;
import bevarages.Espresso;
import bevarages.Latte;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {
    public static final String RESET = "\u001B[0m";
    public static final String RED = "\u001B[31m";
    public static final String GREEN = "\u001B[32m";
    public static final String YELLOW = "\u001B[33m";
    public static final String BLUE = "\u001B[34m";
    public static final String CYAN = "\u001B[36m";
    public static void main(String[] args) {

        // Initialize

        Map<Integer, IBeverage> dict = new HashMap<>();
        dict.put(1, new Cappuccino());
        dict.put(2, new Espresso());
        dict.put(3, new Latte());
//
//        Map<Integer, BeverageMaker> cond = new HashMap<>();
//        cond.put(1, new MilkAdder());
//        cond.put(2, new WhiteSugarAdder());
//        cond.put(3, new whippedCreamAdder());

        Scanner myObj = new Scanner(System.in);

        // Start
        printMenu();
        int inputForBeverageChoice = myObj.nextInt();
        IBeverage beverage = dict.get(inputForBeverageChoice);

        int inputForCondChoice = 0;

        do{
            giveSpace();
            System.out.println(YELLOW + "Order description: "+ RESET + GREEN+ beverage.getDetails()+ RESET +"\n");
            printCondiments();
            inputForCondChoice = myObj.nextInt();
            switch (inputForCondChoice){
                case 1:
                    beverage = new MilkAdder(beverage);
                    break;
                case 2:
                    beverage = new WhiteSugarAdder(beverage);
                    break;
                case 3:
                    beverage = new whippedCreamAdder(beverage);
                    break;
                default:
                    inputForCondChoice = -1;
            }
        }while(inputForCondChoice>0);




//        do {
//            giveSpace();
//            System.out.println(YELLOW + "Order description: "+ RESET + GREEN+ beverage.getDetails()+ RESET);
//            printCondiments();
//            inputForCondChoice = myObj.nextInt();
//
//            if (inputForCondChoice > 0 && inputForCondChoice <= cond.size()) {
//                BeverageMaker beverageMaker = cond.get(inputForCondChoice);
//                beverageMaker.decorate(beverage);
//            }
//        } while (inputForCondChoice > 0 && inputForCondChoice <= cond.size());
        giveSpace();
        System.out.println("Here's your drink - " + beverage.getDetails());
        System.out.println("Price - " + beverage.getPrice());
        System.out.println("Thank you for your order");
    }
/////////////////////////////////////Main Ends Here/////////////////////////////////////////////////////////
    public static void printMenu() {
        System.out.println(GREEN + "What do you want?" + RESET +
                "\n" + YELLOW + "1. Cappuccino" + RESET + "\tPrice: 20" +
                "\n" + YELLOW + "2. Espresso" + RESET + "\t\tPrice: 10" +
                "\n" + YELLOW + "3. Latte" + RESET + "\t\tPrice: 15" +
                "\nYour response: ");
    }

    public static void printCondiments() {
        System.out.println(CYAN + "Do you need any condiment?" + RESET +
                "\n" + BLUE + "1. Milk" + RESET + "\t\t\t\tCost: 2" +
                "\n" + BLUE + "2. White Sugar" + RESET + "\t\tCost: 3" +
                "\n" + BLUE + "3. Whipped Cream" + RESET + "\tCost: 5" +
                "\n" + RED + "4. No more condiment" + RESET +
                "\nYour response: ");
    }
    public static void giveSpace() {

        System.out.print("\n\n\n\n");
        clearScreen();
    }
    public static void clearScreen() {
        System.out.print("\033[H\033[2J");
        System.out.flush();
    }
}
