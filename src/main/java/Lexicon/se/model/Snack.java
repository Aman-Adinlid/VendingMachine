package Lexicon.se.model;

public class Snack extends Product{

   private int sugarPercent;


    public int getSugarPercent() {
        return sugarPercent;
    }

    public void setSugarPercent(int sugarPercent) {
        this.sugarPercent = sugarPercent;
    }

    public Snack(String name, int price, int sugarPercent) {
        super(name, price);
        this.sugarPercent = sugarPercent;
    }

    @Override
    public String examine() {

        return getName() + " " + getSugarPercent() + " " + getPrice();

    }

    @Override
    public void use() {
        System.out.println("Enjoy");


    }

    @Override
    Product purchase(int money) {
        return null;
    }
}
