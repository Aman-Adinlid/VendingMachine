package Lexicon.se.model;

public class Food extends Product{

    int calories;


    public Food(String name, int price, int calories) {
        super(name, price);
        this.calories = calories;
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
