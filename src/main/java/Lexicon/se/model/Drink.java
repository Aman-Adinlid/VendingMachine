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
        String Information =getProductNumber()+ "  "+ getName() + " " + getVolume() + " " + getPrice();
        return Information;

    }

    @Override
    public String use() {
       String consume = " you had a drink";
       return consume;


    }

    @Override
    public int getProductNumber() {
        return super.getProductNumber();
    }
}
