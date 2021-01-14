package Lexicon.se.model;

public abstract class Product {

    private final int productNumber;
    private String name;
    private int price;

    public Product(int productNumber, String name, int price) {
        this.productNumber = productNumber;
        this.name = name;
        this.price = price;
    }


    public abstract String examine();

    public abstract String use();


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPrice() {
        return price;
    }


    public void setPrice(int price) {
        this.price = price;
    }

    public int getProductNumber() {
        return this.productNumber;
    }
}


