package Lexicon.se.model;

public class Snack extends Product{

    int sugarPercent;


    public Snack(String name, int price,int sugarPercent) {
        super(name, price);
        this.sugarPercent = sugarPercent;
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
