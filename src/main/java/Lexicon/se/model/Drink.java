package Lexicon.se.model;

public class Drink extends Product {


    String volume;

    public Drink(String name, int price, String volume) {
        super(name, price);
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
        return null;
    }

    @Override
    public void use() {

    }

    @Override
    Product purchase(int money) {
        return null;
    }
}
