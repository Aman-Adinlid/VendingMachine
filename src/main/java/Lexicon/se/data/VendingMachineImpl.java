package Lexicon.se.data;

import Lexicon.se.model.Drink;
import Lexicon.se.model.Food;
import Lexicon.se.model.Product;
import Lexicon.se.model.Snack;

public class VendingMachineImpl implements VendingMachine {

    private int[] denominations = new int[]{1, 5, 10, 20, 50, 100, 500, 1000};
    private static Product[] products = {

            new Food(1, "Potato", 10, 100),
            new Snack(2, "PopCorn", 20, 5),
            new Drink(3, "SevenUp", 50, "big"),

    };

    private int moneyPool;
    private int depositPool;

    public int getMoneyPool() {
        return moneyPool;
    }

    public void setMoneyPool(int moneyPool) {
        this.moneyPool = moneyPool;
    }

    public int getDepositPool() {
        return depositPool;
    }

    public void setDepositPool(int depositPool) {
        this.depositPool = depositPool;
    }

    @Override
    public void addCurrency(int amount) {

        if (amount > 0) {
            this.depositPool += amount;
            System.out.println("Add to the deposit pool " + amount);

        } else {
            this.depositPool = 0;


        }
    }

    @Override
    public Product request(int productNumber) {
        Product product = products[productNumber - 1];
        this.depositPool = this.depositPool - product.getPrice();
        System.out.println("Buy a Product" + product.getName());
        return product;
    }


    @Override
    public int endSession () {
        // check the balance
        // rest deposit pool
        // return
        depositPool = 0;
        if (getBalance() > 0){
            return getBalance();
        }

        return depositPool;

    }

    @Override
    public String getDescription(int productNumber) {
        System.out.println("View a product description");
        return products[productNumber - 1].examine();
    }

    @Override
    public int getBalance() {
        return depositPool;
    }

    @Override
    public String[] getProducts() {
        String[] tempProducts = new String[products.length];
        for (int i = 0; i < tempProducts.length; i++) {
            tempProducts[i] = products[i].getProductNumber() + " " + products[i].getName();
        }
        return tempProducts;
    }


}
