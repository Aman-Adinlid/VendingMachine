package Lexicon.se.data;

import Lexicon.se.model.Product;

public interface VendingMachine {

    public boolean addCurrency(int amount);

    public Product request(int productNumber);

    public int endSession();

    public String getDescription(int productNumber);

    public int getBalance();

    public String[] getProducts();

}
