package Lexicon.se;

import Lexicon.se.model.Drink;
import Lexicon.se.model.Food;
import Lexicon.se.model.Product;
import Lexicon.se.model.Snack;

public abstract class VendingMachineImpl implements VendingMachine{



    int[] denominations = new int[]{1, 2, 5, 10, 20, 50, 100, 200, 500, 1000};
    Product[] products = new Product[]{
            new Drink("sevenUp", 20, " 150cl"),
            new Food("Potato",50,200),
            new Snack("popCorn",100,50),
    };
    private int moneyPool;
    boolean addMoney = true;
    public boolean addMoney(int money) {


        for (int denomination : denominations) {
            if (denomination == money) {
                moneyPool = moneyPool + money;
                return true;
            }

        }
        return false;
    }

}
