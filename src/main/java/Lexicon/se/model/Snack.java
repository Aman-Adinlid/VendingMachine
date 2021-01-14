package Lexicon.se.model;

public class Snack extends Product{

   private int sugarPercent;


    public int getSugarPercent() {
        return sugarPercent;
    }

    public void setSugarPercent(int sugarPercent) {
        this.sugarPercent = sugarPercent;
    }

    public Snack(int productNumber, String name, int price, int sugarPercent) {
        super(productNumber, name, price);
        this.sugarPercent = sugarPercent;
    }

    @Override
    public String examine() {

        String Information =getProductNumber() + " " + getName() + " " + getSugarPercent() + " " + getPrice();
        return Information;

    }

    @Override
    public String use() {
     String consume = "Enjoy";
     return consume;


    }

    @Override
    public int getProductNumber() {
        return super.getProductNumber();
    }
}
