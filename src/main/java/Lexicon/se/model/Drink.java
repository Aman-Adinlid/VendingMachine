package Lexicon.se.model;

public class Drink extends Product {


    private String volume;

    public Drink(int productNumber, String name, int price, String volume) {
        super(productNumber, name, price);
        this.volume = volume;
    }

    public String getVolume() {
        return volume;
    }

    public void setVolume(String volume) {
        this.volume = volume;
    }

    @Override
    public String examine() {
        return getName() + " " + getVolume() + " " + getPrice();

    }

    @Override
    public void use() {
        // todo:  consume the product
        System.out.println(" you had a drink" + super.getName());


    }


}
