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

        return getName() + " " + getSugarPercent() + " " + getPrice();

    }

    @Override
    public void use() {
        System.out.println("Enjoy" + super.getName());


    }

}
