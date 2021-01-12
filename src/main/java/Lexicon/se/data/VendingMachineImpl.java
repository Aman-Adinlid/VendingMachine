package Lexicon.se.data;

import Lexicon.se.model.Drink;
import Lexicon.se.model.Food;
import Lexicon.se.model.Product;
import Lexicon.se.model.Snack;

public class VendingMachineImpl implements VendingMachine {

    private int[] denominations = new int[]{1, 5, 10, 20, 50, 100, 500, 1000};
    private Product[] products;
    private int money;

    public VendingMachineImpl(Product[] products) {
        this.products = products;
    }

    public VendingMachineImpl() {

        Product.resetALL();
        products = new Product[3];
        products[0] = new Food("Potato", 10, 100);
        products[1] = new Snack("PopCorn", 20, 5);
        products[2] = new Drink("SevenUp", 8, "4.5");


    }



    @Override
    public boolean addCurrency(int amount) {
      return false;
    }

    @Override
    public Product request(int productNumber) {
        return null;
    }

    @Override
    public int endSession() {
        return 0;
    }

    @Override
    public String getDescription(int productNumber) {
        return null;
    }

    @Override
    public int getBalance() {
        return 0;
    }

    @Override
    public String[] getProducts() {
        return new String[0];
    }
}
