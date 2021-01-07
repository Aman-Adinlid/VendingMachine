package Lexicon.se;


import Lexicon.se.model.Product;

public class VendingMachineImpl implements VendingMachine{

    int[] denominations;
    Product[] products;
    private int moneyPool;

    private Product[] theProducts = new Product[0];

    public VendingMachineImpl(Product[] products) {
        this.products = products;
    }

    @Override
    public boolean addMoney(int money) {
        return false;
    }

    @Override
    public Product buy(int money, int prodNum) {
        return null;
    }

    @Override
    public int returnChange() {
        return 0;
    }

    @Override
    public void presentProducts() {

    }

    @Override
    public int getBalance() {
        return 0;
    }
}
